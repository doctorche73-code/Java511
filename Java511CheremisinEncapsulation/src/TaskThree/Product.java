package TaskThree;

// исходный вариант:
//public class Product {
//
//    private final String name;
//    private final int price;
//
//    public Product(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//}

public class Product {

    private final String name;
    private final String barCode;
    private int price;

    public Product(String name,String barCode, int price) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}