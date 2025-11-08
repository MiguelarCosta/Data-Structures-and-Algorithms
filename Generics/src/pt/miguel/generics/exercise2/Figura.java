package pt.miguel.generics.exercise2;

public abstract class Figura implements Comparable<Figura>{

    /**
     * Método abstrato que as classes filhas (Rectangulo, Circulo, etc.)
     * devem implementar para devolver a sua área específica.
     *
     * @return A área calculada da figura.
     */
    public abstract double getArea();


    /**
     * Implementação do método da interface Comparable.
     * Compara esta figura com outra figura, com base nas suas áreas.
     *
     * @param other A outra Figura com a qual comparar.
     * @return  Um valor negativo se a área desta figura for menor que a da 'outra',
     * zero se as áreas forem iguais,
     * um valor positivo se a área desta figura for maior.
     */
    @Override
    public int compareTo(Figura other) {
        return Double.compare(this.getArea(), other.getArea());
    }
}
