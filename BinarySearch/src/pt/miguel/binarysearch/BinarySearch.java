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

    // Ficha 2 - Ex 1
    /**
     * Checks if a target value exists in the array using recursive binary search.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return True if the target is found, false otherwise.
     */
    public static boolean ficha2ex1(int[] arr, int target){
        if(arr == null || arr.length == 0)
            return false;
        int mid = arr.length/2;
        if(arr[mid] == target)
            return true;
        if(arr[mid]<target)
            return ficha2ex1(Arrays.copyOfRange(arr,mid+1,arr.length), target);
        else
            return ficha2ex1(Arrays.copyOfRange(arr,0,mid), target);
    }
    // Ficha 2 - Ex 2
    /**
     * Checks if a target value exists in the array using iterative binary search.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return True if the target is found, false otherwise.
     */
    public static boolean ficha2ex2(int[] arr, int target){
        if(arr == null || arr.length == 0)
            return false;

        int start = 0;
        int end = arr.length-1;
        int mid = end/2;

        do{
            if(arr[mid] == target)
                return true;
            if(arr[mid] > target)
                end = mid-1;
            if(arr[mid] < target)
                start = mid+1;

            mid = (start+end)/2;
        }while (start<=end);

        return false;
    }

    // Ficha 2 - Ex 3
    /**
     * Finds the index of the first occurrence of the target value in the array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return The index of the first occurrence of the target, or -1 if not found.
     */
    public static int ficha2ex3(int[] arr, int target){
        if(arr == null || arr.length == 0)
            return -1;

        int start = 0;
        int end = arr.length-1;
        int mid = end/2;

        do{
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target)
                end = mid-1;
            else
                start = mid+1;

            mid = (start+end)/2;
        }while (start<=end);
        return -1;
    }

    // Ficha 2 - Ex 4
    /**
     * Finds the index of the first occurrence of the target value in the array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return The index of the first occurrence of the target, or -X if not found, X being the position where it should be inserted.
     */
    public static int ficha2ex4(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return -1;

        int start = 0;
        int end = arr.length - 1;
        int mid = end / 2;

        do {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;

            mid = (start + end) / 2;
        } while (start <= end);
        return -start-1;
    }
}
