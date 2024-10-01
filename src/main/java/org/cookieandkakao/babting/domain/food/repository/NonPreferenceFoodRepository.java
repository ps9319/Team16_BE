package org.cookieandkakao.babting.domain.food.repository;

import org.cookieandkakao.babting.domain.food.entity.Food;
import org.cookieandkakao.babting.domain.food.entity.NonPreferenceFood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NonPreferenceFoodRepository extends JpaRepository<NonPreferenceFood, Long> {
    boolean existsByFood(Food food);
}