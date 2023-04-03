import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(Fib(a));
    }
    public  static  int Fib(int a){
        if(a==0){
            return 0;
        } else if (a==1) {
            return 1;
        }
        return Fib(a-1) + Fib(a-2);
    }

}