package handlers;

import common.Type;

public abstract class LimitedApprover extends Approver {
    protected abstract String getName();
    protected abstract double getConsumablesLimit();
    protected abstract double getClericalLimit();
    protected abstract double getGadgetsLimit();
    protected abstract double getGamingLimit();
    protected abstract double getPCLimit();

    @Override
    public void approve(int id, double cost, Type type) {
        if (cost <= 0) {
            System.out.println("Invalid purchase with id " + id + " that costs " + cost + ": cost cannot be less than 0");
            return;
        }

        if (canApprove(id, cost, type)) {
            System.out.println(getName() + " approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than " + getName() + ".");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        double limit;

        switch(type) {
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

        return cost <= limit;
    }
}
