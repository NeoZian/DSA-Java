public class SumOFn {
    public static void main(String[] args) {

        int sum = add(5);
        System.out.println(sum);
    }

    static int add(int n){

        if(n<=1){
            return n;
        }

        return n+add(n-1);

    }
}
