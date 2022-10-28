package handlers;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends LimitedApprover {

    @Override
    protected String getName() {
        return "Director";
    }

    @Override
    protected double getConsumablesLimit() {
        return 500;
    }

    @Override
    protected double getClericalLimit() {
        return 1000;
    }

    @Override
    protected double getGadgetsLimit() {
        return 1500;
    }

    @Override
    protected double getGamingLimit() {
        return 3500;
    }

    @Override
    protected double getPCLimit() {
        return 6000;
    }
}
