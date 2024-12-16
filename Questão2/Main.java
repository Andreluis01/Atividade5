package Questão2;

public class Main {
    public static void main(String[] args){
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();

        c.ligar();
        c.acelerar();
        c.frear();

        b.ligar();
        b.acelerar();
        b.frear();
    }
}
