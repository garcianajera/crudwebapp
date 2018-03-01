package net.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.app.entity.User;
import net.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository  userRepository;
	
	
	public User addNewUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	public User getUserById(Long id) {
		return userRepository.findOne(id);
	}
}
