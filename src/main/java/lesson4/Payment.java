package lesson4;

public class Payment {
    private String shopName;
    private int purchaseNumber;

    public Product[] products;


    public class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public Payment(String shopName, int purchaseNumber) {
        this.shopName = shopName;
        this.purchaseNumber = purchaseNumber;
    }

    public String getShopName() {
        return shopName;
    }

    public int getPurchaseNumber() {
        return purchaseNumber;
    }
}
