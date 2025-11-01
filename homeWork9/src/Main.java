// 1.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println("Данный массив:");
//        int[] array = new int[15];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-50, 50);
//            System.out.print(array[i] + " ");
//        }
//    }
//}

// 2.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        int[] array = new int[12];
//        Random random = new Random();
//        int count = 0;
//        for (int i = 0; i < array.length; i ++) {
//            array[i] = random.nextInt(-30,30);
//            count ++;
//        }
//        System.out.println("Длина массива равна: " + count + ".");
//    }
//}

// 2.1.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        int[] array = new int[12];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i ++) {
//            array[i] = random.nextInt(-30,30);
//        }
//        System.out.println("Длина массива равна: " + array.length + ".");
//    }
//}

// 3.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i ++) {
//            array[i] = random.nextInt(-40,40);
//        }
//        System.out.println("Первый элемент массива: " + array[0] + ".");
//    }
//}

// 4.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[14];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-25, 25);
//        }
//        System.out.println("Последний элемент массива: " + array[array.length - 1] + ".");
//    }
//}

// 5.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//      int[] array = new int[10];
//      int sum = 0;
//      Random random = new Random();
//      for (int i = 0; i < array.length; i++) {
//          array[i] = random.nextInt(-15,15);
//          sum += array[i];
//          //System.out.println(array[i]); это чисто для порядка, чтоб знать
//      }
//        System.out.println("Сумма элементов массива равна " + sum + ".");
//    }
//}

// 6.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        int[] array = new int[20];
//        Random random = new Random();
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//           array[i] = random.nextInt(-30,30);
//           if (array[i] > 0) {
//               count++;
//           }
//        }
//        System.out.println("Количество положительных чисел в массиве равно: " + count + ".");
//    }
//}

// 7.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        int[] array = new int[18];
//        Random random = new Random();
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-40,40);
//            if (array[i] < 0){
//                count++;
//            }
//        }
//        System.out.println("Количество отрицательных чисел в массиве " + count + ".");
//    }
//}

// 8.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        int[] array = new int[16];
//        int count = 0;
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-25,25);
//            if (array[i] % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println("В массиве " + count + " четных чисел.");
//    }
//}

// 9.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//        Random random = new Random();
//        int[] array = new int[14];
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-35,35);
//            if (array[i] % 2 != 0){
//                count++;
//            }
//        }
//        System.out.println("В массиве " + count + " нечетных чисел.");
//    }
//}

// 10.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args){
//        int[] array = new int[25];
//        int count = 0;
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-10,10);
//            if (array[i] == 0){
//                count++;
//            }
//        }
//        System.out.println("В массиве " + count + " нулей.");
//    }
//}

// 11.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//      int[] array = new int[15];
//      Random random = new Random();
//      int max = array[0];
//      for (int i = 0; i < array.length; i++){
//          array[i] = random.nextInt(-60,60);
//          if(array[i] > max){
//              max = array[i];
//          }
//      }
//        System.out.println("Максимальный элемент в массиве " + max + ".");
//    }
//}

// 12.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args){
//        Random random = new Random();
//        int[] array = new int[17];
//        int min = array[0];
//        for (int i = 0;i < array.length; i++){
//            array[i] = random.nextInt(-70,70);
//            if(array[i] < min){
//                min = array[i];
//            }
//        }
//        System.out.println("Минимальный элемент " + min + ".");
//    }
//}

// 13.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args){
//        Random random = new Random();
//        int[] array = new int[12];
//        System.out.println("Исходный массив:");
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-20,20);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        System.out.println("В обратном порядке:");
//        for (int i = array.length - 1; i >= 0; i--){
//            System.out.print(array[i] + " ");
//        }
//    }
//}

// 14.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] array = new int[15];
//        System.out.println("Выводим положительные элементы массива:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-25, 25);
//            if (array[i] > 0) {
//                System.out.print(array[i] + " ");
//            }
//        }
//    }
//}

// 15.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//        Random random = new Random();
//        int[] array = new int[16];
//        System.out.println("Выводим отрицательные элементы массива:");
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-35,35);
//            if(array[i] < 0){
//                System.out.print(array[i] + " ");
//            }
//        }
//    }
//}

// 16.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] array = new int[14];
//        System.out.println("Выводим четные элементы массива:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-20,20);
//            if (array[i] % 2 == 0){
//                System.out.print(array[i] + " ");
//            }
//        }
//    }
//}

// 17.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] array = new int[12];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-30, 30);
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == max) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("Индекс максимального элемента массива " + index + ".");
//
//    }
//}

