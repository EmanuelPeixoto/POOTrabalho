package com.example.finance.model;

import java.time.LocalDateTime;

public class User {
  private Long id;
  private String email;
  private String name;
  private String passwordHash;
  private boolean isAdmin;
  private LocalDateTime createdAt;

  // Constructor
  public User(Long id, String email, String name, String passwordHash, boolean isAdmin) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.passwordHash = passwordHash;
    this.isAdmin = isAdmin;
    this.createdAt = LocalDateTime.now();
  }

  // Getters and Setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getPasswordHash() { return passwordHash; }
  public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
  public boolean isAdmin() { return isAdmin; }
  public void setAdmin(boolean admin) { isAdmin = admin; }
  public LocalDateTime getCreatedAt() { return createdAt; }
  public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
