package CodingBlocks;
import java.util.Scanner;

public class HiQuestion {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.next();
        String str = "Ahibhihicihi";
        int res = countHi(str, 0);
        String s1= "hi";
        String s2="hi";
        System.out.println(s1==s2);
        System.out.println(res);
    }

    public static int countHi(String unprocessed, int c) {
        if (unprocessed.length() == 1)
            return c;
        String check = unprocessed.substring(0,2);
        unprocessed = unprocessed.substring(1);
        if (check=="hi") {
            return countHi(unprocessed, c+1 );
        }
        return countHi(unprocessed, c);
    }
}
//import java.util.Scanner;
//
//public class HiQuestion {
//    public static void main(String[] args) {
////        Scanner s = new Scanner(System.in);
////        String str = s.next();
//        String str = "Ahibhihicihi";
//        int res = countHi(str, 0);
//        String s1= "hi";
//        String s2="hi";
//        System.out.println(s1==s2);
//        System.out.println(res);
//    }
//
//    public static int countHi(String unprocessed, int c) {
//        if (unprocessed.length() == 1)
//            return c;
//        String check = unprocessed.substring(0,2);
//        unprocessed = unprocessed.substring(1);
//        if (check.equals("hi")) {
//            return countHi(unprocessed, c+1 );
//        }
//        return countHi(unprocessed, c);
//    }
//}