public class FoodDeliveryOrder {
    private String restaurant;
    private String mainDish;
    private String drink;
    private String deliveryAddress;
    private boolean delivery;
    public void showOrder() {
        System.out.println("restaurant: " + restaurant);
        System.out.println("main dish: " + mainDish);
        System.out.println("drink: " + drink);
        System.out.println("delivery address: " + deliveryAddress);
        System.out.println("delivery: " + delivery);
    }
}
