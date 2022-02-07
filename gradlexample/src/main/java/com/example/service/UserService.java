
package com.example.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Users;

public interface UserService {

	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	public Users addOrUpdateUser(Users user);
	public Users deleteUser(int userId) throws Exception;
	
}
