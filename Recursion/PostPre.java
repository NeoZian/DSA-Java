public class PostPre {
    public static void main(String[] args) {
        calling(5);
    }

    static int calling(int n ){

        if(n==0){
            return n;
        }
        System.out.println(n);
      //  return calling(n--); //gives an error :output always 5 and then stackoverflow
        return calling(--n);  //this works
    }
}
