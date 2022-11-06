package Array;

import java.util.ArrayList;

public class MultipleOccurrence {
    public static void main(String[] args) {

        int[] arr = {2,3,45,6,6,7,8,9,9,6,5,4};//how many indexes of 6
        int target = 6;
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(search(arr, target, 0, list));
        //or
        ArrayList<Integer> ans = search(arr, target, 0, new ArrayList<Integer>());
        System.out.println(ans);

    }
    static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
            return search(arr,target,++index,list);
    }
}
