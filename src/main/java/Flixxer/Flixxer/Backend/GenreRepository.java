package Flixxer.Flixxer.Backend;

import Flixxer.Flixxer.Backend.DB.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
