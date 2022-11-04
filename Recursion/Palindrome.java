public class Palindrome {
    public static void main(String[] args) {

        int num = 9091;
        int rev = reverse(num);
        System.out.println("reverse:"+rev);
        if(num == rev){
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not a Palindrome!");
        }

    }
    static int sum=0;
    static int rem;
    static int reverse(int n){

        if(n<=0){
            return n;
        }
        rem = n%10;
        sum = (sum*10) + rem;
        reverse(n/10);
        return sum;
    }
}
