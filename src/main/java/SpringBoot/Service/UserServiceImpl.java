package SpringBoot.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.SpringBootApplication.exception.ResourceNotFoundException;

import SpringBoot.Entity.User;
import SpringBoot.Repository.HotelReservationRepository;

@Service
public class UserServiceImpl implements UserService{
	HotelReservationRepository hotelreservationrepository;

	public UserServiceImpl(HotelReservationRepository hotelreservationrepository) {
		super();
		this.hotelreservationrepository = hotelreservationrepository;
	}

	@Override
	public List<User> listAllUser() {
		// TODO Auto-generated method stub
		return hotelreservationrepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return hotelreservationrepository.save(user);
	}

	@Override
	public User updateUser(Long id, User user) {
		User use = new User();
		 try {
			 //orElseThrow();
			  use = hotelreservationrepository.findById(id).orElseThrow(
					 ()-> 		 new SpringBoot.exception.ResourceNotFoundException("User","Id",id));
			  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		  String fname =user.getUsername();
use.setUsername(fname);
//		 use.setLastName(employee.getLastName());
		 use.setPhoneno(user.getPhoneno());
		 use.setEmail(user.getEmail());
		 use.setLocation(user.getLocation());
		 
	
		 hotelreservationrepository.save(use);
		
		return use;
		}



	@Override
	public void deleteUser(long id) {
		hotelreservationrepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("User","Id",id));
		
		hotelreservationrepository.deleteById(id);//13
		
	}

	@Override
	public List<User> getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return hotelreservationrepository.getUserByUsername(username);
	}

	



	}



	




