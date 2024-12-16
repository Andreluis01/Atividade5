package Questão3;

public class Pato implements Voador, Nadador{
    @Override
    public void voar() {
        System.out.println("Pato diz:");
        System.out.println("Posso voar!");
    }

    @Override
    public void nadar() {
        System.out.println("Também posso nadar!");
    }
}