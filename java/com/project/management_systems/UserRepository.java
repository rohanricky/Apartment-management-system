package com.project.management_systems;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByEmail(String email);
	
	public User findByName(String name);
	
}

//public class UserRepository implements UserRepositoryCustom {
//	
//	public User getUserByEmail(String email) {
//		return null;
//		
//	}
//}
