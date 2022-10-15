package Aula01;

public class Funcionario {
    public double salario;
    public double desconto;
    public double bonus;
    public String nome;

    public int idade;

    public double calcularPagamento() {
        return salario + bonus - desconto;
    }

    public Funcionario(){

    }

    // constructor
    public Funcionario(double salario, double desconto, String nome){
        salario = this.salario;
        desconto = this.desconto;
        nome = this.nome;
    }
}


