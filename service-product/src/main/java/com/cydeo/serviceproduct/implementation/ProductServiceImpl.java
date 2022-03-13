package com.cydeo.serviceproduct.implementation;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.repository.ProductRepository;
import com.cydeo.serviceproduct.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@SuppressWarnings("unchecked")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ProductDto> listOfCompanyProducts(Long companyId) throws Exception {
        List<Product> products = productRepository.findAllByCompanyId(companyId);

        if (!products.isEmpty()) throw new Exception("There is no product listed under this company yet");

         return products.stream().map(e -> modelMapper.map(e, ProductDto.class)).collect(Collectors.toList());

    }

    @Override
    public List<ProductDto> getAllProducts() throws Exception {

        //need pagination
        List<Product> allProducts = productRepository.findAll();

        return allProducts.stream().map(e->modelMapper.map(e,ProductDto.class)).collect(Collectors.toList());

    }

    @Override
    public ProductDto getProductById(Long id) {
        Product byId = productRepository.getById(id);
        return modelMapper.map(byId,ProductDto.class);
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product map = modelMapper.map(productDto, Product.class);
        Product save = productRepository.save(map);
        return modelMapper.map(save,ProductDto.class);
    }

    @Override
    public String delete(Long productId) {
        Product byId = productRepository.getById(productId);
        byId.setDeleted(true);
        productRepository.save(byId);
        return productRepository.getById(byId.getId()).getProductName()+ "Deleted Successfully";
    }

    @Override
    public ProductDto update(ProductDto dto) {

        Product map = modelMapper.map(dto, Product.class);
        Product byId = productRepository.getById(dto.getId());
        byId.setId(map.getId());

        return  modelMapper.map(byId,ProductDto.class);
    }
}
