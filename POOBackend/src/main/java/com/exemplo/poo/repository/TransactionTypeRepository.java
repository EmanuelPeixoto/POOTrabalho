package com.exemplo.poo.repository;

import com.exemplo.poo.model.TransactionType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TransactionTypeRepository {
  private List<TransactionType> transactionTypes = new ArrayList<>();

  public TransactionTypeRepository() {
    initializeData();
  }

  private void initializeData() {
    transactionTypes.add(new TransactionType(1L, "Income"));
    transactionTypes.add(new TransactionType(2L, "Expense"));
  }

  public List<TransactionType> findAllTransactionTypes() {
    return new ArrayList<>(transactionTypes);
  }

  public Optional<TransactionType> findTransactionTypeById(Long id) {
    return transactionTypes.stream()
      .filter(transactionType -> transactionType.getId().equals(id))
      .findFirst();
  }

  public void saveTransactionType(TransactionType transactionType) {
    transactionTypes.add(transactionType);
  }

  public void deleteTransactionType(Long id) {
    transactionTypes.removeIf(transactionType -> transactionType.getId().equals(id));
  }

  public void updateTransactionType(Long id, TransactionType updatedTransactionType) {
    transactionTypes.stream()
      .filter(transactionType -> transactionType.getId().equals(id))
      .findFirst()
      .ifPresent(transactionType -> {
        transactionType.setTypeName(updatedTransactionType.getTypeName());
      });
  }
}

