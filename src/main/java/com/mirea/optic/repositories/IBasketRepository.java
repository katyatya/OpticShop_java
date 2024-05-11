package com.mirea.optic.repositories;

import com.mirea.optic.models.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface IBasketRepository extends JpaRepository<Basket, Integer> {
    List<Basket> findAllByUserId(int userId);
    Basket findById(int id);
    Basket findByUserIdAndProductId(int userId, int productId);
    Long deleteById(int id);
    @Transactional
    Long deleteAllByUserId(int userId);

}
