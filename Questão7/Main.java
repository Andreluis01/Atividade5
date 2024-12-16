package Questão7;

public class Main {
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Antônio José", 8000);
        Funcionario desenvolvedor = new Desenvolvedor("Maria Joana", 7500);

        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário " + gerente.getSalario());
        System.out.println("Bonificação: " + gerente.calcularBonificacao());
        System.out.println("");
        System.out.println("Desenvolvedor:");
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário: " + desenvolvedor.getSalario());
        System.out.println("Bonificação: " + desenvolvedor.calcularBonificacao());
    }
}
