package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than President.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        double limit;

        switch(type) {
            case CONSUMABLES:
                limit = 1000;
                break;
            case CLERICAL:
                limit = 2000;
                break;
            case GADGETS:
                limit = 3000;
                break;
            case GAMING:
                limit = 5000;
                break;
            case PC:
                limit = 8000;
                break;
            default:
                return false;
        }

        return cost <= limit;
    }
}
