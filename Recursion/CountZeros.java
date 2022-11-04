public class CountZeros {
    public static void main(String[] args) {
        int num = 78070;

        int zeros = counter(num);
        System.out.println(zeros);
    }

    static int count=0;
    static int rem;
    static int counter(int n){

        if(n%10==n){
            return n;
        }
        rem = n%10;
        if(rem == 0){
            count++;
        }
        counter(n/10);
        return count;

    }
}
