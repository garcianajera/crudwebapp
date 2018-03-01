package net.app.service;

import net.app.entity.User;

public interface UserService {

	User addNewUser(User user);

	User getUserById(Long id);

}