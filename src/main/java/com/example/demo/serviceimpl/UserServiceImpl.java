package com.example.demo.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.CustomUserDetails;
import com.example.demo.model.User;
@Service
public class UserServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		// Kiểm tra xem user có tồn tại trong database không?
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		return new CustomUserDetails(user);
	}
	
	public UserDetails loadUserById(Long id) {
		User user = userRepository.findOne(id);
		return new CustomUserDetails(user);
	}
}
