# Binary Search
- Description: A search algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search interval in half.
- Time Complexity: O(log n)
- Space Complexity: O(1)
## Key Idea:
  1. Start with the entire array as the search interval.
  2. Find the middle element of the current interval.
  3. If the middle element is equal to the target, return its index.
  4. If the target is less than the middle element, narrow the search to the left half of the array.
  5. If the target is greater than the middle element, narrow the search to the right half of the array.
  6. Repeat steps 2–5 until the target is found or the search interval is empty.

## Implementation:
```java
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
```
  