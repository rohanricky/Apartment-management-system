package com.project.management_systems;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, String> {

	public Iterable<User> findByUserId(String userId);
	
}
