
//1.
//import java.util.Random;
//public class Main {
//    public static int[] generateRandomArray(int N, int min, int max) {
//        Random random = new Random();
//        int[] array = new int[N];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(min, max);
//        }
//        return array;
//    }
//       //Это проверка работы метода
//    public static void main(String[] args) {
//        int N = 10;
//        int min = -10;
//        int max = 10;
//        int[] numbers = generateRandomArray(N, min, max);
//        for (int number: numbers){
//            System.out.print(number + " ");
//        }
//    }
//}

//2.
//import java.util.Random;
//public class Main {
//    public static int[] generateRandomArray(int N,int min,int max){
//       Random random = new Random();
//       int[] array = new int[N];
//       for (int i=0;i< array.length;i++){
//           array[i]= random.nextInt(min,max);
//       }
//       return array;
//    }
//    public static void printArray(int[] array){
//        for(int i=0;i< array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//    }
//    public static void main(String[] args){
//        int N=15;
//        int min=-10;
//        int max=10;
//        int[] numbers = generateRandomArray(N,min,max);
//        System.out.println("Сгенерированный массив:");
//        printArray(numbers);
//    }
//}

//3.
//import java.util.Random;
//public class Main {
//    public static int[] generateRandomArray(int N, int min, int max) {
//        Random random = new Random();
//        int[] array = new int[N];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(min, max);
//        }
//        return array;
//    }
//    public static int sumArray(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int N = 15;
//        int min = -10;
//        int max = 10;
//        int[] numbers = generateRandomArray(N, min, max);
//        System.out.println("Сумма элементов массива: "+sumArray(numbers)+".");
//    }
//}

//4.
//import java.util.Random;
//public class Main {
//    public static int[] generateRandomArray(int N, int min, int max) {
//        Random random = new Random();
//        int[] array = new int[N];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(min, max);
//        }
//        return array;
//    }
//    public static int quantPositivElement(int[] array) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int N = 15;
//        int min = -10;
//        int max = 10;
//        int[] numbers = generateRandomArray(N, min, max);
//        System.out.println("Количество положительных элементов: "+quantPositivElement(numbers)+".");
//    }
//}

//5.
//public class Main {
//    public static int maxElement(int[] array){
//       int max=array[0];
//       for (int i=1;i<array.length;i++){
//           if (array[i]>max){
//               max=array[i];
//           }
//       }
//       return max;
//    }
//    public static void main(String[] args){
//        int[] numbers = {-1,10,11,-2,11,3,4,11,5,6,7};
//        System.out.println("Максимальный элемент: "+maxElement(numbers)+".");
//    }
//}

//6.
//public class Main {
//    public static int minElement(int[] array){
//        int min=array[0];
//        for (int i=1;i< array.length;i++){
//            if(array[i]<min){
//                min=array[i];
//            }
//        }
//        return min;
//    }
//    public static void main(String[] args){
//        int[] numbers = {-1,10,-2,3,4,-11,5,6,7};
//        System.out.println(minElement(numbers));
//    }
//}

//7.
//public class Main {
//    public static int meanArithmetic(int[] array){
//        int sum=0;
//        int result=0;
//        for(int i=0;i<array.length;i++){
//            sum+=array[i];
//        }
//        result=sum/array.length;
//        return result;
//    }
//    public static void main(String[] args){
//        int[] numbers = {1,2,3,4,5,6,7};
//        System.out.println(meanArithmetic(numbers));
//    }
//}

//8.
//public class Main {
//    public static int quantEvenElement(int[] array){
//        int count=0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]%2==0){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(quantEvenElement(numbers));
//    }
//}

