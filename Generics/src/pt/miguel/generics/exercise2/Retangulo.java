package pt.miguel.generics.exercise2;

public class Retangulo extends Figura{

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Implementação concreta do método getArea() para um retângulo.
     *
     * @return A área (largura * altura).
     */
    @Override
    public double getArea() {
        return this.largura * this.altura;
    }

    // Métodos de acesso (getters), se necessários
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        // Útil para testes e debugging
        return "Retangulo[Largura=" + largura + ", Altura=" + altura + ", Área=" + getArea() + "]";
    }
}
