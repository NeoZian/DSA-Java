public class Factorial {
    public static void main(String[] args){

      //  int num = facto(4);
        int num = facto2(5);
        System.out.println(num);

    }
    static int facto(int n){  //mine
        int count=1;
        if(n<=0){
            return count;
        }
       return count = (facto(n-1) * n);
    }
    static int facto2(int n){

        if(n<=1){
            return 1;
        }
        return n*facto2(n-1);
    }

}
