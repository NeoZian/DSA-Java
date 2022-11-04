public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] arr = {4,5,6,44,54,56,66,76,79,86};
        int target = 44;

        int index = search(arr, target, 0, arr.length-1);

        System.out.println("Found at: "+index);

    }

    static int search(int[] arr, int target, int start, int end){


        if(start>end){
            return -1;
        }
        int mid = start+(end - start)/2;

        if(target == arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
           // end = mid-1;
            return search(arr,target,start,mid-1);
        }
        else {
           // start = mid +1;
            return search(arr,target,mid+1,end);

        }
      //  return search(arr,target,start,end);

    }


}
