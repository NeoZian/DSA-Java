import java.lang.reflect.Array;
import java.util.Arrays;

public class FindingMinVal {
    public static void main(String[] args) {
        int[] arr= {23,454,6786,89,656,565,544,545,454,5454,45,4};
        System.out.println("Array:"+ Arrays.toString(arr));
        int min = findMin(arr);

        System.out.println("Min value of the array is:"+min);
    }

    static int findMin(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {  //or you can itterate the whole; like: arr.length
            if(arr[i+1]<min){   //if so then this logic should be:
                                  /*    if(arr[i]<min){
                                  min=arr[i]
                                  } */
                min = arr[i+1];
            }
        }
        return min;

    }
}
