package SpringBoot.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import SpringBoot.Entity.User;

public interface AdminRepository extends JpaRepository<User,Long>{




	List<User> getUserByUsername(String username);

	




	



}
