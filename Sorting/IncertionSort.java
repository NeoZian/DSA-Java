import java.util.Arrays;

/*

This algorithm is one of the simplest algorithm with simple implementation
Basically, Insertion sort is efficient for small data values
Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.
Time Complexity: O(N^2)
Auxiliary Space: O(1)

 */

public class IncertionSort {
    public static void main(String[] args) {

        int[] arr = {4,3,6,0,-2,2,-7-1,9};
        sort s = new sort();
        s.incertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static class sort{

        void incertion(int[] arr){

            int len = arr.length;

            for (int i = 1; i <= len-1; i++) {
                for (int j = i; j>0 ; j--) {
                    if( arr[j]<arr[j-1]){

                        swap(arr, j,j-1);

                    }
                    else {
                        break;  // we don't need to check since it's already a greater value than the sorted array last element
                    }
                    System.out.println(Arrays.toString(arr));
                }

            }
        }

        void swap(int[] arr, int a, int b){

            int temp =arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }

    }

}
