package com.alkemy.java2.clase10.service.impl;

import com.alkemy.java2.clase10.dto.UserDTO;
import com.alkemy.java2.clase10.mapper.UserMapper;
import com.alkemy.java2.clase10.repository.UserRepository;
import com.alkemy.java2.clase10.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  @Override
  public UserDTO createUser(UserDTO user) {
    return null;
  }

  @Override
  public List<UserDTO> getAllUsers() {
    return  userRepository.findAll().stream()
        .map(userMapper::toDTO)
        .collect(Collectors.toList());
  }

  @Override
  public UserDTO updateUser(String id, UserDTO user) {
    return null;
  }

  @Override
  public void deleteUser(String id) {

  }
}
