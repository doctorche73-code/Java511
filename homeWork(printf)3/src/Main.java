/*NB! Мне непонятна ни логика, ни синтаксис printf, к сожалению.
Я смотрел решение от ИИ, всё равно не понятно, списывать не стал
делал со справочной литературой*/

//Задача 1
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Введите цену товара: ");
        double price = scan.nextDouble();
        System.out.print("Введите процент скидки: ");
        double discount = scan.nextDouble();
        double result = price - (price / 100 * discount);
        //System.out.println("Окончательная цена товара " + (price - (price / 100 * discount)));
         System.out.printf("Окончательная цена: %.2f", result);
         scan.close();
    }
}*/

//Задача 2
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую оценку: ");
        int grade1 = scan.nextInt();

        System.out.print("Введите вторую оценку: ");
        int grade2 = scan.nextInt();

        System.out.print("Введите третью оценку: ");
        int grade3 = scan.nextInt();
        int summaryGrade = grade1 + grade2 + grade3;
        double result =(double) summaryGrade/3;
        System.out.println("Средний балл равен: " + result);
        scan.close();
    }
}*/

//Задача 3 Вариант решения 1. Логика проста и понятна.
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " делится на 2.");
        } else {
            System.out.println("Число " + number + " не делится на 2.");
        }

        if (number % 3 == 0) {
            System.out.println("Число " + number + " делится на 3.");
        } else {
            System.out.println("Число " + number + " не делится на 3.");
        }

        if (number % 5 == 0) {
            System.out.println("Число " + number + " делится на 5.");
        } else {
            System.out.println("Число " + number + " не делится на 5.");
        }
        scan.close();
    }
}*/

//Задача 3. Вариант решения 2. Кривая логика как по мне
//плодим лишние сущности без надобности
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scan.nextInt();
        boolean isDivideBy2 = number%2 ==0;
        boolean isDivideBy3 = number%3 ==0;
        boolean isDivideBy5 = number%5 ==0;

        System.out.printf("Делится на 2: %s%n",  isDivideBy2 ? "да" : "нет");
        System.out.printf("Делится на 3: %s%n",  isDivideBy3 ? "да" : "нет");
        System.out.printf("Делится на 5: %s%n",  isDivideBy5 ? "да" : "нет");
        scan.close();
    }
}*/


//Задача 4.
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное.");
        }
        scan.close();
    }
}*/

//Задача 5 Тут не совсем непонятно
/*public class Main {
    public static void main(String[] args) {
         String name = "Иван";
         int age = 25;
         double height = 1.78;
         char group = 'A';
         boolean isStudent = true;
        System.out.printf("Имя: %s, Возраст: %d, Рост: %.2f, Группа %c, Студент? %b", name, age, height, group, isStudent);
    }
}*/

//Задача 6
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int number1 = scan.nextInt();

        System.out.print("Введите второе число:");
        int number2 = scan.nextInt();

        System.out.println("Результат деления: " + number1 / number2);
        System.out.println("Остаток от деления: " + number1 % number2);
        scan.close();
    }
}*/
