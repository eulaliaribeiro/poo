package Aula02;

public class Fruta {
    public String nome;
    public Cor cor;
    public Integer quantidade;


    public void imprimir() {
        System.out.println(
                "Nome: " + nome +
                "\nCor: " + cor +
                "\nQuantidade: " + quantidade
        );
    }
}
