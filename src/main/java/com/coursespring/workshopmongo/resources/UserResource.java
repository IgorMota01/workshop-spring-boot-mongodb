package com.coursespring.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coursespring.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET) //Ou usa o GetMapping (Mais fácil)
	public ResponseEntity<List<User>> findAll() {
		User user = new User(1L, "Maria", "maria@gmail.com");
		User user2 = new User(2L, "Alex", "alex@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user, user2));
		return ResponseEntity.ok().body(list);
	}
}
