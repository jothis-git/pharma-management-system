package com.Basic.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Basic.Entities.User;
import com.Basic.Services.UserService;
import com.Basic.dto.CreateUserRequest;
import com.Basic.dto.UserResponse;

@RestController
@RequestMapping("/User")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	@PostMapping()
	public String addUser(@RequestBody CreateUserRequest request) {
		return userService.addUser(request);
	}
	@GetMapping()
	public ResponseEntity<List<UserResponse>> getAllUsers(){
		List<UserResponse> users = userService.viewUsers();
		return ResponseEntity.ok(users);
	}
	

}
