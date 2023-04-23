package com.codingz2m.bloggingplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingz2m.bloggingplatform.model.BlogUser;
import com.codingz2m.bloggingplatform.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // Setter Injection
  //  @Autowired
	//public void setUserRepository(UserRepository userRepository) {
	//	this.userRepository = userRepository;
	//}

	@Override
    public BlogUser createUser(BlogUser blogUser) {
        return userRepository.save(blogUser);
    }

    @Override
    public BlogUser findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
}

