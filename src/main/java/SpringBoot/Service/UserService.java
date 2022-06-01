package SpringBoot.Service;

import java.util.List;


import SpringBoot.Entity.User;

public interface UserService {

	List<User> listAllUser();

	User saveUser(User user);
User updateUser(Long id, User user);



	void deleteUser(long id);

	List<User> getUserByUsername(String username);

	


}
