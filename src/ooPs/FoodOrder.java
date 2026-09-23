package ooPs;

class FoodOrder {

    String foodName;
    int quantity;

    // Constructor 1
    FoodOrder() {
        foodName = "Burger";
        quantity = 1;
    }

    // Constructor 2 (Constructor Overloading)
    FoodOrder(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }

    // Method
    void displayOrder() {
        System.out.println("Food Name : " + foodName);
        System.out.println("Quantity  : " + quantity);
    }

    // Method with Parameters and Return Type
    double calculateBill(double price) {
        return quantity * price;
    }

    // Method Overloading
    void placeOrder() {
        System.out.println("Order Placed Successfully");
    }

    void placeOrder(String customerName) {
        System.out.println("Order Placed By : " + customerName);
    }

    void placeOrder(String customerName, String address) {
        System.out.println("Customer : " + customerName);
        System.out.println("Address  : " + address);
    }

    // Static Method
    static void restaurantInfo() {
        System.out.println("Restaurant : Food Paradise");
    }
}

 class Main {

    public static void main(String[] args) {

        // Static Method
        FoodOrder.restaurantInfo();

        System.out.println();

        // Constructor 1
        FoodOrder order1 = new FoodOrder();

        System.out.println("Default Order");
        order1.displayOrder();

        System.out.println();

        // Constructor 2
        FoodOrder order2 =
                new FoodOrder("Pizza", 3);

        System.out.println("Custom Order");
        order2.displayOrder();

        System.out.println();

        // Return Type Method
        double bill =
                order2.calculateBill(250);

        System.out.println("Total Bill = " + bill);

        System.out.println();

        // Method Overloading
        order2.placeOrder();
        order2.placeOrder("Shankaragouda");
        order2.placeOrder("Shankaragouda", "Bagalkot");
    }
}
