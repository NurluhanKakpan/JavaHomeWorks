import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int fact_n = factorial(n);
        int fact_k = factorial(k);
        int s = factorial(n-k);
        System.out.println(fact_n/(fact_k*s));

        


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