package com.Basic.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Basic.Entities.order;

public interface OrderRepository extends JpaRepository<order, Integer>{

	List<order> findByUser_userId(Integer userId);
	

}
