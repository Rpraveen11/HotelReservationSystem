package SpringBoot.Service;


import org.springframework.stereotype.Service;

import SpringBoot.Entity.Room;
import SpringBoot.Repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {

	RoomRepository reservRep;

	public RoomServiceImpl(RoomRepository reservRep) {
		super();
		this.reservRep = reservRep;
	}
	

	@Override
	public Room saveRoom(Room reserve) {
		return reservRep.save(reserve);
	}



	@Override
	public Room updateRoom(Long id, Room reserve) {
Room res=new Room();
		 try {
			res = reservRep.findById(id).orElseThrow(
					 ()-> 		 new SpringBoot.exception.ResourceNotFoundException("Room","Id",id));
			  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	//  String fname =reserve.getRoom_type();
   res.setHotelno(reserve.getHotelno());
   res.setRoomId(reserve.getRoomId());
   res.setDays(reserve.getDays());
	res.setRoom_type(reserve.getRoom_type());
	res.setPrice(reserve.getPrice());
	res.setCheckinDate(reserve.getCheckinDate());
	res.setCheckOutDate( reserve.getCheckOutDate());
	reservRep.save(res);
		
		return res;
		
	}
	}


