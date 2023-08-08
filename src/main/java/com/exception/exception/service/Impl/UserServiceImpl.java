package com.exception.exception.service.Impl;

import com.exception.exception.entity.UserEntity;
import com.exception.exception.model.User;
import com.exception.exception.repository.UserRepository;
import com.exception.exception.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        user.toString();
        UserEntity userEntity = UserEntity.builder()
                .emailId(user.getEmailId())
                .first_name(user.getFirst_name())
                .last_name(user.getLast_name())
                .phoneNo(user.getPhoneNo())
                .build();
        userEntity=userRepository.save(userEntity);
        user.setId(userEntity.getId());
        return user;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public String deleteUserById(Long id) {
        return null;
    }
}
