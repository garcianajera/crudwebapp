package net.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.app.entity.User;
import net.app.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable Long userId) {
		return userService.getUserById(userId);
	}
	
	@PostMapping("/addUser")
	public User addNewUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}
}
