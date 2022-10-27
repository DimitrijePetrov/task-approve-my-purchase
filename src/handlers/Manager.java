package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (cost <= 0) {
            System.out.println("Invalid purchase with id " + id + " that costs " + cost + ": cost cannot be less than 0");
            return;
        }

        if (canApprove(id, cost, type)) {
            System.out.println("Manager approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Manager.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        double limit;

        switch(type) {
            case CONSUMABLES:
                limit = 300;
                break;
            case CLERICAL:
                limit = 500;
                break;
            case GADGETS:
                limit = 1000;
                break;
            case GAMING:
                limit = 3000;
                break;
            case PC:
                limit = 5000;
                break;
            default:
                return false;
        }

        return cost <= limit;
    }
}
