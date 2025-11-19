//Игрулька Больше-Меньше(Комп - Человек).

//import java.util.Scanner;
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("Добро пожаловать на игру Угадай Число. Как Вас зовут?");
//        String name = scanner.nextLine();
//
//        System.out.println("Привет, " + name + "! Выберите границы диапазона: ");
//        System.out.println("Введите первое целое число - начало диапазона");
//        int minNumder = scanner.nextInt();
//        System.out.println("Введите второе целое число, больше первого - конец диапазона");
//        int maxNumber = scanner.nextInt();
//
//        System.out.println("Выбран диапазон от " + minNumder + " до " + maxNumber + ".");
//        int secretNumber = random.nextInt(minNumder, maxNumber);
//        System.out.println("Введите желаемое число попыток");
//        int maxAttempts = scanner.nextInt();
//        int attempts = 0;
//
//        System.out.println("Число загадано, игра началась, удачи!");
//        while (attempts < maxAttempts) {
//            System.out.println("Попытка номер " + (attempts + 1) + ".");
//            System.out.println("Введите ваше число");
//            int userNumber = scanner.nextInt();
//            attempts++;
//            if (userNumber == secretNumber) {
//                System.out.println("УРА!! Вы угадали число " + secretNumber + " с " + attempts + " попытки!");
//                System.out.println("Вы победили, игра окончена!");
//                break;
//            } else if (userNumber < secretNumber) {
//                System.out.println("Не угадали! Загаданное число БОЛЬШЕ.");
//            } else {
//                System.out.println("Не угадали! Загаданное число МЕНЬШЕ.");
//            }
//            if (attempts == maxAttempts && userNumber != secretNumber) {
//                System.out.println("Ваши попытки закончились, игра окончена!");
//            }
//        }
//    }
//}


// Игрулька Человек - Комп

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать на игру Угадай Число. Как Вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "! Выберите границы диапазона: ");
        System.out.println("Введите первое целое число - начало диапазона");
        int min = scanner.nextInt();
        System.out.println("Введите второе целое число, больше первого - конец диапазона");
        int max = scanner.nextInt();
        System.out.println("Выбран диапазон от " + min + " до " + max + ".");
        int attempts = 0;
        boolean guessed = false;
        System.out.println("Начинаем игру. Загадайте целое число в выбранном диапазоне.");
        System.out.println("Когда загадаете, нажмите Enter.");
        scanner.nextLine();

        while (!guessed){
            int guess = min+(max-min)/2;
            attempts++;

            System.out.println("Попытка № "+attempts+". Ваше число "+guess+"?");
            System.out.println("Введите 'больше', 'меньше' или 'верно'");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if(userAnswer.equals("верно")){
                System.out.println("Я угадал число "+guess+" за "+attempts+" попыток.");
                guessed = true;
            } else  if (userAnswer.equals("больше")){
                min = guess+1;
            } else if (userAnswer.equals("меньше")){
                max = guess-1;
            } else {
                System.out.println("Некорректный ввод.");
                attempts--;
            }
        }
    }
}