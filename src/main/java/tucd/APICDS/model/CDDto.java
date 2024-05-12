package tucd.APICDS.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CDDto {

    private Long id;

    private String nombre;

    private LocalDateTime lanzamiento;

    private int duracion;

    private String genero;

    private double precio;

    private Artista artista;


    // Constructor
    public CDDto(Long id, String nombre, LocalDateTime lanzamiento, int duracion, String genero, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
    }
}
