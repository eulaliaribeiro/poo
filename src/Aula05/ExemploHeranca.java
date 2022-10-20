package Aula05;

import java.math.BigDecimal;

public class ExemploHeranca {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Angela", 123, BigDecimal.TEN);
        Estagiario estagiario = new Estagiario("Joao", 856, BigDecimal.ONE);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alexa", 416, BigDecimal.valueOf(9658.58));
        estagiario.trabalhar();
        gerente.contratar(estagiario);
        gerente.contratar(desenvolvedor);

        System.out.println(gerente);

    }
}
