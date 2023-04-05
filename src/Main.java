import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));

        


    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        } else if (n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

}