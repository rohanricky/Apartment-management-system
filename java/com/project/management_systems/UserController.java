package com.project.management_systems;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@GetMapping("/signup")
	public ModelAndView signup() {
		ModelAndView mav = new ModelAndView("signup");
		return mav;
	}
	
	@GetMapping("/users")
	public List<User> signups() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/loginuser")
	public String userLogin(@RequestBody Map<String, String> creds) {
		String email = creds.get("email");
		String password = creds.get("password");
		
		System.out.println(email);
		System.out.println(password);
		User user = userService.findByEmail(email);
		
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		if(user.getPassword().equals(password)) {
			System.out.println("User logged in!");
			return "User logged in!";
		}
		return "Email or password incorrect";
	}
	
	@PostMapping("/signup")
	public void signupUser(@RequestBody User user) {
		userService.addUser(user);
	}
}
