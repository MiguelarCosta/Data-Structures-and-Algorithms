package pt.miguel.generics.exercise2;

import pt.miguel.generics.exercise5.Ponto;

public class Exercise2 {

    public static <T extends Comparable<T>> boolean isRepeatedCompareTo(T[] arr, T value){
        int counter = 0;
        for(T element : arr){
            if(element.compareTo(value) == 0){
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
