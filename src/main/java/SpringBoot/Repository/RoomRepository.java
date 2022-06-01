package SpringBoot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.Entity.Room;


public interface RoomRepository extends JpaRepository<Room, Long>{



}
