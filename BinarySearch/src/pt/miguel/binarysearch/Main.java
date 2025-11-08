package pt.miguel.binarysearch;


public class Main {

    public static void Exercicio1(){
        int [] arr = {1,3,5,6};
        int target = 5;
        boolean res = BinarySearch.ficha2ex1(arr, target);
        System.out.println("Exercio 1: " + (res ? "Target found!" : "Target not found!"));
    }

    public static void Exercicio2(){
        int [] arr = {1,3,5,6};
        int target = 5;
        boolean res = BinarySearch.ficha2ex2(arr, target);
        System.out.println("Exercio 2: " + (res ? "Target found!" : "Target not found!"));
    }

    public static void Exercicio3(){
        int [] arr = {1,3,5,6};
        int target = 5;
        int res = BinarySearch.ficha2ex3(arr, target);
        System.out.println("Exercio 3: " + (res >= 0 ? "Target found at index: " + res : "Target not found!"));
    }
    public static void Exercicio4(){
        int [] arr = {3,7,12,15};
        int target = 3;
        int res = BinarySearch.ficha2ex4(arr, target);
        System.out.println("Exercio 4: " + (res >= 0 ? "Target found at index: " + res : "Target sould be inserted at index: " + Math.abs(res + 1)));
    }


    public static void Exercicio5() {
        int[] arr = {3,7,12,15};
        int target = 100;
        int res = BinarySearch.ficha2ex4(arr, target);
        double percentage = ((double)(res<0?Math.abs(res+1):res) / arr.length) * 100;
        System.out.println("Exercio 5: " + percentage + "%");
    }

    /**
     * Calculate the number of elements in the array within the given range.
     *
     * @param arr   The sorted array to search.
     * @param lim_inf   The smallest value in the interval.
     * @param lim_sup   The highest value in the interval.
     * @return The number of elements in the given range.
     */
    public static int Exercicio6(int []arr , int lim_inf, int lim_sup){

        int posMin = BinarySearch.ficha2ex4(arr, lim_inf);
        int posMax = BinarySearch.ficha2ex4(arr, lim_sup);
        int nElements = (posMax<0?Math.abs(posMax+1):posMax)-(posMin<0?Math.abs(posMin+1):posMin);
        return nElements;


    }

    public static void main(String[] args) {
        int[] arr = {3,7,12,15};
        int target = 0;
        int lim_inf = 0;
        int lim_sup = 100;
        Exercicio1();
        Exercicio2();
        Exercicio3();
        Exercicio4();
        Exercicio5();
        {
            int nElements = Exercicio6(arr,0, 100);
            System.out.println("Interval ["+lim_inf+","+lim_sup+"]: Contains " +nElements + " elements.");
        }

        System.out.println(BinarySearch.recursiveSearch(arr,3,0,arr.length));


    }


}
