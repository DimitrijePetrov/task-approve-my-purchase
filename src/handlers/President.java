package handlers;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends LimitedApprover {
    @Override
    protected String getName() {
        return "President";
    }

    @Override
    protected double getConsumablesLimit() {
        return 1000;
    }

    @Override
    protected double getClericalLimit() {
        return 2000;
    }

    @Override
    protected double getGadgetsLimit() {
        return 3000;
    }

    @Override
    protected double getGamingLimit() {
        return 5000;
    }

    @Override
    protected double getPCLimit() {
        return 8000;
    }
}
