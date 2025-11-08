package pt.miguel.generics.exercise2;

public class Exercise2 {
    public static int compareA(Figura figura, Figura other){
        return figura.compareTo(other);
    }

    public static <T extends Comparable<Figura>>int compareB(Figura figura, T other){
        return other.compareTo(figura);
    }

    public static <T extends Comparable<S>, S> int compareC(T obj, S other){
        return obj.compareTo(other);
    }

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
        Retangulo rectA = new Retangulo(50, 20);
        Retangulo rectB = new Retangulo(50,20);
        Retangulo rectC = new Retangulo(30,20);

        //Function compareA
        System.out.println("Resultado comparação de 2 Retangulos iguais: " + compareA(rectA, rectB));
        System.out.println("Resultado comparação de 2 Retangulos diferentes: " + compareA(rectA, rectC));
        System.out.println();

        //Function compareB
        System.out.println("Resultado comparação de 2 Retangulos iguais: " + compareB(rectA, rectB));
        System.out.println("Resultado comparação de 2 Retangulos diferentes: " + compareB(rectA, rectC));
        System.out.println();

        //Function compareC
        //Function compareB
        System.out.println("Resultado comparação de 2 Retangulos iguais: " + compareC(rectA, rectB));
        System.out.println("Resultado comparação de 2 Retangulos diferentes: " + compareC(rectA, rectC));


        //Exercise 4
        Integer[] intArr = {3,2,6,3};
        String[] strArr = {"Ada", "Albino"};

        System.out.println(compareEx4(intArr,2)); //true
        System.out.println(compareEx4(strArr,"Francisco")); //false


        //Exercise 5
        Ponto<Integer, Integer> p=new Ponto<>(3,4);
        Ponto<Number, Double> x=new Ponto<>(0,3.2);
        System.out.println(p); // imprime (3,4)
        System.out.println(x); // imprime (0,0)
        //x.copy(p);
        System.out.println(x); // imprime (3,4)

        Ponto<String, String> y = new Ponto<>("Miguel","m");
        System.out.println(y);

    }
}
