package Aula04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pix extends Transferencia {

    private boolean devolvida;

    private BigDecimal valorLimiteNoturno;

    public boolean isDevolvida() {
        return devolvida;
    }

    public void setDevolvida(boolean devolvida) {
        this.devolvida = devolvida;
    }

    public BigDecimal getValorLimiteNoturno() {
        return valorLimiteNoturno;
    }

    public void setValorLimiteNoturno(BigDecimal valorLimiteNoturno) {
        this.valorLimiteNoturno = valorLimiteNoturno;
    }

    public Pix(BigDecimal valor,
               Conta contaOrigem,
               Conta contaDestino,
               boolean devolvida
    ) {
        super(valor, contaOrigem, contaDestino, LocalDate.now(), TipoTransferencia.PIX);
        this.devolvida = devolvida;
        this.valorLimiteNoturno = BigDecimal.valueOf(1000.0);
    }

    @Override
    public void transferir(){
        System.out.println("Pix feito com sucesso!");
    }

    public void devolverDinheiro(){
        setDevolvida(true);
        System.out.println("Dinheiro devolvido");
    }
}
