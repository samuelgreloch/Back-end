package Flixxer.Flixxer.Backend.repositories;

import Flixxer.Flixxer.Backend.DB.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
