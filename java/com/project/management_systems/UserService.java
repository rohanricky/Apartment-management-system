package com.project.management_systems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void removeUser(long id) {
		userRepository.deleteById(id);
	}
	
	public User findByEmail(String email) {
		System.out.println("services " + email);
		User user = userRepository.findByEmail(email);
		return user;
	}
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll()
			.forEach(users::add);
		return users;
	}
	
}
