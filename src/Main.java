import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        if (isAllDigits(word)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (Character.isDigit(s.charAt(0))) {
            return isAllDigits(s.substring(1));
        } else {
            return false;
        }
    }


}