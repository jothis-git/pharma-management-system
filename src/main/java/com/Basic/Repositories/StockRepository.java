package com.Basic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Basic.Entities.Stock;

import java.util.Optional;

public interface StockRepository extends JpaRepository<Stock, Integer>{

    Optional<Stock> findByName(String name);

}
