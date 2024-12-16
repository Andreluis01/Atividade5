package Questão9;
import java.time.LocalDate;

public abstract class Pagamento {
    private double valor;
    private LocalDate data;

    public Pagamento(double valor, LocalDate data){
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public abstract void processarPagamento();
}
