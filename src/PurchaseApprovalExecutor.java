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

//        manager.approve(1, 15000, Type.CONSUMABLES);
//        manager.approve(2, 5000, Type.PC);
//        manager.approve(3, 5000, Type.PC);
//        manager.approve(4, 3000, Type.CLERICAL);

        manager.approve(1, 299, Type.CONSUMABLES);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(2, 500, Type.CLERICAL);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(3, 999, Type.GADGETS);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(4, 3000, Type.GAMING);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(5, 4999, Type.PC);
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(6, 500, Type.CONSUMABLES);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(7, 999, Type.CLERICAL);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(8, 1500, Type.GADGETS);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(9, 3499, Type.GAMING);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(10, 6000, Type.PC);
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(11, 699, Type.CONSUMABLES);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(12, 1500, Type.CLERICAL);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(13, 1999, Type.GADGETS);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(14, 4500, Type.GAMING);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(15, 6499, Type.PC);
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(16, 1000, Type.CONSUMABLES);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(17, 1999, Type.CLERICAL);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(18, 3000, Type.GADGETS);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(19, 4999, Type.GAMING);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(20, 8000, Type.PC);
        System.out.println("\n--------------------------------------------------\n");

        manager.approve(21, 2000, Type.CONSUMABLES);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(22, 2999, Type.CLERICAL);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(23, 3000, Type.GADGETS);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(24, 5999, Type.GAMING);
        System.out.println("\n--------------------------------------------------\n");
        manager.approve(25, 9000, Type.PC);
    }
}
