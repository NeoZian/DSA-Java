//best case: O(n^2)
//worst case: O(n^2)
//stable ? ::no

/*
Initialize minimum value(min_idx) to location 0.
Traverse the array to find the minimum element in the array.
While traversing if any element smaller than min_idx is found then swap both the values.
Then, increment min_idx to point to the next element.
Repeat until the array is sorted.
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {1,0};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
        

    }

    static void selectionSort(int[] arr){
       // System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length-1 ; i++) {
            int min_idx=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[min_idx]>arr[j]){
                    min_idx = j;
                }
            }

            swap( arr, min_idx, i);

        //  System.out.println(Arrays.toString(arr));
        }
    }

    static void swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
