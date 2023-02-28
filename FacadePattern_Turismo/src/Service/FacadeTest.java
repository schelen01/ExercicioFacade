package Service;

import Model.Hotel;
import Model.Voo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class FacadeTest {

    @Test
    public void buscarViagemIdeal() {
        ImplementarFacade facade = new ImplementarFacade();

        // Define as datas de partida, retorno e cidade de destino
        Date partida = new Date(2023, 3, 20);
        Date retorno = new Date(2023, 3, 22);
        String destino = "São Paulo";

        facade.buscarViagem(partida, retorno, destino);

        // Verifica se foram encontrados voos
        ApiVoo apiVoo = new ApiVoo();
        List<Voo> voos = apiVoo.buscarVoos(destino, partida, retorno);
        Assert.assertFalse(voos.isEmpty());

        // Verifica se foram encontrados hotéis
        ApiHotel apiHotel = new ApiHotel();
        List<Hotel> hoteis = apiHotel.buscarHoteis(destino, partida, retorno);
        Assert.assertFalse(hoteis.isEmpty());
    }
}
