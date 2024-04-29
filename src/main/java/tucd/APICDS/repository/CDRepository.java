package tucd.APICDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tucd.APICDS.model.CD;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CDRepository extends JpaRepository<CD, Long> {

    List<CD> findByGenero(String genero);

    List<CD> findByLanzamiento(LocalDateTime lanzamiento);
}
