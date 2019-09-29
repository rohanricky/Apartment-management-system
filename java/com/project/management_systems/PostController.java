package com.project.management_systems;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.project.management_systems.*;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/posts")
	public List<Post> posts() {
		return postService.getAllPosts();
	}
	
	@PostMapping("/posts")
	public void sendPost(@RequestBody Post post) {
		postService.addPost(post);
	}
	
	@PostMapping("/users/{user}/posts")
	public void addPostByUser(@RequestBody Post post) {
		postService.addPostByUser(post);
	}
	
}
