package com.bloggersadda.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private String title;
    private String body;
    private String authorId;
	public void setId(String id2) {
	
		throw new UnsupportedOperationException("Unimplemented method 'setId'");
	}

    // Getters and Setters
}
