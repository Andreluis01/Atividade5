package Questão9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        PagamentoComCartao pagamentoCartao = new PagamentoComCartao(800, LocalDate.now(), "1234-5678-9012-3456");
        Pagamento pagamentoBoleto = new PagamentoBoleto(300, LocalDate.now(), "12345678901234567890123");

        System.out.println("Processando pagamento com cartão:");
        pagamentoCartao.processarPagamento();
        System.out.println("");

        System.out.println("Processando pagamento com boleto:");
        pagamentoBoleto.processarPagamento();
        System.out.println("");

        System.out.println("Estornar valor pago no cartão:");
        pagamentoCartao.estornar();
    }
}
