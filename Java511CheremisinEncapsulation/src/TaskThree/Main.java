package TaskThree;

public class Main {
    public static void main (String[] args) {
        Product product = new Product("фигня","abcd",0);
        product.setPrice(100);
        System.out.println("Было: "+product.getName()+" "+product.getBarCode()+" "+product.getPrice());
        product.setPrice(200);
        System.out.println("Стало: "+product.getName()+" "+product.getBarCode()+" "+product.getPrice());
    }
}
