package com.example.springboot3featureflagdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot3featureflagdemo.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
  
}
