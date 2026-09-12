# Food Delivery Order Builder
This is my Java project about the Builder Pattern.
I made a simple food delivery order. The user can choose a restaurant, main dish, drink, and delivery.

The `FoodDeliveryOrder` class is the final order. It stores all information about the order.

The `FoodDeliveryOrderBuilder` builds the order step by step. Each `set` method adds one part of the order and returns the builder, so I can use them one after another.

The `FoodDeliveryOrderDirector` has two ready examples: pickup order and delivery order. It tells the builder what information to add.

The `Main` class runs the program and shows the created orders.

I also added validation in the `build()` method. For example, a restaurant and main dish are required, and a delivery address is required when delivery is selected.

I used private fields, clear names, small methods, and method chaining to keep the code simple and easy to understand.

