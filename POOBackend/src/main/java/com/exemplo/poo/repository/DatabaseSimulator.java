package com.exemplo.poo.repository;

import com.exemplo.poo.model.Month;
import com.exemplo.poo.model.Transaction;
import com.exemplo.poo.model.TransactionType;
import com.exemplo.poo.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DatabaseSimulator {
    private List<User> users = new ArrayList<>();
    private List<Month> months = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<TransactionType> transactionTypes = new ArrayList<>();

    public DatabaseSimulator() {
        initializeData();
    }

    private void initializeData() {
        // Inicializando dados de usuários
        users.add(new User(1L, "john@example.com", "John Doe", "hashedpassword123", false));
        users.add(new User(2L, "admin@example.com", "Admin User", "adminpass456", true));

        // Inicializando dados de meses
        months.add(new Month(1L, 1L, 2024, 1, 5000.0, 2000.0));
        months.add(new Month(2L, 1L, 2024, 2, 6000.0, 1500.0));

        // Inicializando dados de transações
        transactions.add(new Transaction(1L, 1L, 1L, 1L, 200.0, "Compra de material"));
        transactions.add(new Transaction(2L, 1L, 1L, 2L, 300.0, "Venda de produto"));

        // Inicializando dados de tipos de transações
        transactionTypes.add(new TransactionType(1L, "Entrada"));
        transactionTypes.add(new TransactionType(2L, "Saída"));
    }

    // Métodos de Usuário
    public List<User> findAllUsers() {
        return new ArrayList<>(users);
    }

    public Optional<User> findUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    // Métodos de Mês
    public List<Month> findAllMonths() {
        return new ArrayList<>(months);
    }

    public Optional<Month> findMonthById(Long id) {
        return months.stream().filter(month -> month.getId().equals(id)).findFirst();
    }

    // Métodos de Transação
    public List<Transaction> findAllTransactions() {
        return new ArrayList<>(transactions);
    }

    public Optional<Transaction> findTransactionById(Long id) {
        return transactions.stream().filter(transaction -> transaction.getId().equals(id)).findFirst();
    }

    // Métodos de Tipo de Transação
    public List<TransactionType> findAllTransactionTypes() {
        return new ArrayList<>(transactionTypes);
    }

    public Optional<TransactionType> findTransactionTypeById(Long id) {
        return transactionTypes.stream().filter(transactionType -> transactionType.getId().equals(id)).findFirst();
    }

    // Métodos para salvar novos registros (Exemplo simples)
    public void saveUser(User user) {
        users.add(user);
    }

    public void saveMonth(Month month) {
        months.add(month);
    }

    public void saveTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void saveTransactionType(TransactionType transactionType) {
        transactionTypes.add(transactionType);
    }

    // Métodos para atualizar e remover registros podem ser implementados conforme necessário
}

