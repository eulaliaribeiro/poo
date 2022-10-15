package Aula03;

// Abstraia animais para o sistema de petshop
// Os seguintes atributos devem ser considerados
//---- nome da especie do animal
//---- nome do pet
//---- nome do dono

// 2 animais utilizando o construtor vazio

// Abstraia agendamento para o sistema de petshop
// Os seguintes atributos devem ser considerados
//---- animal
//---- data do agendamento
//---- hora do agendamento

// Crie agendamento para os animais criados utilizando um construtor

import java.time.LocalDate;
import java.time.LocalTime;

public class Petshop {
    public static void main(String[] args) {
        Animal joana = new Animal();
        joana.especie = "Cachorro";
        joana.nomeAnimal = "Joana";
        joana.nomeDono = "Renan";

        Animal klaus = new Animal();
        klaus.especie = "Gato";
        klaus.nomeAnimal = "Klaus";
        klaus.nomeDono = "Maria";

        System.out.println(joana);
        System.out.println(klaus);

        Agendamento joanaAgendamento = new Agendamento(joana, "2022-10-15", "11:00");
        Agendamento klausAgendamento = new Agendamento(klaus, "2022-10-10", "09:00");

        System.out.println(joanaAgendamento);
        System.out.println(klausAgendamento);

    }

}
