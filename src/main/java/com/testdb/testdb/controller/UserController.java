package com.testdb.testdb.controller;

import com.testdb.testdb.domain.User;
import com.testdb.testdb.service.UserService;
import com.testdb.testdb.service.UserServiceJpa;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
  private final UserServiceJpa userServiceJpa;

  @GetMapping
  public List<User> getAllUsers() {
    return userServiceJpa.getAllUsers();
  }

  @GetMapping("/{username}")
  public User getUserByUsername(@PathVariable("username") String username) {
    return userServiceJpa.getUserByUsername(username).orElseThrow();
  }

}
