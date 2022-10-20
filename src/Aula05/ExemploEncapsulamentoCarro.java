package Aula05;

import Aula01.Carro;

public class ExemploEncapsulamentoCarro {
    public static void main(String[] args) {
        Carro celta = new Carro();
        celta.setCor("azul bebê");
    }

    public static void pintarCarro(String cor, Carro carro) {
        if(cor.equals(carro.getCor())){
            carro.setCor(cor);
            System.out.println("A cor do carro foi pintada para " + carro.getCor());
        } else {
            System.out.println("A cor do carro já é " + cor);
        }
    }

}
