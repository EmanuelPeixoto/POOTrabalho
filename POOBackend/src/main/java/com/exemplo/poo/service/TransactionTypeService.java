package com.exemplo.poo.service;

import com.exemplo.poo.model.TransactionType;
import com.exemplo.poo.repository.TransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionTypeService {

  @Autowired
  private TransactionTypeRepository transactionTypeRepository;

  // Retorna todos os tipos de transação
  public List<TransactionType> getAllTransactionTypes() {
    return transactionTypeRepository.findAllTransactionTypes();
  }

  // Retorna um tipo de transação específico pelo ID
  public Optional<TransactionType> getTransactionTypeById(Long id) {
    return transactionTypeRepository.findTransactionTypeById(id);
  }

  // Adiciona um novo tipo de transação
  public void addTransactionType(TransactionType transactionType) {
    transactionTypeRepository.saveTransactionType(transactionType);
  }

  // Atualiza um tipo de transação existente
  public void updateTransactionType(Long id, TransactionType updatedTransactionType) {
    transactionTypeRepository.updateTransactionType(id, updatedTransactionType);
  }

  // Remove um tipo de transação
  public void deleteTransactionType(Long id) {
    transactionTypeRepository.deleteTransactionType(id);
  }
}

