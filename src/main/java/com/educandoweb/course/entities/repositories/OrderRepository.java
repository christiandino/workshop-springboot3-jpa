package com.educandoweb.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
