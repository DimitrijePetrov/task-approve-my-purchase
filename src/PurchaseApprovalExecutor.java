import common.Request;
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

        manager.approve(new Request(1, 299, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(2, 500, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(3, 999, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(4, 3000, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(5, 4999, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new Request(6, 500, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(7, 999, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(8, 1500, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(9, 3499, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(10, 6000, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new Request(11, 699, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(12, 1500, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(13, 1999, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(14, 4500, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(15, 6499, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new Request(16, 1000, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(17, 1999, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(18, 3000, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(19, 4999, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(20, 8000, Type.PC));
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(new Request(21, 2000, Type.CONSUMABLES));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(22, 2999, Type.CLERICAL));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(23, 3000, Type.GADGETS));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(24, 5999, Type.GAMING));
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(new Request(25, 9000, Type.PC));
    }
}
