package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Vice President.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        double limit;

        switch(type) {
            case CONSUMABLES:
                limit = 700;
                break;
            case CLERICAL:
                limit = 1500;
                break;
            case GADGETS:
                limit = 2000;
                break;
            case GAMING:
                limit = 4500;
                break;
            case PC:
                limit = 6500;
                break;
            default:
                return false;
        }

        return cost <= limit;
    }
}
