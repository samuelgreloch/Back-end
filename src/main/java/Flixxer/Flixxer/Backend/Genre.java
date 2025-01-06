package Flixxer.Flixxer.Backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface Genre extends JpaRepository<Genre, Long> {
}
