package com.edu.SpringBootApplication.Security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import SpringBoot.Entity.User;
import SpringBoot.Repository.HotelReservationRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	
	@Autowired
   
HotelReservationRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Optional<User> user = userRepository.findByEmail(email);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found "+ email));
		
		return user.map(MyUserDetails::new).get();
		//return new MyUserDetails(user);
	}

}
