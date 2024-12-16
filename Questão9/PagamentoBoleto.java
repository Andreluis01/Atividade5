package Questão9;

import java.time.LocalDate;

public class PagamentoBoleto extends Pagamento{
    private String codigoBarras;

    public PagamentoBoleto(double valor, LocalDate data, String codigoBarras){
        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Pagamento processado!");
        System.out.println("Valor: " + getValor() + ", Data: " + getData());
        System.out.println("Código de barras: " + codigoBarras);
    }
}
