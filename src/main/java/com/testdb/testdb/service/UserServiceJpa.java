package com.testdb.testdb.service;

import com.testdb.testdb.domain.User;
import com.testdb.testdb.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceJpa {
  private final UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(Long id) {
    return userRepository.findById(id).orElseThrow();
  }

  public Optional<User> getUserByUsername(String username) {
    return userRepository.findByUsername(username);
  }

}
