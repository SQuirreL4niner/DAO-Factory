package com.example.j2eeapp.services;

import com.example.j2eeapp.domain.UserEntity;

/*
 * Service providing service methods to work with user data and entity
 * 
 * 
 * */
public interface UserService {

	/*
	 * Create user by persisting to database
	 * 
	 * @param userEntity
	 * @return true if success
	 * */
	
	boolean createUser(UserEntity userEntity);
}
