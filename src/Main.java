import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.println(power(a,n));
    }
   public static int power(int a, int n){
        int f = a;
        if(n==1){
            return a;
        }
        else return a*power(a,n-1);
   }

}