package Flixxer.Flixxer.Backend.repositories;

import Flixxer.Flixxer.Backend.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface PostRepository extends JpaRepository<Post, Long> {
}
