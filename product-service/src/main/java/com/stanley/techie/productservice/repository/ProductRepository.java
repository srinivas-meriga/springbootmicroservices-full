package com.stanley.techie.productservice.repository;

import com.stanley.techie.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
