import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    static int index;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        int[] arr =  {1,2,3,434,234,34,334,5454,22,34,546,77,90,99,30,35,83,87,53,153};

        System.out.println("Array:"+ Arrays.toString(arr));
        System.out.print("Enter the number you are searching for:");
        num = in.nextInt();

       boolean bl = isFound(arr, num);

       if(bl){
           System.out.println("Value "+num+" is found at index: "+index);
       }
       else {
           System.out.println(num+" was not found in the array!");
       }


    }

    static boolean isFound(int[] arr,int num){

        for (int i = 0; i <arr.length; i++) {

            if(arr[i] == num){
                index = i;
                return true;
            }

        }
        return false;

    }
}
