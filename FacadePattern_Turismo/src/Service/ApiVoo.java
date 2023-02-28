package Service;

import Model.Voo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiVoo {

        private List<Voo> voos;

        public ApiVoo() {
            voos = new ArrayList<>();
            voos.add(new Voo("Brasília", "São Paulo", new Date(2023, 3, 20), new Date(2023, 3, 22)));
            voos.add(new Voo("São Paulo", "Ceará", new Date(2023, 3, 30), new Date(2023, 4, 05)));
            voos.add(new Voo("Brasíla", "Espirito Santo", new Date(2023, 3, 20), new Date(2023, 3, 24)));
            voos.add(new Voo("Curitiba", "Tocantins", new Date(2023, 4, 20), new Date(2023, 4, 25)));
        }

        public List<Voo> buscarVoos(String destino, Date partida, Date retorno) {
            List<Voo> voosDisponiveis = new ArrayList<>();
            for (Voo voo : voos) {
                if (voo.getDestino().equals(destino) && voo.getPartida().equals(partida) && voo.getRetorno().equals(retorno)) {
                    voosDisponiveis.add(voo);
                }
            }
            return voosDisponiveis;
        }
    }

