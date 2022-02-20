package com.cydeo.serviceproduct.implementation;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.repository.ProductRepository;
import com.cydeo.serviceproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@SuppressWarnings("unchecked")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> listOfCompanyProducts(Long companyId) throws Exception {
        List<Product> products = productRepository.findAllByCompanyId(companyId);
        if(!products.isEmpty()) throw new Exception("There is no product listed");

            return products;

   }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        return null;
    }

    @Override
    public String delete(Long productId) {
        return null;
    }

    @Override
    public ProductDto update(ProductDto dto) {
        return null;
    }
}