//9.
//public class Main {
//    public static int indexMaxElement(int[] array) {
//        int max = array[0];
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]==max){
//                index=i;
//            }
//        }
//        return index;
//    }
//    public static void main(String[] args){
//        int[] numbers = {10, 2, 3, 4, 10, 5, 6, 7, 8, 9, 10};
//            System.out.print(indexMaxElement(numbers));
//        }
//    }

//9.1
//public class Main {
//    public static void printIndexMaxElement(int[] array) {
//        int max = array[0];
//        for (int i =1; i<array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        for (int i=0;i<array.length;i++){
//            if(array[i]==max){
//                System.out.print(i+" ");
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] numbers = {10, 2, 3, 4, 10, 5, 6, 7, 8, 9, 10};
//        printIndexMaxElement(numbers);
//    }
//}

//10.
//public class Main {
//    public static void printPositivElement(int[] array){
//        for (int i=0;i< array.length;i++){
//            if (array[i]>0){
//                System.out.print(array[i]+" ");
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] numbers={-3,-2,-1,0,1,2,3,4,-5};
//        printPositivElement(numbers);
//    }
//}

//11.
//public class Main {
//    public static int[] reversedArray(int[] array) {
//        int[] reversedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            reversedArray[i] = array[array.length - 1 - i];
//        }
//        return reversedArray;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr = reversedArray(numbers);
//        for (int element : arr){
//            System.out.print(element+" ");
//        }
//    }
//}

//12.
//public class Main {
//    public static int resetQuantElements(int Chislo, int[] array){
//        int count=0;
//        for (int element : array){
//            if (element==Chislo){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main (String[] args){
//        int Chislo=2;
//        int[] numbers={1,2,2,2,3,2};
//        System.out.print(resetQuantElements(Chislo,numbers));
//    }
//}

//13. С созданием массива.
//import java.util.Random;
//public class Main {
//    public static int[] generateRandomArray(int N,int min,int max){
//        Random random =new Random();
//        int[] array = new int[N];
//        for (int i=0;i<array.length;i++){
//            array[i]=random.nextInt(min,max);
//        }
//        return array;
//    }
//    public static int[] replaceByZero(int[] array) {
//        int[] arr = new int[array.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (array[i]<0) ? 0 : array[i];
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int N=15;
//        int min=-20;
//        int max=5;
//        int[] numbers = generateRandomArray(N,min,max);
//        System.out.println("Исходный массив:");
//        for (int number : numbers){
//            System.out.print(number +" ");
//        }
//        System.out.println();
//        int[] newNumders = replaceByZero(numbers);
//        System.out.println("Массив после замены:");
//        for (int element : newNumders){
//            System.out.print(element+" ");
//        }
//    }
//}

//13.1 Без создания массива.
//public class Main {
//    public static void replaceByZero(int[] array){
//        for (int i=0;i< array.length;i++){
//            if (array[i]<0) {
//                array[i]=0;
//            }
//        }
//    }
//    public static void main (String[] args){
//        int[] arr={-3,-2,-1,0,1,2,-3};
//        replaceByZero(arr);
//        for (int element : arr){
//            System.out.print(element+" ");
//        }
//    }
//}

//14.
//public class Main {
//    public static boolean comparisonSumm (int[] arr1,int[] arr2) {
//        int sum1=0;
//        int sum2=0;
//        for (int element : arr1){
//            sum1+=element;
//        }
//        for (int element : arr2){
//            sum2+=element;
//        }
//        boolean result = (sum1==sum2) ? true : false;
//        return result;
//    }
//    public static void main (String[] args){
//        int[] num1 ={1,2,3,4};
//        int[] num2 ={1,2,3};
//        System.out.print(comparisonSumm(num1,num2));
//    }
//}

//15.
//public class Main {
//    public static int differenceMaxMin (int[] array){
//        int max=array[0];
//        int min=array[0];
//        for (int i=1;i< array.length;i++){
//            if(array[i]>max){
//                max=array[i];
//            }
//        }
//        for (int i=1;i< array.length;i++){
//            if(array[i]<min){
//                min=array[i];
//            }
//        }
//        int result=max-min;
//        return result;
//    }
//    public static void main (String[] args){
//        int[] numbers={1,2,3,4,5,6,7};
//        System.out.print(differenceMaxMin(numbers));
//    }
//}
