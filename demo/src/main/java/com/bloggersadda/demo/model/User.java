package com.bloggersadda.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
	public String getUsername() {
	
		throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
	}
    public Object getPassword() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

    // Getters and Setters
}
