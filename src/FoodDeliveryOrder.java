public class FoodDeliveryOrder {
    private String restaurant;
    private String mainDish;
    private String drink;
    private String deliveryAddress;
    private boolean delivery;
    public FoodDeliveryOrder(String restaurant, String mainDish, String drink,
                             String deliveryAddress, boolean delivery) {
        this.restaurant = restaurant;
        this.mainDish = mainDish;
        this.drink = drink;
        this.deliveryAddress = deliveryAddress;
        this.delivery = delivery;
    }
    public void showOrder() {
        System.out.println("restaurant: " + restaurant);
        System.out.println("main dish: " + mainDish);
        System.out.println("drink: " + drink);
        System.out.println("delivery address: " + deliveryAddress);
        System.out.println("delivery: " + delivery);
    }
}
