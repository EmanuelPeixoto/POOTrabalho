package com.example.finance.model;

public class TransactionType {
  private Long id;
  private String typeName;

  // Constructor
  public TransactionType(Long id, String typeName) {
    this.id = id;
    this.typeName = typeName;
  }

  // Getters and Setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getTypeName() { return typeName; }
  public void setTypeName(String typeName) { this.typeName = typeName; }
}
