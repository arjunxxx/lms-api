package com.lms.api.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Users {

	  @Id
	  public ObjectId _id;
	  public String username;
	  public String password;
	  String[] authority;
	
}
