package TaskTwo;

public class Main {
    public static void main (String[] args) {
        Country country = new Country("Россия");

        country.setTitle("РФ");
        country.setPopulation(140000000);
        country.setCapital("Москва");

        System.out.println("Название: "+country.getTitle());
        System.out.println("Численность населения: "+country.getPopulation());
        System.out.println("Столица: "+country.getCapital());
        System.out.println("Территория: "+country.getSquare()); //значение не установлено
    }
}
