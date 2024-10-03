package com.example.finance.repository;

import com.example.finance.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DatabaseSimulator {
  private List<User> users = new ArrayList<>();
  private List<Month> months = new ArrayList<>();
  private List<TransactionType> transactionTypes = new ArrayList<>();
  private List<Transaction> transactions = new ArrayList<>();

  public DatabaseSimulator() {
    initializeData();
  }

  private void initializeData() {
    // Add sample users
    users.add(new User(1L, "john@example.com", "John Doe", "hashedpassword123", false));
    users.add(new User(2L, "admin@example.com", "Admin User", "adminpass456", true));

    // Add transaction types
    transactionTypes.add(new TransactionType(1L, "Salário"));
    transactionTypes.add(new TransactionType(2L, "Compras"));
    transactionTypes.add(new TransactionType(3L, "Aluguel"));

    // Add months
    months.add(new Month(1L, 1L, 2024, 1, 5000.0, 3000.0));
    months.add(new Month(2L, 1L, 2024, 2, 5000.0, 2800.0));

    // Add transactions
    transactions.add(new Transaction(1L, 1L, 1L, 1L, 5000.0, "Salário Janeiro"));
    transactions.add(new Transaction(2L, 1L, 1L, 2L, -2000.0, "Compras Supermercado"));
    transactions.add(new Transaction(3L, 1L, 1L, 3L, -1000.0, "Aluguel Janeiro"));
  }

  // User operations
  public List<User> findAllUsers() {
    return new ArrayList<>(users);
  }

  public Optional<User> findUserById(Long id) {
    return users.stream()
      .filter(user -> user.getId().equals(id))
      .findFirst();
  }

  // Month operations
  public List<Month> findMonthsByUserId(Long userId) {
    return months.stream()
      .filter(month -> month.getUserId().equals(userId))
      .collect(Collectors.toList());
  }

  // Transaction operations
  public List<Transaction> findTransactionsByMonthId(Long monthId) {
    return transactions.stream()
      .filter(transaction -> transaction.getMonthId().equals(monthId))
      .collect(Collectors.toList());
  }

  // TransactionType operations
  public List<TransactionType> findAllTransactionTypes() {
    return new ArrayList<>(transactionTypes);
  }
}
