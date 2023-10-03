package com.testdb.testdb.controller;

import com.testdb.testdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
public class BatchController {

  private final UserService userService;

  @Autowired
  public BatchController(UserService userService) {
    this.userService = userService;
  }

//  @GetMapping("/batch")
//  public String batch() {
//    userService.batchUpdate();
//    return "batch";
//  }



}
