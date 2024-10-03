package com.example.finance.service;

import com.example.finance.model.User;
import com.example.finance.repository.DatabaseSimulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  private DatabaseSimulator databaseSimulator;

  public List<User> getAllUsers() {
    return databaseSimulator.findAllUsers();
  }

  public Optional<User> getUserById(Long id) {
    return databaseSimulator.findUserById(id);
  }
}
