package Questão8;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        OperacaoMatematica operacao = calculadora.new Operacao();

        int somar = operacao.adicionar(100, 100);
        int multiplicar = operacao.multiplicar(15,15);

        System.out.println("Resultado da soma: " + somar);
        System.out.println("Resultado da multiplicação: " + multiplicar);
    }
}
