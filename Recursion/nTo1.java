public class nTo1 {
    public static void main(String[] args) {
        System.out.println("5to1");
        fun(5);
        System.out.println("1to5");
        funRev(5);
        System.out.println("together");
        together(5);
    }

    static void fun(int n){

        if(n<=0){  //or when n==0

            return;
        }

        System.out.println(n);
        fun(n-1);

    }

    static void funRev(int n){
        if(n==0){
            return;
        }

        funRev(n-1);
        System.out.println(n);
    }

    static void together(int n){

        if(n==0){
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        together(n-1);
        System.out.print(n+" ");

    }
}
