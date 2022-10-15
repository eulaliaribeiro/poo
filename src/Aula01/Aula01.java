package Aula01;

public class Aula01 {
    // static: o método é do escopo da classe, ou seja, não precisa instanciar!!
    public static void main(String[] args) {
        /*darOi();
        Integer resultadoSoma = soma(10,20);
        System.out.println("o resultado da soma é " + resultadoSoma);*/

        // a instância da classe Funcionário é o objeto gerente
        Funcionario gerente = new Funcionario();

        // atributos do objeto gerente
        gerente.salario = 10000;
        gerente.bonus = 400;
        gerente.desconto = 100;
        gerente.nome = "Eulália";

        // chamada do método pagamento do objeto gerente
        double pagamentoGerente = gerente.calcularPagamento();

        System.out.println("O pagamento do(a) "+ gerente.nome + " é: " + pagamentoGerente);

        Funcionario estagiario = new Funcionario();
        estagiario.salario = 1000;
        estagiario.bonus = 100;
        estagiario.desconto = 50;
        estagiario.nome = "Maria";

        double pagamentoEstagiario = estagiario.calcularPagamento();

        System.out.println("O pagamento do(a) estagiário(a) " + estagiario.nome + " é: " + pagamentoEstagiario);

        Carro fusca = new Carro();
        fusca.cor = "rosa";
        fusca.marca = "volks";
        fusca.numeroPortas = 2;
        fusca.placa = "xpt1234";

        Carro kombi = new Carro();
        kombi.cor = "branca";
        kombi.marca = "volks";
        kombi.numeroPortas = 4;
        kombi.placa = "iop0987";

    }

    private static void darOi() {
        System.out.println("oi");
    }

    public static Integer soma(Integer valor1, Integer valor2) {
        Integer resultadoSoma = valor1 + valor2;
        return resultadoSoma;
    }
}
