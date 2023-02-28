package Service;

import Model.Hotel;
import Model.Voo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class ImplementarFacade implements IFacadeTurismo {

        private ApiVoo apiVoo;
        private ApiHotel apiHotel;

        public ImplementarFacade() {
            this.apiVoo = new ApiVoo();
            this.apiHotel = new ApiHotel();
        }

        @Override
        public void buscarViagem(Date partida, Date retorno, String destino) {

            List<Voo> voos = apiVoo.buscarVoos(destino,partida, retorno);
            List<Hotel> hoteis = apiHotel.buscarHoteis(destino, partida, retorno);

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setTimeZone(TimeZone.getTimeZone("GMT-3"));

            System.out.println("Cidade de destino: " + destino);


            System.out.println("------------------------------");

            System.out.println("Voos encontrados:");
            for (Voo voo : voos) {
                System.out.println("+ Voo com origem " + voo.getOrigem() + " e destino " + voo.getDestino());
            }

            System.out.println("Hoteis encontrados:");
            for (Hotel hotel : hoteis) {
                System.out.println("+ " + hotel.getNome() + " - " + hotel.getCidade());
            }

        }
    }

