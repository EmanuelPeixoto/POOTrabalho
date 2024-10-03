package com.exemplo.poo.service;

import com.exemplo.poo.model.Month;
import com.exemplo.poo.repository.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MonthService {

  @Autowired
  private MonthRepository monthRepository;

  public List<Month> getAllMonths() {
    return monthRepository.findAllMonths();
  }

  public Optional<Month> getMonthById(Long id) {
    return monthRepository.findMonthById(id);
  }

  public List<Month> getMonthsByUser(Long userId) {
    // Filtrar meses por userId
    return monthRepository.findAllMonths().stream()
      .filter(month -> month.getUserId().equals(userId))
      .collect(Collectors.toList());
  }

  public void saveMonth(Month month) {
    monthRepository.saveMonth(month);
  }

  public void deleteMonth(Long id) {
    monthRepository.deleteMonth(id);
  }

  public void updateMonth(Long id, Month updatedMonth) {
    monthRepository.updateMonth(id, updatedMonth);
  }

  public Month addMonth(Month month) {
    return monthRepository.save(month); // Supondo que o repositório tenha um método save
  }
}

