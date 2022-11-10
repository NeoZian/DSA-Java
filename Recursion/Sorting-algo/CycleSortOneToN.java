import java.util.Arrays;

/*
This method is only applicable when given array values or elements are in the range of 1 to N or  0 to N.
 In this method, we do not need to rotate an array

Worst Case : O(n)
Average Case: O(n)
Best Case : O(n)

 */

public class CycleSortOneToN {
    public static void main(String[] args) {

        int[] arr = {7,4,5,3,6,2,1};
        System.out.println(Arrays.toString(arr));
      //  we'll need a while loop since we have to check before run

        int i = 0;
        while (i<arr.length-1){  //or arr.length


            if(arr[i] != i+1){

                int correct_index = arr[i]-1;
                swap(arr,i,correct_index);
                System.out.println(Arrays.toString(arr));

            }
            else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] =temp;
    }
}
