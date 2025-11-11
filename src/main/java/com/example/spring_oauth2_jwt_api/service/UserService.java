package com.example.spring_oauth2_jwt_api.service;


import com.example.spring_oauth2_jwt_api.model.User;
import com.example.spring_oauth2_jwt_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }
}