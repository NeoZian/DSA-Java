package Array;

public class Sorted {
    public static void main(String[] args) {

        int[] arr = {3,4,6,9,22,44,56,88,78};
        boolean ans = checker(arr,0, true);
        System.out.println(ans);

    }

    static boolean checker(int[] arr, int f, boolean val){

        if(f==arr.length-1){
            return true;
        }
//        if(val == false){
//            return val;
//        }
        if(arr[f]<arr[f+1]){
            return checker(arr,++f,val);
        }
        else {
           // val = false;
            return false;
        }
    }
}
