package pt.miguel.generics.exercise2;

public class Ponto <T,S extends T> {
    T p1;
    S p2;

    public Ponto(T p1, S p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public <A extends S, B extends A> void copy(Ponto<A, B> other){
        this.p1 = other.p1;
        this.p2 = other.p2;
    }

    @Override
    public String toString() {
        return "Ponto <" + p1.getClass().getSimpleName() + "," +p2.getClass().getSimpleName() + "> : " +
                "{" + p1 + "," + p2 + "}";
    }
}
