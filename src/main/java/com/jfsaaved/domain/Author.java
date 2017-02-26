package com.jfsaaved.domain;

import java.util.List;

public class Author {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private List<Post> posts;
	
	public Author(String firstname, String lastname) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}
	
	public Author(String firstname, String lastname, String email) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
