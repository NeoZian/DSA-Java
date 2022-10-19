public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {-33,-4,-3,-1,2,5,6,7,22,25,46,78,84,89,98,99};

        int target=5;
        int index = binarySearch1(arr, target);

        System.out.println(index);

    }

    static int binarySearch1(int[] arr, int target){

        //we need 2 pointers, start/end
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            //should be=> (start_index+end_index)/2
            // but that might exceed the range of int in java!...so
            int mid = start + (end-start)/2;

            if (target<arr[mid]){

                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }


        }
        return -1;


    }
}
