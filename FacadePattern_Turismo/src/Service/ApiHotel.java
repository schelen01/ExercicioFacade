package Service;

import Model.Hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiHotel {

    private List<Hotel> hoteis;

    public ApiHotel() {
        hoteis = new ArrayList<>();
        hoteis.add(new Hotel("Hotel Flor das Orquídeas", "São Paulo", new Date(2023, 03, 24), new Date(2023, 03, 27)));
        hoteis.add(new Hotel("Hotel das Acácias", "São Paulo", new Date(2023, 03, 24), new Date(2023, 03, 30)));
        hoteis.add(new Hotel("Hotel TOP", "Rio de Janeiro", new Date(2023, 03, 22), new Date(2023, 03, 25)));
        hoteis.add(new Hotel("Hotel Paradiso", "São Paulo", new Date(2023, 03, 20), new Date(2023, 03, 22)));

    }

    public List<Hotel> buscarHoteis(String cidade, Date entrada, Date saida) {
        List<Hotel> hoteisDisponiveis = new ArrayList<>();
        for (Hotel hotel : hoteis) {
            if (hotel.getCidade().equals(cidade) && hotel.getEntrada().equals(entrada) && hotel.getSaida().equals(saida)) {
                hoteisDisponiveis.add(hotel);
            }
        }
        return hoteisDisponiveis;
    }
}