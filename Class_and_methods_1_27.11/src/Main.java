//Задание 1: Класс "Книга" (Book) +
//Создайте класс Book с полями: title (название), author (автор), year (год издания),
//pages (количество страниц)
//Создайте 3 конструктора: без параметров, с 2 параметрами (title, author), со всеми параметрами
//Создайте метод print() для вывода информации о книге
//Создайте метод isOld() который возвращает true если книга издана более 50 лет назад
//В main создайте 3 разные книги и выведите их информацию

//class Book {
//    String title;
//    String author;
//    int year;
//    int pages;
//
//    Book() {
//        this.title = "Не найдено";
//        this.author = "Не найден";
//        this.year = 0;
//        this.pages = 0;
//    }
//
//    Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//        this.year = 0;
//        this.pages = 0;
//    }
//
//    Book(String title, String author, int year, int pages) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//        this.pages = pages;
//    }
//
//    public boolean isOld() {
//        if (this.year == 0) return false;
//        int currentYear = 2025;
//        return (currentYear - this.year) > 50;
//    }
//
//    public void print() {
//        System.out.println("Название: " + title);
//        System.out.println("Автор: " + author);
//        System.out.println("Год издания: " + (year == 0 ? "Не указан" : year));
//        System.out.println("Количество страниц: " + (pages == 0 ? "Не указано" : pages));
//        System.out.println("Старая книга " + (isOld() ? "Да" : "Нет"));
//    }
//}
//
//public class Main {
//    public static void main() {
//        System.out.println("*** ИНФОРМАЦИЯ О КНИГАХ ***");
//        System.out.println("Книга № 1:");
//        Book book1 = new Book();
//        book1.print();
//        System.out.println();
//        System.out.println("Книга № 2:");
//        Book book2 = new Book("Апокалипсис", "Сатана");
//        book2.print();
//        System.out.println();
//        System.out.println("Книга № 3:");
//        Book book3 = new Book("Мастер и Маргарита", "М.А.Булгаков", 1966, 500);
//        book3.print();
//    }
//}


//Задание 2: Класс "Товар" (Product) +
//Создайте класс Product с полями: name (название), price (цена), quantity (количество на складе), category (категория)
//Создайте конструкторы с делегированием (минимум 3 конструктора)
//Создайте метод getTotalPrice() который возвращает общую стоимость (цена * количество)
//Создайте метод sell(int amount) который уменьшает количество товара
//Создайте метод restock(int amount) который увеличивает количество товара
//В main создайте магазин с 5 товарами и проведите несколько операций продажи

