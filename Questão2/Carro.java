package Questão2;

public class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Acionando partida no carro!");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro: Pressione com mais força o pedal a esquerda para acelerar!");
    }

    @Override
    public void frear() {
        System.out.println("Carro: Use o pedal de frenagem a direita para reduzir sua velocidade!");
    }
}
