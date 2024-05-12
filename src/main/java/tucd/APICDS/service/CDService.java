package tucd.APICDS.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tucd.APICDS.configuration.CDConfiguration;
import tucd.APICDS.model.Artista;
import tucd.APICDS.model.CD;
import tucd.APICDS.model.CDDto;
import tucd.APICDS.model.Dolar;
import tucd.APICDS.repository.ArtistaRepository;
import tucd.APICDS.repository.CDRepository;
import tucd.APICDS.util.CDUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CDService {

    @Autowired
    CDRepository cdRepository;

    @Autowired
    CDUtils cdUtils;

    @Autowired
    CDConfiguration cdConfiguration;

    @Autowired
    ArtistaRepository artistaRepository;

    private double getDolar() {
        Dolar dolar = cdConfiguration.fetchDolar();
        return dolar.getPromedio();
    }

    // Retornar todos los registros.
    public List<CDDto> findAll(){
        List<CD> listaCds = cdRepository.findAll();
        return listaCds.stream()
                .map(cd -> cdUtils.cdMapper(cd, getDolar()))
                .collect(Collectors.toList());
    }

    // Crear registro.
    public CD createCD(CD cd, Long artistaId){
        Artista artista = artistaRepository.findById(artistaId)
                .orElseThrow(() -> new IllegalArgumentException("No fue posible encontrar al artista"));

        cd.setArtista(artista);
        return cdRepository.save(cd);

    }

}
