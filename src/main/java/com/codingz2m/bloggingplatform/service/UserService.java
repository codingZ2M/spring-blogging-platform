package com.codingz2m.bloggingplatform.service;

import com.codingz2m.bloggingplatform.model.BlogUser;

public interface UserService {
    
    BlogUser createUser(BlogUser user);
    
    BlogUser findUserByUsername(String username);
    
}

