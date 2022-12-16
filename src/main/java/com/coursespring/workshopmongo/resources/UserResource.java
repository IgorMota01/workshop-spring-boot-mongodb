package com.coursespring.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursespring.workshopmongo.domain.User;
import com.coursespring.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping //Ou usa o GetMapping (Mais fácil)
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = userService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
