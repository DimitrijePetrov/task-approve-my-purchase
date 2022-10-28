package handlers;

import common.Request;

public abstract class LimitedApprover extends Approver {@Override
    public void approve(Request request) {
        if (request.getCost() <= 0) {
            System.out.println("Invalid purchase with id " + request.getId() + " that costs " + request.getCost() + ": cost cannot be less than 0");
            return;
        }

        if (canApprove(request)) {
            System.out.println(getName() + " approved purchase with id " + request.getId() + " that costs " + request.getCost());
            return;
        }

        System.out.println("Purchase with id " + request.getId() + " needs approval from higher position than " + getName() + ".");
        next.approve(request);
    }

    @Override
    protected boolean canApprove(Request request) {
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
