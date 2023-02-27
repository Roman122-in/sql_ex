package com.space.SPACEAPPLICATION;

import java.nio.file.attribute.UserPrincipalLookupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	
	@Autowired
	
	private UserRepository userRepository;
	
	
	@Override
	@Bean//здесь добавил
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("not found");
		}
		return new UserPrincipal(user);
	}
	
	

}
