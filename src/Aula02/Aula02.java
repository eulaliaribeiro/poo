package Aula02;

public class Aula02 {
    public static void main(String[] args) {

        Fruta banana = new Fruta();
        banana.nome = "banana prata";
        banana.cor = Cor.AMARELO;
        banana.quantidade = 5;

        banana.imprimir();

        Fruta maca = new Fruta();
        maca.nome = "maçã verde";
        banana.cor = Cor.VERDE;
        maca.quantidade = 10;

        maca.imprimir();

        Verdura alface = new Verdura();
        alface.nome = "alface americada";
        alface.cor = Cor.VERDE;
        alface.quantidade = 3;

        alface.imprimir();

        Verdura couve = new Verdura();
        couve.nome = "couve";
        couve.cor = Cor.VERDE;
        couve.quantidade = 10;

        couve.imprimir();


    }
}
