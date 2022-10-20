package Aula04;

public class Agencia {
    public static void main(String[] args) {
        Conta contaMaria = new Conta("Maria", "1234", "999.999.99-99", 100.0);
        Conta contaJoao = new Conta("João", "7894", "123.123.123-56", 50.0);

        sacar(40.0, contaMaria);

        transferir(100.0, contaMaria, contaJoao);

        System.out.println(contaMaria);
        System.out.println(contaJoao);
    }

    public static void sacar(Double valor, Conta conta){
        conta.setSaldo(conta.getSaldo() - valor);
    }

    public static void transferir(Double valor, Conta contaOrigem, Conta contaDestino) {
        contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }

    public static void pagar(Double valor, Conta conta){
        conta.setSaldo(conta.getSaldo() - valor);
    }

}
