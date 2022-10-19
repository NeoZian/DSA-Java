public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //try any of these array
       // int[] arr = {2,34,45,55,67,77,79, 80,88,94,99}; //ascending order
        int[] arr = {99,97,90,80,75,75,67,63,54,45,3,2,1};  //descending order


        int target = 75;
        int index = isFound(arr, target);
        System.out.println(index);

    }

    static int isFound(int[] arr, int target){

        boolean isAsc = arr[0] < arr[arr.length-1];  //returns true if ascending ordered array!!!

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if(isAsc){   //checking whether ascending or descending

                if(target<arr[mid]){

                    end = mid -1;

                } else if (target>arr[mid]) {
                    start = mid +1;
                }
                else {

                    return mid;
                }


            }

            else {

                if(target>arr[mid]){

                    end = mid -1;

                } else if (target<arr[mid]) {
                    start = mid +1;
                }
                else {

                    return mid;
                }

            }
        }
        return -1;

    }
}
