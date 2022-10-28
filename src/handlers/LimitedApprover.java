package handlers;

import common.PurchaseLogger;
import common.PurchaseRequest;

public abstract class LimitedApprover extends Approver {
    @Override
    public void approve(PurchaseRequest request) {
        if (request.getCost() <= 0) {
            PurchaseLogger.logPurchaseInvalid(request.getId(), request.getCost());
            return;
        }

        if (canApprove(request)) {
            PurchaseLogger.logPurchaseApproved(getName(), request.getId(), request.getCost());
            return;
        }

        PurchaseLogger.logPurchaseNotApproved(getName(), request.getId());
        next.approve(request);
    }

    @Override
    protected boolean canApprove(PurchaseRequest request) {
        double limit;

        switch(request.getType()) {
            case CONSUMABLES:
                limit = getConsumablesLimit();
                break;
            case CLERICAL:
                limit = getClericalLimit();
                break;
            case GADGETS:
                limit = getGadgetsLimit();
                break;
            case GAMING:
                limit = getGamingLimit();
                break;
            case PC:
                limit = getPCLimit();
                break;
            default:
                return false;
        }

        return request.getCost() <= limit;
    }

    protected abstract String getName();
    protected abstract double getConsumablesLimit();
    protected abstract double getClericalLimit();
    protected abstract double getGadgetsLimit();
    protected abstract double getGamingLimit();
    protected abstract double getPCLimit();
}
