import java.util.Arrays;
import java.util.Scanner;

public class SearchinRange {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9,0,11,22,33,44,55,66};
        System.out.println("The array: "+ Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        int start,end, elm;
        System.out.println("Enter starting index:");
        start = in.nextInt();
        System.out.println("Enter ending index:");
        end = in.nextInt();
        System.out.println("Enter searching element:");
        elm = in.nextInt();
        int ret = search(arr,start,end,elm);

        if(ret==-1){

            System.out.println("Element was not found in the range!");
        }
        else {

            System.out.println("Element was found at index: "+ret);
        }


    }


    static int search(int[]arr, int start, int end, int elm){

        for (int i = start; i < end; i++) {
            if(arr[i]==elm){

                return i;
            }
        }
        return -1;


    }
}
