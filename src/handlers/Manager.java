package handlers;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends LimitedApprover {
    @Override
    protected String getName() {
        return "Manager";
    }

    @Override
    protected double getConsumablesLimit() {
        return 300;
    }

    @Override
    protected double getClericalLimit() {
        return 500;
    }

    @Override
    protected double getGadgetsLimit() {
        return 1000;
    }

    @Override
    protected double getGamingLimit() {
        return 3000;
    }

    @Override
    protected double getPCLimit() {
        return 5000;
    }
}
