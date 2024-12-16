package Questão8;

public class Calculadora{
    public class Operacao implements OperacaoMatematica {

        @Override
        public int adicionar(int a, int b) {
            return a + b;
        }

        @Override
        public int multiplicar(int a, int b) {
            return a * b;
        }
    }
}