//class Product {
//    String name;
//    double price;
//    int quantity;
//    String category;
//
//    Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    Product(String name, double price, int quantity) {
//       this(name, price);
//       this.quantity = quantity;
//    }
//
//    Product(String name, double price, int quantity, String category) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//        this.category = category;
//    }
//
//    public double getTotalPrice() {
//        return this.price * this.quantity;
//    }
//
//    public void sell(int amount) {
//        if (quantity >= amount) {
//            quantity -= amount;
//            System.out.println("Продано " + amount + " ед.товара " + name + ".");
//        } else {
//            System.out.println("Недостаточно товара "+name+"." );
//        }
//    }
//
//    public void restock(int amount){
//        quantity+=amount;
//        System.out.println("Пополнено "+amount+" ед.товара "+name+"." );
//    }
//
//    public void print() {
//        System.out.println("Название: " + name);
//        System.out.println("Цена: " + price);
//        System.out.println("Количество: " + quantity);
//        System.out.println("Категория: " + category);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("==== ИСХОДНОЕ СОСТОЯНИЕ МАГАЗА ====");
//
//        Product product1 = new Product("чесало языковое", 1.5, 10, "хрень");
//        product1.print();
//        double sumPrice1 = product1.getTotalPrice();
//        System.out.println();
//
//        Product product2 = new Product("мышь летучая", 2.5, 4, "живность");
//        product2.print();
//        double sumPrice2 = product2.getTotalPrice();
//        System.out.println();
//
//        Product product3 = new Product("книга заклинаний", 10.0, 4, "магия");
//        product3.print();
//        double sumPrice3 = product3.getTotalPrice();
//        System.out.println();
//
//        Product product4 = new Product("палочка волшебная", 5.5, 10);
//        product4.print();
//        double sumPrice4 = product4.getTotalPrice();
//        System.out.println();
//
//        Product product5 = new Product("кроказябра", 0.5);
//        product5.print();
//        double sumPrice5 = product5.getTotalPrice();
//        System.out.println();
//        double result1 = sumPrice1+sumPrice2+sumPrice3+sumPrice4+sumPrice5;
//
//        System.out.println("==== ПРОДАЁМ ====");
//
//        product1.sell(4);
//        product2.sell(4);
//        product3.sell(5);
//        System.out.println();
//
//        System.out.println("==== В НАЛИЧИИ ПОСЛЕ ПРОДАЖИ ====");
//        product1.print();
//        double sumSell1 = product1.getTotalPrice();
//        System.out.println();
//        product2.print();
//        double sumSell2 = product2.getTotalPrice();
//        System.out.println();
//        product3.print();
//        double sumSell3 = product3.getTotalPrice();
//        System.out.println();
//        product4.print();
//        double sumSell4 = product4.getTotalPrice();
//        System.out.println();
//        product5.print();
//        double sumSell5 = product5.getTotalPrice();
//        System.out.println();
//        double result2 = sumSell1+sumSell2+sumSell3+sumSell4+sumSell5;
//        System.out.println("**** СРУБИЛИ БАБЛА "+(result1-result2)+" !!! ***" );
//        System.out.println();
//        System.out.println("==== ПОПОЛНЯЕМ ЗАПАСЫ ====");
//        product1.restock(4);
//        product2.restock(10);
//        product3.restock(6);
//        product5.restock(10);
//        System.out.println();
//        System.out.println("==== ПОСЛЕ ПОПОЛЕНИЯ ИМЕЕМ ====");
//        product1.print();
//        System.out.println();
//        product2.print();
//        System.out.println();
//        product3.print();
//        System.out.println();
//        product4.print();
//        System.out.println();
//        product5.print();
//    }
//}


//Задание 3: Класс "Банковская карта" (BankCard) +
//Создайте класс BankCard с полями: cardNumber (номер карты),
//ownerName (имя владельца), balance (баланс), expiryDate (срок действия)
//Создайте конструкторы с разным количеством параметров
//Создайте метод deposit(double amount) для пополнения
//Создайте метод withdraw(double amount) для снятия
//(проверяйте достаточно ли денег)
//Создайте метод transfer(BankCard recipient, double amount)
//для перевода денег на другую карту
//В main создайте 3 карты и проведите операции между ними

