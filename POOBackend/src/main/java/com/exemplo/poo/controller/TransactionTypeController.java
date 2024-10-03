package com.exemplo.poo.controller;

import com.exemplo.poo.model.TransactionType;
import com.exemplo.poo.service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction-types")
public class TransactionTypeController {

    @Autowired
    private TransactionTypeService transactionTypeService;

    @GetMapping
    public List<TransactionType> getAllTransactionTypes() {
        return transactionTypeService.getAllTransactionTypes();
    }
}
