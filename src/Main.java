public class Main {
    public static void main(String[] args) {
        FoodDeliveryOrderDirector director = new FoodDeliveryOrderDirector();
        FoodDeliveryOrder pickupOrder = director.createPickupOrder();
        System.out.println("Pickup order:");
        pickupOrder.showOrder();
        System.out.println();
        FoodDeliveryOrder deliveryOrder = director.createStandardDeliveryOrder();
        System.out.println("Delivery order:");
        deliveryOrder.showOrder();
    }
}