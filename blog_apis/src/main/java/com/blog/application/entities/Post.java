package com.blog.application.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer post_id;
	
	@Column(name="post_title",length = 100,nullable = false)
	private String title;
	
	@Column(name="post_content",length = 5000,nullable = false)
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
}
