package SpringBoot.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.Entity.User;


//import com.edu.SpringBootApplication.entity.Employee;

public interface HotelReservationRepository extends  JpaRepository<User,Long> {

	List<User> getUserByUsername(String username);

	Optional<User> findByEmail(String email);






	

}
