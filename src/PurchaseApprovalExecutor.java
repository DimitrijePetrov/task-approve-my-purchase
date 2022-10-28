import common.PurchaseRequest;
import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

//        manager.approve(new Request(1, 15000, Type.CONSUMABLES));
//        manager.approve(new Request(2, 5000, Type.PC));
//        manager.approve(new Request(3, 5000, Type.PC));
//        manager.approve(new Request(4, 3000, Type.CLERICAL));

        manager.approve(new PurchaseRequest(1, 299, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(2, 500, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(3, 999, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(4, 3000, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(5, 4999, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new PurchaseRequest(6, 500, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(7, 999, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(8, 1500, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(9, 3499, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(10, 6000, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new PurchaseRequest(11, 699, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(12, 1500, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(13, 1999, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(14, 4500, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(15, 6499, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new PurchaseRequest(16, 1000, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(17, 1999, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(18, 3000, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(19, 4999, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(20, 8000, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new PurchaseRequest(21, 2000, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(22, 2999, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(23, 3000, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(24, 5999, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new PurchaseRequest(25, 9000, Type.PC));
    }
}
