package Array;

public class RotatedBinarySearch {
    public static void main(String[] args) {

        int[] arr= {4,5,6,7,8,9,10,15,1,2,3};
        int target =  10;


        int index = search(arr, target, 0 , arr.length-1);
        System.out.println(index);

        int pivot = findPivot(arr,0,arr.length-1);
        System.out.println("Pivot="+arr[pivot]);

        if(arr[pivot]==target){
            System.out.println("index:"+pivot);
        }
        else if(target>=arr[0]){
                int index2 = search2(arr, target, 0, pivot-1);
                System.out.println(index2);
            }
            else {
                int index2 = search2(arr, target, pivot + 1, arr.length - 1);
                System.out.println(index2);

            }


    }

    static int search(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end -start)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<= arr[mid]){
            if(target>=arr[start]&& target<=arr[mid]){
                end = mid-1;
                return search(arr,target,start,end);
            }
            else {
                start =  mid+1;
                return search(arr,target,start,end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            start = mid +1;
            return search(arr,target,start,end);
        }
        else {
            end = mid-1;
            return search(arr,target,start,end);
        }




    }


    //another way by finding pivot then search either direction in binary
    //search pivot

    static int findPivot(int[] arr, int start, int end){

//        int start=0;
//        int end = arr.length-1;

//        while (start<=end){

            if(start>end){
                return -1;
            }
            int mid = start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                start = mid+1;
                return findPivot(arr,start,end);
            }
            else {
                end = mid-1;
                return findPivot(arr,start,end);
            }


//        }
//        return -1;

    }

    static int search2(int[] arr, int target, int start, int end){

//        while (start<=end){
        if(start>end){
            return -1;
        }

            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
               end = mid-1;
               return search2(arr,target,start,end);
            }
            else {
               start = mid+1;
               return search2(arr,target,start,end);
            }
//        }
//        return -1;

    }
}
