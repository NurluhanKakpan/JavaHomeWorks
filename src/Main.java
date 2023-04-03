import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (isPrime(a,(int)(Math.sqrt(a)))){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
  public static boolean isPrime(int a,int i){
        if(i <= 1){
            return true;
        } else if (a%i == 0) {
            return false;
        }
        return isPrime(a,i-1);
    }
}