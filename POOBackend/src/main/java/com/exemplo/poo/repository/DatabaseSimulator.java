package com.exemplo.poo.repository;

import com.exemplo.poo.model.User;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DatabaseSimulator {
  private List<User> users = new ArrayList<>();

  public DatabaseSimulator() {
    initializeData();
  }

  private void initializeData() {
    users.add(new User(1L, "john@example.com", "John Doe", "hashedpassword123", false));
    users.add(new User(2L, "admin@example.com", "Admin User", "adminpass456", true));
  }

  public List<User> findAllUsers() {
    return new ArrayList<>(users);
  }

  public Optional<User> findUserById(Long id) {
    return users.stream()
      .filter(user -> user.getId().equals(id))
      .findFirst();
  }
}
