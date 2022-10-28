package handlers;

import common.PurchaseRequest;

public abstract class Approver {
    protected Approver next;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(PurchaseRequest request);
    protected abstract boolean canApprove(PurchaseRequest request);

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
