package com.project.management_systems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepo;
	
	public void addPost(Post post) {
		postRepo.save(post);
	}
	
	public List<Post> getAllPosts() {
		List<Post> posts = new ArrayList<>();
		postRepo.findAll()
			.forEach(posts::add);
		return posts;
	}
	
//	public List<Post> getAllPostsByUser(String userId) {
//		List<Post> posts = new ArrayList<>();
//		postRepo.findByUserId(userId)
//			.forEach(posts::add);
//		
//		return posts;
//	}

	public void addPostByUser(Post post) {
		// TODO Auto-generated method stub
		postRepo.save(post);
	}
}
