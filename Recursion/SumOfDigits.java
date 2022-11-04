public class SumOfDigits {
    public static void main(String[] args) {
        int n =0;
        int total = sum(n);
        int prod = product(n);
        System.out.println("digits sum:"+total+"\n product:"+prod);
    }

    static int sum(int n) {

        if (n <= 0) {
            return n;
        }
        int digit = n % 10;
        return digit + sum(n / 10);   // return (n%10) + sum(n/10)    :samjhona -.)
    }
    static int product(int n){

        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
