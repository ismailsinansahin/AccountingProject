package com.cydeo.serviceproduct.implementation;

import com.cydeo.servicecommon.contract.ProductDto;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.mapper.MapperUtil;
import com.cydeo.serviceproduct.repository.ProductRepository;
import com.cydeo.serviceproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@SuppressWarnings("unchecked")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    MapperUtil mapperUtil;

    @Override
    public List<ProductDto> listOfCompanyProducts(Long companyId) throws Exception {
        List<Product> products = productRepository.findAllByCompanyId(companyId);

        if (!products.isEmpty()) throw new Exception("There is no product listed under this company yet");

         return products.stream().map(e -> mapperUtil.convert(e,new ProductDto())).collect(Collectors.toList());

    }

    @Override
    public List<ProductDto> getAllProducts() throws Exception {

        //todo need pagination
        List<Product> allProducts = productRepository.findAll();

        return allProducts.stream().map(e->mapperUtil.convert(e,new ProductDto())).collect(Collectors.toList());

    }

    @Override
    public ProductDto getProductById(Long id) {
        Product byId = productRepository.findById(id).get();
        ProductDto mapped = mapperUtil.convert(byId, new ProductDto());
        return mapped;
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product map = mapperUtil.convert(productDto, new Product());
        Product save = productRepository.save(map);
        return mapperUtil.convert(save,new ProductDto());
    }

    @Override
    public String delete(Long productId) {
        Product byId = productRepository.getById(productId);
        byId.setIsDeleted(true);
        productRepository.save(byId);
        return productRepository.getById(byId.getId()).getProductName()+ "Deleted Successfully";
    }

    @Override
    public ProductDto update(ProductDto dto) {

        Product map = mapperUtil.convert(dto, new Product());
        Product byId = productRepository.getById(dto.getId());
        byId.setId(map.getId());

        return  mapperUtil.convert(byId,new ProductDto());
    }
}
