package SpringBoot.Service;

import java.util.List;

import SpringBoot.Entity.Room;


public interface RoomService {



	Room saveRoom(Room reserve);

	Room updateRoom(Long id, Room reserve);

}
