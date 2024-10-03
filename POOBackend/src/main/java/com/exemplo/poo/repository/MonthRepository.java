package com.exemplo.poo.repository;

import com.exemplo.poo.model.Month;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MonthRepository {
  private List<Month> months = new ArrayList<>();

  public MonthRepository() {
    initializeData();
  }

  private void initializeData() {
    months.add(new Month(1L, 1L, 2024, 1, 1000.0, 500.0)); // Exemplo de dados
    months.add(new Month(2L, 1L, 2024, 2, 1200.0, 600.0)); // Exemplo de dados
  }

  public List<Month> findAllMonths() {
    return new ArrayList<>(months);
  }

  public Optional<Month> findMonthById(Long id) {
    return months.stream()
      .filter(month -> month.getId().equals(id))
      .findFirst();
  }

  public void saveMonth(Month month) {
    months.add(month);
  }

  public void deleteMonth(Long id) {
    months.removeIf(month -> month.getId().equals(id));
  }

  public void updateMonth(Long id, Month updatedMonth) {
    months.stream()
      .filter(month -> month.getId().equals(id))
      .findFirst()
      .ifPresent(month -> {
        month.setYear(updatedMonth.getYear());
        month.setMonth(updatedMonth.getMonth());
        month.setTotalIncome(updatedMonth.getTotalIncome());
        month.setTotalExpense(updatedMonth.getTotalExpense());
      });
  }

  public Month save(Month month) {
    // Aqui, você deve decidir como definir o ID.
    // Para fins de exemplo, vamos apenas usar o tamanho da lista como um ID (não é a melhor prática em produção).
    month.setId((long) (months.size() + 1)); // Define um ID simples
    months.add(month); // Adiciona o mês à lista
    return month; // Retorna o mês adicionado
  }
}

