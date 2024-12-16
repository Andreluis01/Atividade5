package Questão2;

public class Bicicleta implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Impulsionando a bicicleta para frente!");
    }

    @Override
    public void acelerar() {
        System.out.println("Bicicleta: Pedale mais rápido para mais velocidade!");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta: Pressione o manete direito para acionar o freio traseiro!");
    }
}
