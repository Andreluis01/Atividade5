package Questão6;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Retangulo(4,8));
        formas.add(new Triangulo(2,4));

        for (Forma forma : formas) {
            System.out.printf("A área da forma é: %.2f%n", forma.calcularArea());
        }
    }
}
