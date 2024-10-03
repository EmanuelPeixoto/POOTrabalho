package com.exemplo.poo.repository;

import com.exemplo.poo.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TransactionRepository {
  private List<Transaction> transactions = new ArrayList<>();

  public TransactionRepository() {
    initializeData();
  }

  private void initializeData() {
    transactions.add(new Transaction(1L, 1L, 1L, 1L, 100.0, "Ganho")); // Exemplo de dados
    transactions.add(new Transaction(2L, 1L, 1L, 2L, 50.0, "Despesa")); // Exemplo de dados
  }

  public List<Transaction> findAllTransactions() {
    return new ArrayList<>(transactions);
  }

  public Optional<Transaction> findTransactionById(Long id) {
    return transactions.stream()
      .filter(transaction -> transaction.getId().equals(id))
      .findFirst();
  }

  public void saveTransaction(Transaction transaction) {
    transactions.add(transaction);
  }

  public void deleteTransaction(Long id) {
    transactions.removeIf(transaction -> transaction.getId().equals(id));
  }

  public void updateTransaction(Long id, Transaction updatedTransaction) {
    transactions.stream()
      .filter(transaction -> transaction.getId().equals(id))
      .findFirst()
      .ifPresent(transaction -> {
        transaction.setUserId(updatedTransaction.getUserId());
        transaction.setMonthId(updatedTransaction.getMonthId());
        transaction.setTransactionTypeId(updatedTransaction.getTransactionTypeId());
        transaction.setAmount(updatedTransaction.getAmount());
        transaction.setDescription(updatedTransaction.getDescription());
        transaction.setTransactionDate(updatedTransaction.getTransactionDate());
      });
  }
}

