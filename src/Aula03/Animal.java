package Aula03;

public class Animal {
    public String especie;
    public String nomeAnimal;
    public String nomeDono;

    public Animal(){}

    public Animal(String especie, String nomeAnimal, String nomeDono) {
        this.especie = especie;
        this.nomeAnimal = nomeAnimal;
        this.nomeDono = nomeDono;
    }

    @Override
    public String toString() {
        return "Animal {" +
                " Espécie: '" + especie + '\'' +
                ", nome no animal: '" + nomeAnimal + '\'' +
                ", nomedo dono: '" + nomeDono + '\'' +
                '}';
    }
}
