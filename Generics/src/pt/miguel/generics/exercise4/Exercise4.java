package pt.miguel.generics.exercise4;

public class Exercise4 {
    /**
     * Checks if in the given array exists an element greater than the object
     *
     * @param arr The given array
     * @param obj The object to check
     * @return True in the array exists an object greater than obj
     * @param <T> Any object comparable to 'obj'
     * @param <S>
     */
    public static <T extends Comparable<S>, S> boolean compareEx4(T[] arr, S obj){
        for(T element : arr){
            if(element.compareTo(obj) > 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //Exercise 4
        Integer[] intArr = {3,2,6,3};
        String[] strArr = {"Ada", "Albino"};

        System.out.println(compareEx4(intArr,2)); //true
        System.out.println(compareEx4(strArr,"Francisco")); //false

    }
}
