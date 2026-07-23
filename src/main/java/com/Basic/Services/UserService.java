package com.Basic.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Basic.Entities.User;
import com.Basic.Repositories.UserRepository;
import com.Basic.dto.CreateUserRequest;
import com.Basic.dto.UserResponse;

@Service
public class UserService {
	private final UserRepository userRepo;

	public UserService(UserRepository userRepo) {

		this.userRepo = userRepo;
	}

	public String addUser(CreateUserRequest request) {
		User user = new User();
		user.setUserName(request.getUserName());
		user.setAge(request.getAge());
		userRepo.save(user);
		return "User added successfully";
	}

	public List<UserResponse> viewUsers() {
		List<User> users = userRepo.findAll();
		List<UserResponse> responseList = new ArrayList<>();
		
		for (User user : users) {
			UserResponse response = new UserResponse();
			response.setUserId(user.getUserId());
			response.setUserName(user.getUserName());
			response.setAge(user.getAge());
			
			responseList.add(response);
		}
		
		return responseList;
	}


}
