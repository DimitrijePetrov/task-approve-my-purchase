package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        double limit;

        switch(type) {
            case CONSUMABLES:
                limit = 500;
                break;
            case CLERICAL:
                limit = 1000;
                break;
            case GADGETS:
                limit = 1500;
                break;
            case GAMING:
                limit = 3500;
                break;
            case PC:
                limit = 6000;
                break;
            default:
                return false;
        }

        return cost <= limit;
    }
}
