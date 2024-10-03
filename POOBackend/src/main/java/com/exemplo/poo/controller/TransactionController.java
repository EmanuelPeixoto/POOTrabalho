package com.exemplo.poo.controller;

import com.exemplo.poo.model.Transaction;
import com.exemplo.poo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

  @Autowired
  private TransactionService transactionService;

  @GetMapping("/month/{monthId}")
  public List<Transaction> getTransactionsByMonth(@PathVariable Long monthId) {
    return transactionService.getTransactionsByMonth(monthId);
  }
}
