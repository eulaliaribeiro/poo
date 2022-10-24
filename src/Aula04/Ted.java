package Aula04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ted extends Transferencia {

    private final LocalTime horaLimite = LocalTime.of(18,0,0);

    public Ted(BigDecimal valor,
               Conta contaOrigem,
               Conta contaDestino,
               LocalDate dataTransferencia
    ) {
        super(valor, contaOrigem, contaDestino, dataTransferencia, TipoTransferencia.TED);
    }

    @Override
    public void transferir() {
        System.out.println("Transferência Ted concluída com sucesso!");
    }
}
