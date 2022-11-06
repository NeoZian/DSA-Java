package Array;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {2,3,56,33,223,76,454,343,67,787,4};
        int target = 33;
        int index = search(arr, target,0);
        System.out.println("Found at:" + index);

    }
    static int search(int[] arr,int target, int i){

        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else {
            return search(arr,target,++i);
        }
    }

}
