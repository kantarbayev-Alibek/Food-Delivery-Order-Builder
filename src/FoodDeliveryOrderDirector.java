public class FoodDeliveryOrderDirector {
    public FoodDeliveryOrder createPickupOrder() {
        return new FoodDeliveryOrderBuilder()
                .setRestaurant("Mak na kabanbay")
                .setMainDish("Pizza")
                .setDrink("Fanta")
                .setDelivery(false)
                .build();
    }
    public FoodDeliveryOrder createStandardDeliveryOrder() {
        return new FoodDeliveryOrderBuilder()
                .setRestaurant("KFC")
                .setMainDish("Cheeseburger")
                .setDrink("Cola")
                .setDeliveryAddress("Astana")
                .setDelivery(true)
                .build();
    }
}
