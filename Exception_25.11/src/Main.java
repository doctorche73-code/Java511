//Задача 1: Деление на ноль +
//Создайте метод safeDivision(int a, int b), который делит два числа
//и обрабатывает деление на ноль через try-catch. Метод должен возвращать
//результат деления или выводить сообщение об ошибке и возвращать 0.

//public class Main {
//    public static double safeDivision(int a, int b) {
//        try {
//            return a / b;
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            return 0;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(safeDivision(4,0));
//    }
//}


//Задача 2: Проверка массива +
//Создайте метод getElement(int[] arr, int index), который возвращает элемент
//массива по индексу.
//Обработайте ситуацию, когда индекс выходит за границы массива
//(ArrayIndexOutOfBoundsException). При ошибке возвращайте -1.

//public class Main {
//    public static int getElement(int[] arr, int index){
//        try {
//            return arr[index];
//        } catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//            return -1;
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5};
//        System.out.println(getElement(arr,4));
//    }
//


//Задача 3: Безопасный ввод числа +
//Создайте метод inputNumber( ),
//который просит пользователя ввести целое число.
//Если пользователь вводит не число (буквы, символы),
//программа должна перехватить исключение, вывести сообщение об ошибке
//и повторить запрос. Метод возвращает корректно введённое число.

//import java.util.Scanner;
//import java.util.InputMismatchException;
//public class Main {
//    public static int inputNumber() {
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Введите целое число");
//            try {
//                return scanner.nextInt();
//            } catch (InputMismatchException ex) {
//                System.out.println("Ошибка! Повторите ввод.");
//                scanner.nextLine();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Умничка какая. Вы Ввели "+inputNumber());
//    }
//}


//Задача 4: Конвертер строки в число +
//Создайте метод parseNumber(String str), который преобразует строку в целое число.
//Обработайте NumberFormatException - если строка не является числом, выведите сообщение
//об ошибке и верните 0. Протестируйте метод со строками: "123", "abc", "12.5".

//public class Main {
//    public static int parseNumber(String str){
//        try {
//            return Integer.parseInt(str);
//        } catch (NumberFormatException ex){
//            System.out.println("Ошибка! Строка не является целым числом.");
//            return 0;
//        }
//    }
//    public static void main(String[] args){
//        System.out.println(parseNumber("abc"));
//    }
//}


//Задача 5: Калькулятор с исключениями +  (попонька с приключениями)
//Создайте метод calculate(double a, double b, char operation),
//который выполняет арифметические операции (+, -, *, /). Обработайте деление на ноль.
//Если передана неизвестная операция (например, '%'), бросьте исключение IllegalArgumentException
//с сообщением "Neizvestnaya operaciya".

//public class Main {
//    public static double calculate(double a, double b, char operation) {
//        switch (operation) {
//            case '+':
//                return a + b;
//            case '-':
//                return a - b;
//            case '*':
//                return a * b;
//            case '/':
//                if(b == 0) throw new ArithmeticException("Ошибка! Деление на ноль.");
//                return a/b;
//            default: throw new IllegalArgumentException("Некорректная операция");
//        }
//    }
//    public static void main(String[] args){
//        try {
//            System.out.println(calculate(1.5,0,'&'));
//        } catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        } catch (IllegalArgumentException ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//}


//Задача 6: Валидация возраста +
//Создайте метод validateAge(int age), который проверяет корректность
//возраста (должен быть от 0 до 150).
//Если возраст отрицательный или больше 150, бросьте IllegalArgumentException
//с соответствующим сообщением.
//В методе main обработайте это исключение и выведите сообщение об ошибке.

//public class Main {
//    public static void validateAge(int age){
//        if(age<0){
//            throw new IllegalArgumentException("Возраст некорректен");
//        } else if (age>150) {
//            throw new IllegalArgumentException("Возраст некорректен");
//        }
//        System.out.println("Возраст корректен");
//    }
//    public static void main (String[] args){
//       try {
//           validateAge(1000);
//       } catch (IllegalArgumentException ex){
//           System.out.println(ex.getMessage());
//       }
//    }
//}


//Задача 7: Множественные исключения
//Создайте метод processArray(int[] arr, int index, int divisor),
//который берёт элемент массива по индексу и делит его на divisor.
//Метод должен обрабатывать три типа исключений отдельными catch блоками:

//NullPointerException - если массив null
//ArrayIndexOutOfBoundsException - если индекс неверный
//ArithmeticException - если делитель равен 0

//При каждой ошибке выводите своё сообщение. Возвращайте результат деления
//или -1 при ошибке.

//public class Main {
//    public static double processArray(int[] arr, int index, int divisor){
//        try {
//            double result = arr[index]/divisor;
//            return result;
//        }catch (NullPointerException ex){
//            System.out.println(ex.getMessage());
//            return -1;
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//            return -1;
//        }catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//            return -1;
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {};
//        System.out.println(processArray(arr,0,1));
//    }
//}