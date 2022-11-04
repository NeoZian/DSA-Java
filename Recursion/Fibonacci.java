import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter the nth position for fibonacci series:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans);
    }

    static int fibonacci(int n){
     //   System.out.print(n+" ");
        if(n<2){
            return n;
        }
       // System.out.println(n);
        return fibonacci(n-1) + fibonacci(n-2);

    }

}
