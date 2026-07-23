package com.Basic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Basic.Entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{

}
