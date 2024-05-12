package tucd.APICDS.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@Entity
@Table(name = "cds")
public class CD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lanzamiento;

    private int duracion;

    private String genero;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "artista_id")
    private Artista artista;


    // CONSTRUCTORES
    public CD() {
    }

    public CD(String nombre, LocalDateTime lanzamiento, int duracion, String genero, double precio) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
    }

    public CD(Long id, String nombre, LocalDateTime lanzamiento, int duracion, String genero, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
    }

    public CD(Long id, String nombre, LocalDateTime lanzamiento, int duracion, String genero, double precio, Artista artista) {
        this.id = id;
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
        this.artista = artista;
    }

    // GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDateTime lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public  double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
