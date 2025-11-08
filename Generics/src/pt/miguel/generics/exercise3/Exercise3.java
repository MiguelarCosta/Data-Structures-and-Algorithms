package pt.miguel.generics.exercise3;

public class Exercise3 {

    public static int compareA(Figura figura, Figura other){
        return figura.compareTo(other);
    }

    public static <T extends Comparable<Figura>>int compareB(Figura figura, T other){
        return other.compareTo(figura);
    }

    public static <T extends Comparable<S>, S> int compareC(T obj, S other){
        return obj.compareTo(other);
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
    }
}
