package oop.exercises.on_oop.discount_system;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;
    private static final double PRODUCT_DISCOUNT = 0.1;

    public static double getProductDiscountRate() {
        return PRODUCT_DISCOUNT;
    }
    public static double getServiceDiscountRate(String type) {
        if (type.equals("premium")) {
            return serviceDiscountPremium;
        }
        if (type.equals("gold")) {
            return serviceDiscountGold;
        }
        if (type.equals("silver")) {
            return serviceDiscountSilver;
        }
        return 0;
    }
    public static double getProductDiscountRate(String type) {
        if (type.equals("premium")) {
            return productDiscountPremium;
        }
        if (type.equals("gold")) {
            return productDiscountGold;
        }
        if (type.equals("silver")) {
            return productDiscountSilver;
        }
        return 0;
    }
}
