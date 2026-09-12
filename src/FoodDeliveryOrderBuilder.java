public class FoodDeliveryOrderBuilder {
    private String restaurant;
    private String mainDish;
    private String drink;
    private String deliveryAddress;
    private boolean delivery;
    public FoodDeliveryOrderBuilder setRestaurant(String restaurant) {
        this.restaurant = restaurant;
        return this;
    }
    public FoodDeliveryOrderBuilder  setMainDish(String mainDish) {
        this.mainDish = mainDish;
        return this;
    }
    public FoodDeliveryOrderBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }
    public FoodDeliveryOrderBuilder setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public FoodDeliveryOrderBuilder setDelivery(boolean delivery){
        this.delivery = delivery;
        return this;
    }
    public FoodDeliveryOrder build() {
        if (restaurant == null || restaurant.isBlank()) {
            throw new IllegalArgumentException("Which Restaurant?");
        }
        if (mainDish == null || mainDish.isBlank()) {
            throw new IllegalArgumentException("Main dish?");
        }
        if (delivery && (deliveryAddress == null || deliveryAddress.isBlank())) {
            throw new IllegalArgumentException(
                    "Delivery address is required when delivery is enabled"
            );
        }
        return new FoodDeliveryOrder(
                restaurant,
                mainDish,
                drink,
                deliveryAddress,
                delivery
        );
    }
}
