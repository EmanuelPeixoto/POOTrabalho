package com.example.finance.model;

public class Month {
  private Long id;
  private Long userId;
  private int year;
  private int month;
  private double totalIncome;
  private double totalExpense;

  // Constructor
  public Month(Long id, Long userId, int year, int month, double totalIncome, double totalExpense) {
    this.id = id;
    this.userId = userId;
    this.year = year;
    this.month = month;
    this.totalIncome = totalIncome;
    this.totalExpense = totalExpense;
  }

  // Getters and Setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Long getUserId() { return userId; }
  public void setUserId(Long userId) { this.userId = userId; }
  public int getYear() { return year; }
  public void setYear(int year) { this.year = year; }
  public int getMonth() { return month; }
  public void setMonth(int month) { this.month = month; }
  public double getTotalIncome() { return totalIncome; }
  public void setTotalIncome(double totalIncome) { this.totalIncome = totalIncome; }
  public double getTotalExpense() { return totalExpense; }
  public void setTotalExpense(double totalExpense) { this.totalExpense = totalExpense; }
}
