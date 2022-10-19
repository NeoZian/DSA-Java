import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

        int[][] arr  = {

                {23,45,56,54,54},
                {445,65,766},
                {44,67,88,965}
        };

        System.out.println("2D Array:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


        Scanner in = new Scanner(System.in);


        int max_val = findMax(arr);
        System.out.println("Max value is:"+max_val);

        System.out.print("Enter the searching element:");
        int target = in.nextInt();
        int[] index = findIndex(arr,target);

        System.out.println(target+" was found at:"+Arrays.toString(index));


    }

    static int[] findIndex(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]==target){

                    return new int[] {i, j};
                }

            }

        }

        return new int[] {-1,-1};



    }
    static int findMax(int[][] arr){

        int max = arr[0][0];  //we could also use Integer.MIN_VALUE;
      //  int max = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {    //i=>row, j=col

                if(arr[i][j]>max){

                    max = arr[i][j];
                }
            }
        }

        return max;



    }

}
