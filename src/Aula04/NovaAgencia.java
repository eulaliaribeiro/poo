package Aula04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class NovaAgencia {
    public static void main(String[] args) {
        Conta contaMaria = new Conta("Maria", "1234", "999.999.99-99", 100.0);
        Conta contaJoao = new Conta("João", "7894", "123.123.123-56", 50.0);

        Scanner scanner = new Scanner(System.in);
        BigDecimal valor = scanner.nextBigDecimal();

        Transferencia transferencia = new Transferencia(
                valor,
                contaMaria,
                contaJoao,
                LocalDate.now(),
                TipoTransferencia.TED
        );

        Pix novoPix = new Pix(
                BigDecimal.TEN,
                contaMaria,
                contaJoao,
                false
        );

        Ted novoTed = new Ted(
                BigDecimal.ONE,
                contaJoao,
                contaMaria,
                LocalDate.now()
        );

        transferencia.transferir();
        novoPix.transferir();
        novoTed.transferir();

    }
}
