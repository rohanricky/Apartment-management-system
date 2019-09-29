package com.project.management_systems;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {

	@Id
	@GeneratedValue
	private long id;
	private String header;
	private String body;
	
	@ManyToOne
	private User user;
	
	public Post () {
		
	}
	
	public Post (long id, String header, String body) {
		super();
		this.id = id;
		this.header = header;
		this.body = body;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
