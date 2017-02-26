package com.jfsaaved.domain;

import java.util.Date;

public class Post {

	private long id;
	private String title;
	private String body;
	private String teaser;
	private String slug;
	private Date postedOn;
	private Author author;
	
	public Post() {
		
	}
	
	public Post(long id, String title, String body, String teaser, String slug, Date postedOn, Author author) {
		this.id = id;
		this.setTitle(title);
		this.setBody(body);
		this.setTeaser(teaser);
		this.setSlug(slug);
		this.setPostedOn(postedOn);
		this.setAuthor(author);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTeaser() {
		return teaser;
	}

	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void setAuthor(int id){
		this.author = new Author("Dan", "Vega","danvega@gmail.com");
	}
	
	@Override
	public String toString() {
		return "Post [title=" + title + "]";
	}
	
	
}
