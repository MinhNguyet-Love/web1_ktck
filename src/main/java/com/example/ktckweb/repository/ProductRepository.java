package com.example.ktckweb.repository;

import com.example.ktckweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Rename to ProductRepository
public interface ProductRepository extends JpaRepository<Product, Long> {
}