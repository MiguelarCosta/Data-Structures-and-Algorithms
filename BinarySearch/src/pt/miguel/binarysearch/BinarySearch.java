package pt.miguel.binarysearch;

import java.util.Arrays;

public class BinarySearch {
    /**
     * Performs an iterative binary search on a sorted array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return True if the target is found, false otherwise.
     */
    public static int iterativeSearch(int[] arr, int target) {
        if(arr == null || arr.length == 0)
            return -1;

        int start = 0;
        int end = arr.length-1;
        int mid = end/2;

        do{
            if(arr[mid] == target)
                return mid;
            if(arr[mid] > target)
                end = mid-1;
            if(arr[mid] < target)
                start = mid+1;

            mid = (start+end)/2;
        }while (start<=end);

        return -1;
    }

    /**
     * Performs a recursive binary search on a sorted array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return The index of the target if found, -1 otherwise.
     */
    public static int recursiveSearch(int[]arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int mid = arr.length/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid]<target)
            return recursiveSearch(Arrays.copyOfRange(arr,mid+1,arr.length), target);
        else
            return recursiveSearch(Arrays.copyOfRange(arr,0,mid), target);

    }
}
