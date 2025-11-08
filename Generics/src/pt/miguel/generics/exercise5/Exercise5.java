package pt.miguel.generics.exercise5;

public class Exercise5 {
    public static void main(String[] args) {

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
