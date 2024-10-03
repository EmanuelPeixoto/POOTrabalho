package com.exemplo.poo.model;

import java.time.LocalDateTime;

public class Transaction {
  private Long id;
  private Long userId;
  private Long monthId;
  private Long transactionTypeId;
  private double amount;
  private String description;
  private LocalDateTime transactionDate;

  // Constructor
  public Transaction(Long id, Long userId, Long monthId, Long transactionTypeId,
      double amount, String description) {
    this.id = id;
    this.userId = userId;
    this.monthId = monthId;
    this.transactionTypeId = transactionTypeId;
    this.amount = amount;
    this.description = description;
    this.transactionDate = LocalDateTime.now();
  }

  // Getters and Setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Long getUserId() { return userId; }
  public void setUserId(Long userId) { this.userId = userId; }
  public Long getMonthId() { return monthId; }
  public void setMonthId(Long monthId) { this.monthId = monthId; }
  public Long getTransactionTypeId() { return transactionTypeId; }
  public void setTransactionTypeId(Long transactionTypeId) { this.transactionTypeId = transactionTypeId; }
  public double getAmount() { return amount; }
  public void setAmount(double amount) { this.amount = amount; }
  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; }
  public LocalDateTime getTransactionDate() { return transactionDate; }
  public void setTransactionDate(LocalDateTime transactionDate) { this.transactionDate = transactionDate; }
}
