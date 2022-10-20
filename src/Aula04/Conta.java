package Aula04;

public class Conta {
    private String titular;
    private String numeroConta;
    private String cpf;
    private Double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta(){
        return this.titular;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setSaldo(Double saldo) {
        if (saldo > 0){
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ser negativo");
        }
    }

    public Double getSaldo(){
        return saldo;
    }

    public Conta(String titular, String numeroConta, String cpf, Double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta + "\n" +
                "Titular: " + titular + "\n" +
                "Cpf: " + cpf + "\n" +
                "Saldo: R$ " + saldo + "\n";
    }
}
