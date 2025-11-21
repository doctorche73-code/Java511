
//Метод substring(int startIndex)
//public class Main {
//    public static char[] substring(char[] str, int startIndex) {
//        int newSize = str.length- startIndex;
//        char[] array = new char[newSize];
//        for (int i = startIndex,j=0;i<str.length;i++,j++){
//            array[j] = str[i];
//        }
//        return array;
//    }
//    public static void main(String[] args){
//        String str = "Ёклмнёпрст";
//        char[] arr = str.toCharArray();
//        System.out.println(substring(arr,3));
//    }
//}

//Метод substring(int startIndex,int stopIndex) (со старт до стоп включительно)
//public class Main {
//    public static char[] substring (char[] str,int startIndex,int stopIndex){
//        int newSize = stopIndex-startIndex+1;
//        char[] array = new  char[newSize];
//        for(int i =startIndex,j=0;i<=stopIndex;i++,j++){
//            array[j]=str[i];
//        }
//        return array;
//    }
//    public static void main(String[] args){
//        String str = "Ёклмнёпрст";
//        char[] arr = str.toCharArray();
//        System.out.println(substring(arr,1,5));
//    }
//}

////Метод equalsIgnoreCase
//public class Main {
//    public static boolean equalsIgnoreCase (char[] str1,char[] str2){
//        if(str1.length != str2.length) return false;
//
//        for(int i=0;i<str1.length;i++){
//            char s1=str1[i];
//            char s2=str2[i];
//            if(65 <= s1 && s1 <= 90)  s1+=32;
//            if(65 <= s2 && s2 <= 90)  s2+=32;
//            if (s1 != s2) return false;
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        String str1 ="QWERTY";
//        String str2 ="qwertx";
//        System.out.println("Строки равны, скажи? - "+equalsIgnoreCase(str1.toCharArray(),str2.toCharArray()));
//    }
//}

//Метод equals
//public class Main {
//    public static boolean equalsIgnoreCase (char[] str1,char[] str2){
//        if(str1.length != str2.length) return false;
//
//        for(int i=0;i<str1.length;i++){
//            char s1=str1[i];
//            char s2=str2[i];
//            if (s1 != s2) return false;
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        String str1 ="QWERTY";
//        String str2 ="QWERTY";
//        System.out.println("Строки равны, скажи? - "+equalsIgnoreCase(str1.toCharArray(),str2.toCharArray()));
//    }
//}

//Метод concat
//public class Main {
//    public static char[] concat (char [] str1, char[] str2){
//       char[] array = new char[str1.length+ str2.length];
//       for(int i=0;i< str1.length;i++){
//          array[i]=str1[i];
//       }
//       for(int i=0;i< str2.length;i++){
//          array[i+ str1.length]=str2[i];
//       }
//       return array;
//    }
//    public static void main(){
//        String str1 = "Здравс";
//        String str2 = "твуйте, я ваша тетя!";
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        System.out.println(concat(arr1,arr2));
//    }
//}

//Метод startsWith
//public class Main {
//    public static boolean startsWith(char[] str1, char[] str2){
//        for (int i=0;i< str2.length;i++){
//           char c1 = str1[i];
//           char c2 = str2[i];
//           if (c1 != c2) return false;
//        }
//        return true;
//    }
//    public static void main (){
//        String str1 ="Ёлки-иголки";
//        String str2 ="Ёл";
//        char[] arr1=str1.toCharArray();
//        char[] arr2=str2.toCharArray();
//        System.out.println(startsWith(arr1,arr2));
//    }
//}

//Метод endsWith
//public class Main {
//    public static boolean endsWith (char[] str1, char[] str2) {
//        char[] newStr1 = new char[str1.length];
//        for (int i = 0; i < str1.length; i++) {
//            newStr1[i] = str1[str1.length - 1 - i];
//        }
//        char[] newStr2 = new char[str2.length];
//        for (int i = 0; i < str2.length; i++) {
//            newStr2[i] = str2[str2.length - 1 - i];
//        }
//        for (int i=0;i< newStr2.length;i++){
//           char c1 = newStr1[i];
//           char c2 = newStr2[i];
//           if (c1 != c2) return false;
//        }
//        return true;
//    }
//
//    public static void main (){
//        String str1 ="Ёлки-иголки";
//        String str2 ="жки";
//        char[] arr1=str1.toCharArray();
//        char[] arr2=str2.toCharArray();
//        System.out.println(endsWith(arr1,arr2));
//    }
//}



