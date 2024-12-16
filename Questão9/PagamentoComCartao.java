package Questão9;

import java.time.LocalDate;

public class PagamentoComCartao extends Pagamento implements Cartão{
    private String numeroCartao;

    public PagamentoComCartao(double valor, LocalDate data, String numeroCartao){
        super(valor, data);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(){
        if(autorizar()){
            System.out.println("Pagamento autorizado!");
            System.out.println("Valor: " + getValor() + ", Data: " + getData());
        }else{
            System.out.println("Pagamento recusado!");
            estornar();
        }
    }

    @Override
    public boolean autorizar(){
        return true;
    }
    @Override
    public boolean estornar(){
        System.out.println("Valor estornado para o cartão.");
        return true;
    }
}
