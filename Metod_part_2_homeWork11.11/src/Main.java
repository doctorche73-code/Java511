//    Задание 1+
//    Написать перегруженные методы multiply, которые могут умножать
//    два int числа, два double числа, три int числа,
//    или int и double число.

//public class Main {
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//    public static double multiply(double a, double b) {
//        return a * b;
//    }
//    public static int multiply(int a, int b, int c) {
//        return a * b * c;
//    }
//    public static double multiply(int a, double b){
//        return a*b;
//    }
//    public static void main(String[] args){
//        System.out.print(multiply(2,2));
//    }
//}

//    Задание 2+
//    Написать рекурсивный метод, который вычисляет сумму чисел от 1 до N.

//public class Main{
//    public static int sum (int N){
//        if(N==1){
//            return 1;
//        }
//        return N +sum(N-1);
//    }
//    public static void main(String[] args){
//        System.out.println(sum(4));
//    }
//}

//    Задание 3+
//    Написать метод, который принимает массив и число X,
//    и возвращает true если в массиве есть элемент больше X, иначе false.

//public class Main {
//    public static boolean comparisonWith(int[] array, int chisloX){
//       for(int element : array){
//           if(element>chisloX){
//               return true;
//           }
//       }
//       return false;
//    }
//    public static void main(String[] args){
//        int[] arr ={1,2,3,4,5};
//        int chisloX = 2;
//        System.out.print(comparisonWith(arr, chisloX));
//    }
//}

//    Задание 4+
//    Написать рекурсивный метод, который выводит числа от N до 1
//    в обратном порядке (каждое на новой строке).

//public class Main {
//    public static void printReversed (int N){
//        if(N<1){
//            return;
//        }
//        System.out.println(N);
//        printReversed(N-1);
//    }
//    public static void main (String[] args){
//        int N=6;
//        printReversed(N);
//    }
//}

//    Задание 5+
//    Написать перегруженные методы printInfo, один принимает строку
//    и выводит её,
//    второй принимает строку и число и выводит строку N раз.

//public class Main {
//    public static void printInfo (String str){
//        System.out.println(str);
//    }
//    public static void printInfo (String str,int N){
//        for (int i=0;i<N-1;i++){
//            System.out.println(str);
//        }
//    }
//    public static void main(){
//        printInfo("Ляля ляляля",10);
//    }
//}

//    Задание 6
//    Написать рекурсивный метод, который принимает массив и индекс,
//    и возвращает сумму всех элементов массива начиная с этого индекса
//    до конца.

//public class Main {
//    public static int arraySum (int[] array, int index){
//        if(index>=array.length){
//            return 0;
//        }
//        return array[index] + arraySum(array,index+1);
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arraySum(arr,0));
//    }
//}

//    Задание 7+
//    Написать метод, который принимает два числа A и B,
//    и возвращает их произведение используя только операцию сложения
//    (без использования *).

//public class Main {
//    public static int productViaAss (int A,int B){
//        int sum =0;
//        for(int i=0;i<B;i++){
//            sum+=A;
//        }
//        return sum;
//    }
//    public static void main(){
//        System.out.println(productViaAss(3,2));
//    }
//}

//    Задание 8+
//    Написать рекурсивный метод, который принимает массив и индекс,
//    и возвращает максимальный элемент в массиве начиная с этого индекса.

//public class Main {
//    public static int maxElement(int[] array, int index){
//        if(index==array.length-1){
//            return array[index];
//        }
//        int current = array[index];
//        int max = maxElement(array,index+1);
//        return Math.max(current, max);
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5};
//        System.out.println(maxElement(arr,2));
//    }
//}

//    Задание 9+
//    Написать перегруженные методы calculate: один складывает два числа,
//    второй вычитает второе из первого, третий принимает три числа и
//    возвращает их среднее арифметическое.

//public class Main {
//    public static int calculate(int a, int b) {
//        return a + b;
//    }
//    public static int calculate(int a, int b, boolean subtract) {
//        return a - b;
//    }
//    public static double calculate(int a, int b, int c) {
//        return (a + b + c) / 3.0;
//    }
//    public static void main(String[] args) {
//        System.out.print(calculate(1,2,true));
//    }
//}

//    Задание 10+
//    Написать рекурсивный метод, который вычисляет степень числа:
//    возводит число A в степень N (A^N).

//public class Main {
//    public static int power(int A, int N){
//        if(N==0){
//            return 1;
//        }
//        if(N<0){
//            return 1/ power(A,-N);
//        }
//        return A*power(A,N-1);
//    }
//    public static void main(){
//        System.out.println(power(2,3));
//    }
//}