package com.exemplo.poo.service;

import com.exemplo.poo.model.Transaction;
import com.exemplo.poo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionService {

  @Autowired
  private TransactionRepository transactionRepository;

  public List<Transaction> getAllTransactions() {
    return transactionRepository.findAllTransactions();
  }

  public Optional<Transaction> getTransactionById(Long id) {
    return transactionRepository.findTransactionById(id);
  }

  public List<Transaction> getTransactionsByMonth(Long monthId) {
    // Filtrar transações por monthId
    return transactionRepository.findAllTransactions().stream()
      .filter(transaction -> transaction.getMonthId().equals(monthId))
      .collect(Collectors.toList());
  }

  public void saveTransaction(Transaction transaction) {
    transactionRepository.saveTransaction(transaction);
  }

  public void deleteTransaction(Long id) {
    transactionRepository.deleteTransaction(id);
  }

  public void updateTransaction(Long id, Transaction updatedTransaction) {
    transactionRepository.updateTransaction(id, updatedTransaction);
  }
}

