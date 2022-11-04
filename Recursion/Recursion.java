public class Recursion {
    public static void main(String[] args) {
        System.out.println("Recursion: printing 1-5");

        print(1);
    }

    static void print(int n){
            //base case
        if(n==5){   //or we could say n>5 too and return;
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);   //recursive call

    }
}
