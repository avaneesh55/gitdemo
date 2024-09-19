package com.example.demo.authcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.authenticate.User;
import com.example.demo.authenticate.UserRepository;
import com.example.demo.payload.LogIn;
import com.example.demo.payload.SignUp;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	// http://localhost:9196/api/auth/signin

	@PostMapping("/signin")
	public ResponseEntity<String> authenticateUser(@RequestBody LogIn login) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(login.getUsernameOrEmail(), login.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
	}

	// http://localhost:9196/api/auth/signup

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody SignUp signUp) {

		// add check for username exists in a DB
		if (userRepository.existsByUsername(signUp.getUsername())) {
			return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
		}

		// add check for email exists in DB
		if (userRepository.existsByEmail(signUp.getEmail())) {
			return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
		}

		// create user object
		User user = new User();
		user.setName(signUp.getName());
		user.setUsername(signUp.getUsername());
		user.setEmail(signUp.getEmail());
		user.setPassword(passwordEncoder.encode(signUp.getPassword()));
		System.out.println("User"+ user);
		userRepository.save(user);

		return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

	}
}
