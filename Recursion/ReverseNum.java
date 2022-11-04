public class ReverseNum {
    public static void main(String[] args) {
      //  int num = 556;
        int num = reverse(4567);
        System.out.println(num);
    }

    static int sum = 0;
    static int rem;
    static int reverse(int n){

        if(n<=0){
            return n;
        }
         rem = n%10;
        sum = (sum*10) + rem ;
        reverse(n/10);
        return sum;


    }


}


