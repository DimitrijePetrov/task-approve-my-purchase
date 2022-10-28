package common;

public class PurchaseLogger {
    public static void logPurchaseInvalid(int id, double cost) {
        System.out.println("Invalid purchase with id " + id + " that costs " + cost + ": cost cannot be less than 0");
    }

    public static void logPurchaseApproved(String name, int id, double cost) {
        System.out.println(name + " approved purchase with id " + id + " that costs " + cost);
    }

    public static void logPurchaseNotApproved(String name, int id) {
        System.out.println("Purchase with id " + id + " needs approval from higher position than " + name + ".");
    }
}
