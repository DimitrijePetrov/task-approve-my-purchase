package handlers;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends LimitedApprover {
    @Override
    protected String getName() {
        return "Vice President";
    }

    @Override
    protected double getConsumablesLimit() {
        return 700;
    }

    @Override
    protected double getClericalLimit() {
        return 1500;
    }

    @Override
    protected double getGadgetsLimit() {
        return 2000;
    }

    @Override
    protected double getGamingLimit() {
        return 4500;
    }

    @Override
    protected double getPCLimit() {
        return 6500;
    }
}
