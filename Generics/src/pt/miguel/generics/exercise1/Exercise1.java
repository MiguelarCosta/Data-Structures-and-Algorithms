package pt.miguel.generics.exercise1;

public class Exercise1 {
    /**
     * Check if a generic type value is repeated in a given array, compares by reference.
     *
     * @param arr   The array of generic type values
     * @param value The generic type value to check if is repeated in array.
     * @return  True is repeated in the array, False 1 or 0 occurrences in the array.
     * @param <T> Generic type
     */
    public static <T> boolean isRepeatedReference(T[] arr, T value){
        int counter = 0;
        for(T element : arr){
            if(element == value){
                counter++;
                if(counter > 1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