//class BankCard {
//    int cardNumber;
//    String ownerName;
//    double balance;
//    String expiryDate;
//
//    BankCard (int cardNumber,double balance) {
//        this.cardNumber = cardNumber;
//        this.balance = balance;
//    }
//
//    BankCard (int cardNumber,double balance,String expiryDate) {
//        this(cardNumber,balance);
//        this.expiryDate = expiryDate;
//    }
//
//    BankCard (int cardNumber,String ownerName,double balance,String expiryDate) {
//        this.cardNumber = cardNumber;
//        this.ownerName = ownerName;
//        this.balance = balance;
//        this.expiryDate = expiryDate;
//    }
//
//    public void deposit(double amount){
//        balance+=amount;
//        System.out.println("Счет карты "+cardNumber+" пополнен. Баланс "+balance+".");
//    }
//
//    public void withdraw(double amount){
//        if(balance>amount){
//            balance-=amount;
//            System.out.println("Снятие средств. Баланс карты "+cardNumber+"  "+balance+".");
//        }else{
//            System.out.println("Операция отклонена. На карте "+cardNumber+" недостаточно средств.");
//        }
//    }
//
//    public void transfer(BankCard recipient, double amount){
//        if(recipient == null){
//            System.out.println("Операция отклонена. Получатель не указан.");
//        }
//        if(amount>balance){
//            System.out.println("Операция отклонена. Недостаточно средств.");
//        }
//        this.balance -= amount;
//        recipient.balance += amount;
//        System.out.println("Перевод с карты "+this.cardNumber+" на карту "+recipient.cardNumber);
//        System.out.println("Баланс отправителя "+this.cardNumber+"  "+this.balance);
//        System.out.println("Баланс получателя "+recipient.cardNumber+"  "+recipient.balance);
//    }
//
//    public void print() {
//        System.out.println("Номер карты : " + cardNumber);
//        System.out.println("Владелец : " + ownerName);
//        System.out.println("Баланс : " + balance);
//        System.out.println("Срок действия : " + expiryDate);
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        BankCard card1 = new BankCard(1111,"Вася",200.0,"01/30");
//        BankCard card2 = new BankCard(2222,"Петя",300.0,"01/29");
//        BankCard card3 = new BankCard(3333,"Маша",400.0,"01/28");
//        System.out.println("Исходное состояние карт");
//        card1.print();
//        System.out.println();
//        card2.print();
//        System.out.println();
//        card3.print();
//        System.out.println();
//
//        System.out.println("Банковские операции");
//        card1.deposit(200.0); //400
//        card2.withdraw(200.0); //100 //200
//        card3.transfer(card2,100.0); //400
//        card2.withdraw(300.0); //200
//        System.out.println();
//
//        System.out.println("Итоговое состояние карт");
//        card1.print();
//        System.out.println();
//        card2.print();
//        System.out.println();
//        card3.print();
//    }
//}


//Задание 4: Класс "Прямоугольник" (Rectangle) +
//Создайте класс Rectangle с полями: width (ширина), height (высота), color (цвет)
//Создайте конструктор для квадрата (один параметр - сторона)
//Создайте конструктор для прямоугольника без цвета
//Создайте конструктор со всеми параметрами
//Создайте методы: getArea(), getPerimeter(), isSquare()
//В main создайте массив из 5 фигур (квадраты и прямоугольники) и найдите фигуру с
//максимальной площадью


//class Rectangle {
//    int width;
//    int height;
//    String color;
//
//    Rectangle(int width,int height,String color){
//        this.width = width;
//        this.height = height;
//        this.color = color;
//    }
//
//    Rectangle(int width,int height){
//        this.width = width;
//        this.height = height;
//        this.color = "бесцветный";
//    }
//
//    Rectangle(int side){
//        this.width = side;
//        this.height = side;
//    }
//
//    public int getPerimeter(){
//        return (width+height)*2;
//    }
//
//    public int getArea(){
//        return width*height;
//    }
//
//    public boolean isSquare(){
//        return width==height;
//    }
//
//    public void print() {
//        System.out.println("Квадрат? " +isSquare());
//        System.out.println("Ширина : " +width);
//        System.out.println("Высота : " +height);
//        System.out.println("Цвет : " +color);
//        System.out.println("Периметр: "+getPerimeter());
//        System.out.println("Площадь: "+getArea());
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Rectangle[] rect = new Rectangle[5];
//        rect[0] = new Rectangle(3,4,"белый");
//        rect[1] = new Rectangle(3,2,"черный");
//        rect[2] = new Rectangle(3,1);
//        rect[3] = new Rectangle(3);
//        rect[4] = new Rectangle(2);
//
//        Rectangle maxAreaRectangle = rect[0];
//        for (int i = 0;i<5;i++) {
//            if (rect[i].getArea() > maxAreaRectangle.getArea()) {
//                maxAreaRectangle = rect[i];
//            }
//        }
//        System.out.println("Фигура с максимальной площадью");
//        maxAreaRectangle.print();
//    }
//}


//Задание 5: Класс "Сотрудник" (Employee)
//Создайте класс Employee с полями: name, position (должность), salary, experience
//(стаж в годах), department (отдел)
//Создайте несколько конструкторов с делегированием
//Создайте метод giveRaise(double percent) для повышения зарплаты
//Создайте метод promote(String newPosition) для повышения должности
//Создайте метод celebrateAnniversary() который увеличивает стаж на 1 год
//В main создайте отдел из 7 сотрудников и найдите сотрудника с максимальной зарплатой


