//Задание 1.
/*public class Main {
    public static void main(String[] args) {
        int sizeA = 8;
        int sizeB = 8;
        for (int i = 0; i < sizeB; i++) {
            for (int j = 0; j < sizeA; j++) {
                if (i == 0 || i == sizeB - 1  || j == 0 || j == sizeA - 1) {
                    System.out.print("*   ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}*/

//Задание 2 (4).
/*public class Main {
    public static void main(String[] args) {
        int sizeB = 7; // глубина вниз (количество строк сверху вниз)
        for (int i = 1; i <= sizeB; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == sizeB) {
                    System.out.print("* ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}*/

// Задание 3(5).


// Задание 4(6).
//public class Main {
//    public static void main(String[] args) {
//        int sizeB = 8;// высота
//        int num = 1;
//        for (int i = 0; i <= sizeB; i++) {
//            for (int j = 0; j < sizeB - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < num; j++) {
//                if (j == 0 || j == num - 1 || i == sizeB) {
//                    System.out.print("*");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            num = num + 1;
//            System.out.println();
//        }
//    }
//}

//Задание 5(7).
/*public class Main {
    public static void main(String[] args) {
        int size = 8;
        int num = 1;
        //верх
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            num = num + 2;
            System.out.println();
        }
        //низ
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            num = num + 2;
            System.out.println();
        }
    }
}*/
public class Main {
    public static void main(String[] args) {

        int sizeB = 9;
        int num = 1;
        for (int i = 0; i <= sizeB; i++) {
            for (int j = 0; j <= sizeB - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                if (k == 0 || k == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            num = num + 2;
            System.out.println();
        }
        for (int i = sizeB; i > 0; i--) {
            for (int j = 0; j < sizeB - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}