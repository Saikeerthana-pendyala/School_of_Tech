public enum ProductType {
    DIGITAL(0), PHYSICAL(Catalouge.SHIPPING_RATE);

    private final int shippingRate;

    ProductType(int shippingRate) {
        this.shippingRate = shippingRate;
    }

    public int getShippingCost(int weight) {
        return shippingRate * weight;
    }
}
