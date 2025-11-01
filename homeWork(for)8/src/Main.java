//1.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите целое число =>  ");
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        for (int i = 1; i <= N; i ++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

//2.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите целое число =>  ");
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        for (int i = 1; i <= N; i ++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

//3.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите целое число =>  ");
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        int count = 0;
//        for (int i = 1; i <= N; i++) {
//            if (i % 2 != 0)
//                count++;
//        }
//        System.out.println("Количество нечетных чисел от 1 до N " + count + ".");
//    }
//}

//4.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите целое число =>  ");
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        int count = 0;
//        for (int i = 1; i <= N; i++) {
//            if (i % 2 == 0)
//                count++;
//        }
//        System.out.println("Количество четных чисел от 1 до N " + count + ".");
//    }
//}

//5.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите целое число - начало диапазона =>  ");
//        Scanner scan = new Scanner(System.in);
//        int N1 = scan.nextInt();
//        System.out.print("Введите второе целое число, больше первого  - конец диапазона =>  ");
//        int N2 = scan.nextInt();
//        int suм = 0;
//        for (int i = N1; i <= N2; i++) {
//            if (i > 0 ) {
//                suм = suм + i;
//            }
//        }
//        System.out.println("Сумма положительных чисел  в этом диапазоне равна " + suм + ".");
//    }
//}

//6.

//7.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите  число =>  ");
//        double N = scan.nextDouble();
//        System.out.println("*** Таблица умножения для " + N + " ***");
//        for (int i = 1; i <= 10 ; i++) {
//            double resalt = N * i;
//            System.out.println( N + " * " + i + " = " + resalt + ".");
//        }
//    }
//}

//8.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите целое число - начало диапазона =>  ");
//        Scanner scan = new Scanner(System.in);
//        int N1 = scan.nextInt();
//        System.out.print("Введите второе целое число, больше первого  - конец диапазона =>  ");
//        int N2 = scan.nextInt();
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int honestCount = 0;
//        int oddCount = 0;
//
//        for (int i = N1; i <= N2; i++) {
//            if (i > 0) {
//                positiveCount++;
//            }
//            if (i < 0) {
//                negativeCount++;
//            }
//            if (i % 2 == 0) {
//                honestCount++;
//            }
//            if (i % 2 != 0) {
//                oddCount++;
//            }
//        }
//        System.out.println("Количество положительных чисел в диапазоне от " + N1 + " до " + N2 + " равно " + positiveCount + ".");
//        System.out.println("Количество отрицательных чисел в диапазоне от " + N1 + " до " + N2 + " равно " + negativeCount + ".");
//        System.out.println("Количество четных чисел в диапазоне от " + N1 + " до " + N2 + " равно " + honestCount + ".");
//        System.out.println("Количество нечетных чисел в диапазоне от " + N1 + " до " + N2 + " равно " + oddCount + ".");
//        System.out.println();
//        System.out.println("Проверка делимости: ");
//        for (int i = N1; i <= N2; i++) {
//            if (i % 3 == 0 && i % 4 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(" Эти числа из данного диапазона делится на 3 и 4 без остатка.");
//        for (int i = N1; i <= N2; i++) {
//            if (i % 4 == 0 && i % 5 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(" Эти числа из данного диапазона делится на 4 и 5 без остатка.");
//        for (int i = N1; i <= N2; i++) {
//            if (i % 2 == 0 && i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(" Эти числа из данного диапазона делится на 2 и 7 без остатка.");
//        for (int i = N1; i <= N2; i++) {
//            if (i % 3 == 0 || i % 4 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(" Эти числа из данного диапазона делится на 3 или на 4 без остатка.");
//        for (int i = N1; i <= N2; i++) {
//            if (i % 5 == 0 || i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(" Эти числа из данного диапазона делится на 5 или на 4 без остатка.");
//    }
//}


