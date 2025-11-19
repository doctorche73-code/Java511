
// Метод trim
//public class Main {
//    public static char[] trim (char[] str){
//        //"___Страсть Господняя__"
//        int leftCount = 0;
//        for(int i =0;i< str.length;i++){
//            if(str[i] == ' '){
//                leftCount++;
//            }else{
//                break;
//            }
//        }
//        int rightCount = 0;
//        for (int i = str.length-1;i>=0;i--){
//            if(str[i] == ' '){
//                rightCount++;
//            }else {
//                break;
//            }
//        }
//        char[] newArr = new char[str.length-leftCount-rightCount];
//        for (int i = leftCount,j = 0;i< str.length-rightCount;i++,j++){
//            newArr[j] = str[i];
//        }
//        return newArr;
//    }
//    public static void main(String[] args){
//        String str = "   Страсть Господняя  ";
//        char[] arr = str.toCharArray();
//
//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println(trim(arr));
//        System.out.println(trim(arr).length);
//    }
//}

// Метод lTrim
//public class Main {
//    public static char[] lTrim (char[] str){
//        //"___Страсть Господняя__"
//        int leftCount = 0;
//        for(int i = 0;i< str.length;i++){
//            if(str[i] == ' '){
//                leftCount++;
//            }else{
//                break;
//            }
//        }
//        char[] newArr = new  char[str.length-leftCount];
//        for(int i = leftCount,j = 0;i< str.length;i++,j++){
//            newArr[j] = str[i];
//        }
//        return newArr;
//    }
//    public static void main(String[] args){
//        String str = "   Страсть Господняя  ";
//        char[] arr = str.toCharArray();
//
//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println(lTrim(arr));
//        System.out.println(lTrim(arr).length);
//    }
//}

//Метод rTrim
//public class Main {
//    public static char[] rTrim (char[] str){
//        //"___Страсть Господняя__"
//        int rightCount = 0;
//        for(int i = str.length-1;i>=0;i--){
//            if(str[i] == ' '){
//                rightCount++;
//            } else {
//                break;
//            }
//        }
//        char[] newArr = new char[str.length-rightCount];
//        for (int i = 0,j = 0;i< str.length-rightCount;i++,j++){
//            newArr[j] = str[i];
//        }
//        return newArr;
//    }
//    public static void main(String[] args){
//        String str = "   Страсть Господняя  ";
//        char[] arr = str.toCharArray();
//
//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println(rTrim(arr));
//        System.out.println(rTrim(arr).length);
//    }
//}

// Метод toLowerCase
//public class Main {
//    public static char[] toLowerCase (char[] str){
//        for (int i = 0;i< str.length;i++){
//            if(str[i] >= 65 && str[i] <= 90){
//                str[i]+=32;
//            }
//        }
//        return str;
//    }
//    public static void main (String[] args){
//        String str = "QWERTY";
//        char[] arr = str.toCharArray();
//
//        System.out.println(str);
//        System.out.println(toLowerCase(arr));
//    }
//}

// Метод toUpperCase
//public class Main {
//    public static char[] toUpperCase (char[] str){
//        for (int i = 0;i< str.length;i++){
//            if(str[i] >= 97 && str[i] <= 122){
//                str[i]-=32;
//            }
//        }
//        return str;
//    }
//    public static void main (String[] args){
//        String str = "qwerty";
//        char[] arr = str.toCharArray();
//
//        System.out.println(str);
//        System.out.println(toUpperCase(arr));
//    }
//}

//Метод length
//public class Main {
//    public static int length (char[] str){
//        int count = 0;
//        for (int i = 0;i< str.length;i++){
//            count++;
//        }
//        return count;
//    }
//    public static void main (String[] args){
//        String str = "Жесть";
//        char[] arr = str.toCharArray();
//        System.out.println(length(arr));
//    }
//}

//Метод charAt
//public class Main {
//    public static char charAt(char[] str, int index) {
//        return str[index];
//    }
//    public static void main (String[] args){
//        String str = "Жесть";
//        char[] arr = str.toCharArray();
//
//        System.out.println(charAt(arr,0));
//    }
//}

//Метод print
//public class Main {
//    public static void print (char[] str){
//        System.out.println(str);
//    }
//    public static void main (){
//        String str = "Жесть";
//        char[] arr = str.toCharArray();
//        print(arr);
//    }
//}

//Метод indexOf
//public class Main {
//    public static int indexOf(char[] arr, char symbl) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == symbl) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        String str = "Проклятие";
//        char[] arr = str.toCharArray();
//        System.out.println(indexOf(arr, 'ж'));
//    }
//}

//Метод lastIndexOf
//public class Main {
//    public static int lastIndexOf(char[] arr, char symbl) {
//        for (int i = arr.length-1; i >=0; i--) {
//            if (arr[i] == symbl) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        String str = "Проклятие";
//        char[] arr = str.toCharArray();
//        System.out.println(lastIndexOf(arr, 'ж'));
//    }
//}











