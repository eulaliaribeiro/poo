package Aula03;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
    public Animal animal;
    public String data;
    public String hora;

    public Agendamento(){}

    public Agendamento(Animal animal, String data, String hora){
        this.animal = animal;
        this.data = String.valueOf(LocalDate.parse(data));
        this.hora = String.valueOf(LocalTime.parse(hora));
    }

    @Override
    public String toString() {
        return "Agendamento {" +
                " Nome do animal: " + animal.nomeAnimal +
                ", espécie: " + animal.especie +
                ", nome do dono: " + animal.nomeDono +
                ", data: " + data +
                ", hora: " + hora +
                '}';
    }
}