// 18.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        Random random = new Random();
//        int[] array = new int[13];
//        int min = array[0];
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-40,40);
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//        int index = -1;
//        for (int i = 0; i < array.length; i++){
//            if (array[i] == min){
//                index = i;
//                break;
//            }
//
//        }
//        System.out.println("Индекс минимального элемента массива " + index + ".");
//    }
//}

// 19.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//      Random random = new Random();
//      int[] array = new int[20];
//      int sum = 0;
//      for (int i = 0; i < array.length; i++) {
//          array[i] = random.nextInt(-45,45);
//          sum += array[i];
//      }
//      int result = sum / array.length;
//        System.out.println("Среднее арифметическое элементов " + result + ".");
//    }
//}

// 20.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        Random random = new Random();
//        int[] array = new int[11];
//        System.out.println("Было:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-30, 30);
//            System.out.print(array[i] + " ");
//        }
//        for (int i = 0; i < array.length; i++){
//            if (array[i] < 0){
//                array[i] = Math.abs(array[i]);
//            }
//        }
//        System.out.println();
//        System.out.println("Стало:");
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
//    }
//}

// 21.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//        Random random = new Random();
//        int negativeSum = 0;
//        int positiveSum = 0;
//        int[] array = new int[18];
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-50,50);
//            if (array[i] < 0){
//               negativeSum += array[i];
//            }
//            else if (array[i] > 0){
//                positiveSum += array[i];
//            }
//        }
//        System.out.println("Сумма отрицательных элементов равна " + negativeSum + ".");
//        System.out.println("Сумма положительных элементов равна " + positiveSum + ".");
//    }
//}

// 22.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] array = new int[22];
//        int min = array[0];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-80, 80);
//            if (array[i] < min) {
//                min = array[i];
//            }
//            else if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Разница равна " + (max - min) + ".");
//    }
//}

// 23.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//        Random random = new Random();
//        int productOfNumbers = 1;
//        int[] array = new int[8];
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(-5,5);
//            productOfNumbers *= array[i];
//        }
//        System.out.println("Произведение всех элементов массива равно " + productOfNumbers + ".");
//    }
//}

// 24.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//        Random random = new Random();
//        int[] array = new int[15];
//        int arithmetiсMean = 0;
//        int count = 0;
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-40,40);
//            sum += array[i];
//        }
//        arithmetiсMean = sum / array.length;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] > arithmetiсMean) {
//                count++;
//            }
//        }
//        System.out.println(count + " элементов больше среднего значения.");
//    }
//}

// 25.
//import java.util.Random;
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-50, 50);
//        }
//        Arrays.sort(array);
//        System.out.println("Второй (по величине) максимальный элемент массива " + array[array.length - 2] + ".");
//    }
//}

// 26.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args){
//        Random random = new Random();
//        int[] numbers = new int[16];
//        int sum = 0;
//        for (int i =0; i < numbers.length; i++){
//            numbers[i] = random.nextInt(-30, 30);
//        }
//        for (int i = 0; i < numbers.length; i += 2){
//            sum += numbers[i];
//        }
//        System.out.println("Сумма четных элементов массива равна " + sum + ".");
//    }
//}

// 27.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        Random random = new Random();
//        int count = 0;
//        int[] numbers = new int[25];
//        for (int i =0; i < numbers.length; i++){
//            numbers[i] = random.nextInt(-50,50);
//            if (numbers[i] >= -10 && numbers[i] <= 10) {
//                count++;
//            }
//        }
//        System.out.println("Таких элементов " + count + ".");
//    }
//}

// 28.
//import java.util.Random;
//public class Main {
//    public static void main (String[] args) {
//        Random random = new Random();
//        int[] numbers = new int[18];
//        int max = numbers[0];
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = random.nextInt(-20,20);
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.print("Индекс(ы) максимального элемента: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == max) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

// 29.
//import java.util.Random;
//public class Main {
//    public  static void main (String[] args) {
//        Random random = new Random();
//        int[] numbers = new int[12];
//        int prodactPositive = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(-10,10);
//            if(numbers[i] > 0){
//                prodactPositive *= numbers[i];
//            }
//        }
//        System.out.println("Произведение положительных элементов массива равно: " + prodactPositive + ".");
//    }
//}

// 30.
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-30,30);
//        }
//
//        int maxCount = 0;
//        int currentCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                currentCount++;
//            } else {
//                currentCount = 0;
//            }
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//            }
//        }
//        System.out.println("Длина максимальной последовательности положительных чисел " + maxCount + ".");
//    }
//}