//class Employee {
//    String name;
//    String position;
//    double salary;
//    int experience;
//    String department;
//
//    Employee(String name, String position) {
//        this.name = name;
//        this.position = position;
//    }
//
//    Employee(String name, String position, double salary) {
//        this(name, position);
//        this.salary = salary;
//    }
//
//    Employee(String name, String position, double salary, int experience, String department) {
//        this.name = name;
//        this.position = position;
//        this.salary = salary;
//        this.experience = experience;
//        this.department = department;
//    }
//
//    public void giveRaise(double percent) {
//        this.salary += this.salary * percent / 100;
//    }
//
//    public void promote(String newPosition) {
//        this.position = newPosition;
//    }
//
//    public void celebrateAnniversary() {
//        this.experience++;
//    }
//
//    public double getSalary() {
//        return this.salary;
//    }
//
//    public void print() {
//        System.out.println("Имя: " + name);
//        System.out.println("Должность: " + position);
//        System.out.println("Зарплата: " + salary);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Employee[] emp = new Employee[7];
//        emp[0] = new Employee("Вася", "даун", 100, 10, "a");
//        emp[1] = new Employee("Петя", "клоун", 150, 15, "b");
//        emp[2] = new Employee("Коля", "шнырь", 180, 20, "c");
//        emp[3] = new Employee("Дима", "манагер", 200, 25, "d");
//        emp[4] = new Employee("Саша", "смотрящий", 250, 30, "e");
//        emp[5] = new Employee("Маша", "менеджер по клинингу", 300, 2, "f");
//        emp[6] = new Employee("Наташа", "секретутка", 100500, 1, "g");
//
//        Employee maxSalaryEmployee = emp[0];
//        for (int i = 0; i < 7; i++) {
//            if (emp[i].getSalary() > maxSalaryEmployee.getSalary()) ;
//            maxSalaryEmployee = emp[i];
//        }
//        System.out.println("Больше всех получает");
//        maxSalaryEmployee.print();
//        System.out.println("Боже, кто бы мог подумать...");
//    }
//}


//Задание 6: Класс "Телефон" (Phone)
//Создайте класс Phone с полями: brand, model, price,
//batteryLevel (уровень батареи),
//isOn (включен ли)
//Создайте конструкторы (минимум 3 варианта)
//Создайте методы: turnOn(), turnOff(), charge(int minut), use(int hours)
//(использование уменьшает батарею)
//Создайте метод getInfo() возвращающий строку с информацией о телефоне
//В main создайте массив из 4 телефонов и симулируйте день использования


class Phone {
    String brand;
    String model;
    int price;
    int batteryLevel;
    boolean isOn;

    Phone(String brand, String model, int price, int batteryLevel, boolean isOn) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryLevel = batteryLevel;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Телефон " + model + " включён.");
        } else {
            System.out.println("Телефон уже включён.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Телефон " + model + " выключен.");
        } else {
            System.out.println("Телефон уже выключен.");
        }
    }

    public void charge(int minut) {
        //за час заряжается на 50%
        int chargePerMinute = 50 / 60;
        int сharge = minut * chargePerMinute;
        batteryLevel += сharge;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Зарядка " + minut + " минут. Заряд " + сharge + " %.");
    }

    public void use(int hours) {
        //за час тратится 10%
        int batteryUse = hours * 10;
        batteryLevel -= batteryUse;

        if (batteryLevel < 0) {
            batteryLevel = 0;
            System.out.println("Батарея полностью разряжена!");
            turnOff();
        } else {
            System.out.printf("Телефон работает "+hours+" часов. Заряд "+batteryLevel+" %.");
        }
    }

    public String getInfo() {
        return String.format(
                "Бренд: %s\n" +
                        "Модель: %s\n" +
                        "Цена: $%.2f\n" +
                        "Уровень батареи: %d%%\n" +
                        "Состояние: %s",
                brand, model, price, batteryLevel, isOn ? "включён" : "выключен");
    }



