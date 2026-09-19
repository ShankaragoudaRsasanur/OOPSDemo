package ooPs;

public class Mobile {

    String brand;
    int price =1000;

    Mobile() {
        brand = "Samsung";
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        System.out.println(m1.brand);
        System.out.println(m1.price);
    }
}
