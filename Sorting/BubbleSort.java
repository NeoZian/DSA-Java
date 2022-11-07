import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        //best case O(n)
        //worst case O(n^2)

      //  int[] arr= {11,4,1,7,2,9,8,8};
      //  int[] arr= {1,2,3,4,5,6,7};
       // int[] arr= {11,-4,4,1,7,2,9,-88,8};
        int[] arr= {1,2,3,4,5,6,7,9,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {  //to run every step
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;

                }

            }
            if (!swap){
                return; //this function is terminated since nothing was found there to be swapped!!!
            }
        }


    }
}
