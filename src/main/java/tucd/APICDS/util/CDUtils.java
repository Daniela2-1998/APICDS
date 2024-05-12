package tucd.APICDS.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tucd.APICDS.model.CD;
import tucd.APICDS.model.CDDto;
import tucd.APICDS.model.Dolar;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CDUtils {

    // Listado de ofertas.
    public List<CD> encontrarOfertas(List<CD> cds, double precioOferta){
        return cds.stream()
                .filter(cd -> cd.getPrecio() < precioOferta)
                .collect(Collectors.toList());
    }

    // Mapeo de CDS.
    public CDDto cdMapper(CD cd, double precio){
        return new CDDto(cd.getId(), cd.getNombre(), cd.getLanzamiento(),
                cd.getDuracion(), cd.getGenero(), cd.getPrecio());
    }

    //Creacion de listado de FlightDto con stream
    public List<CDDto> flightMapper(List<CD> cds, double precio) {
        return cds.stream()
                .map(c -> new CDDto(
                        c.getId(),
                        c.getNombre(),
                        c.getLanzamiento(),
                        c.getDuracion(),
                        c.getGenero(),
                        c.getPrecio() * precio))
                .collect(Collectors.toList());
    }

}
