package com.ecommerce.productservice.service.daoservice;

import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDaoService {

    private ProductRepository productRepository;

    public ProductDaoService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
