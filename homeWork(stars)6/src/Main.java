
public class Main {
    public static void main(String[] args) {
/*//Задание 1.
        int sizeA = 5; //длина строки
        int sizeB = 8; // глубина вниз (количество строк сверху вниз)
        for (int i = 0; i < sizeB; i++) {
            for (int j = 0; j < sizeA; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}*/

//Задние 2.
        /*int sizeB = 8;
        for (int i = 0; i < sizeB; i++ ) {
            for (int j = 0; j < i; j++) {
                System.out.print("    "); // четыре пробела - так красивее
            }
            System.out.println("*");
        }
    }
}*/

//Задние 3.
      /*  int sizeB = 8;
        for (int i = 0; i < sizeB; i++) {
            for (int j = sizeB; j > i; j--) {
                System.out.print("    ");
            }
            System.out.println("*");
        }
    }
}*/

//Задание 4.
      /*  int sizeA = 5; //ширина, здесь не работает
        int sizeB = 7; // глубина вниз (количество строк сверху вниз)
        for (int i = 0; i < sizeB; i++ ) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//Задание 5.
        //int sizeA = 5; //ширина (здесь тоже не работает)
       /* int sizeB = 7; // глубина вниз (количество строк сверху вниз)
        for (int i = sizeB; i >= 0; i --) {
            for (int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//Задание 6.
     /*  int sizeB = 8;
        for (int i = 0; i < sizeB; i++) {
            for (int j = 0; j < sizeB - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Задание 7.
     /*   int sizeB1 = 9;
        int sizeB2 = 9;
        for (int i = 0; i < sizeB1; i++) {
            for (int j = 0; j < sizeB1 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = sizeB2; i > 0; i--) {
            for (int j = 0; j < sizeB2 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */