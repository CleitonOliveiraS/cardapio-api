package br.com.cleiton.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository  extends JpaRepository<Food, Long> {
}
