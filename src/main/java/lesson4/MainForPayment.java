/* 6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку
из нескольких товаров. */

package lesson4;

public class MainForPayment {
    public static void main(String[] args) {
        Payment payment = new Payment("LadyBug", 123456);

        payment.products = new Payment.Product[3];
        payment.products[0] = payment.new Product("Cheese", 12);
        payment.products[1] = payment.new Product("Bread", 4);
        payment.products[2] = payment.new Product("Milk", 3);

        getInfo(payment);
    }

    public static void getInfo(Payment payment) {
        int sum = 0;
        System.out.println("Shop: " + payment.getShopName() + " | Purchase number: " + payment.getPurchaseNumber());
        System.out.println("_________________");
        for(Payment.Product prod: payment.products) {
            sum += prod.getPrice();
            System.out.println(prod.getName() + " " + prod.getPrice());
        }
        System.out.println("_________________");
        System.out.println("Total sum: " + sum);
    }
}
