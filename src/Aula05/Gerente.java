package Aula05;

import java.math.BigDecimal;
import java.util.Arrays;

public class Gerente extends Empregado {
    private int quantidadeEmpregados;
    private Empregado[] subordinados;

    public int getQuantidadeEmpregados() {
        return quantidadeEmpregados;
    }

    public void setQuantidadeEmpregados(int quantidadeEmpregados) {
        this.quantidadeEmpregados = quantidadeEmpregados;
    }

    public Empregado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empregado[] subordinados) {
        this.subordinados = subordinados;
    }

    public Gerente(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);
        this.quantidadeEmpregados = getQuantidadeEmpregados();
        this.subordinados = new Empregado[10];

    }

    public void contratar (Empregado novoEmpregado) {
        this.subordinados[quantidadeEmpregados] = novoEmpregado;
        this.quantidadeEmpregados++;
    }

    @Override
    public String toString() {
        return "Gerente {" +
                "quantidadeEmpregados=" + quantidadeEmpregados +
                ", subordinados=" + Arrays.toString(subordinados) +
                '}';
    }
}
