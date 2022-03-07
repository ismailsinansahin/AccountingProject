package com.cydeo.serviceproduct.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;
import com.cydeo.serviceproduct.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ProductServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ProductServiceImplTest {
    @MockBean
    private ModelMapper modelMapper;

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Test
    void testListOfCompanyProducts() throws Exception {
        when(this.productRepository.findAllByCompanyId((Long) any())).thenReturn(new ArrayList<>());
        List<ProductDto> actualListOfCompanyProductsResult = this.productServiceImpl.listOfCompanyProducts(123L);
        assertTrue(actualListOfCompanyProductsResult.isEmpty());
        verify(this.productRepository).findAllByCompanyId((Long) any());
        assertEquals(actualListOfCompanyProductsResult, this.productServiceImpl.getAllProducts());
    }

    @Test
    void testListOfCompanyProducts2() throws Exception {
        Product product = new Product();
        product.setLowLimitAlert(0);
        product.setTax(0);
        product.setDeleted(true);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setCategoryId(123L);
        product.setDescription("The characteristics of someone or something");
        product.setEnabled((byte) 'A');
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(0);
        product.setPrice(0);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product);
        when(this.productRepository.findAllByCompanyId((Long) any())).thenReturn(productList);
        assertThrows(Exception.class, () -> this.productServiceImpl.listOfCompanyProducts(123L));
        verify(this.productRepository).findAllByCompanyId((Long) any());
    }

    @Test
    void testGetAllProducts() throws Exception {
        when(this.productRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(this.productServiceImpl.getAllProducts().isEmpty());
        verify(this.productRepository).findAll();
    }

    @Test
    void testGetAllProducts2() throws Exception {
        Product product = new Product();
        product.setLowLimitAlert(0);
        product.setTax(0);
        product.setDeleted(true);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setCategoryId(123L);
        product.setDescription("The characteristics of someone or something");
        product.setEnabled((byte) 'A');
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(0);
        product.setPrice(0);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product);
        when(this.productRepository.findAll()).thenReturn(productList);
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(new ProductDto());
        assertEquals(1, this.productServiceImpl.getAllProducts().size());
        verify(this.productRepository).findAll();
        verify(this.modelMapper).map((Object) any(), (Class<Object>) any());
    }

    @Test
    void testGetAllProducts3() throws Exception {
        Product product = new Product();
        product.setLowLimitAlert(0);
        product.setTax(0);
        product.setDeleted(true);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setCategoryId(123L);
        product.setDescription("The characteristics of someone or something");
        product.setEnabled((byte) 'A');
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(0);
        product.setPrice(0);

        Product product1 = new Product();
        product1.setLowLimitAlert(0);
        product1.setTax(0);
        product1.setDeleted(true);
        product1.setProductStatus(ProductStatus.ACTIVE);
        product1.setCategoryId(123L);
        product1.setDescription("The characteristics of someone or something");
        product1.setEnabled((byte) 'A');
        product1.setCompanyId(123L);
        product1.setUnit(Unit.LIBRE);
        product1.setId(123L);
        product1.setProductName("Product Name");
        product1.setQty(0);
        product1.setPrice(0);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product);
        when(this.productRepository.findAll()).thenReturn(productList);
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(new ProductDto());
        assertEquals(2, this.productServiceImpl.getAllProducts().size());
        verify(this.productRepository).findAll();
        verify(this.modelMapper, atLeast(1)).map((Object) any(), (Class<Object>) any());
    }

    @Test
    void testGetProductById() throws Exception {
        Product product = new Product();
        product.setLowLimitAlert(1);
        product.setTax(1);
        product.setDeleted(true);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setCategoryId(123L);
        product.setDescription("The characteristics of someone or something");
        product.setEnabled((byte) 'A');
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(1);
        product.setPrice(1);
        when(this.productRepository.getById((Long) any())).thenReturn(product);
        ProductDto productDto = new ProductDto();
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(productDto);
        assertSame(productDto, this.productServiceImpl.getProductById(123L));
        verify(this.productRepository).getById((Long) any());
        verify(this.modelMapper).map((Object) any(), (Class<Object>) any());
        assertTrue(this.productServiceImpl.getAllProducts().isEmpty());
    }

    @Test
    void testDelete() throws Exception {
        Product product = new Product();
        product.setLowLimitAlert(1);
        product.setTax(1);
        product.setDeleted(true);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setCategoryId(123L);
        product.setDescription("The characteristics of someone or something");
        product.setEnabled((byte) 'A');
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(1);
        product.setPrice(1);

        Product product1 = new Product();
        product1.setLowLimitAlert(1);
        product1.setTax(1);
        product1.setDeleted(true);
        product1.setProductStatus(ProductStatus.ACTIVE);
        product1.setCategoryId(123L);
        product1.setDescription("The characteristics of someone or something");
        product1.setEnabled((byte) 'A');
        product1.setCompanyId(123L);
        product1.setUnit(Unit.LIBRE);
        product1.setId(123L);
        product1.setProductName("Product Name");
        product1.setQty(1);
        product1.setPrice(1);
        when(this.productRepository.save((Product) any())).thenReturn(product1);
        when(this.productRepository.getById((Long) any())).thenReturn(product);
        assertEquals("Product NameDeleted Successfully", this.productServiceImpl.delete(123L));
        verify(this.productRepository, atLeast(1)).getById((Long) any());
        verify(this.productRepository).save((Product) any());
        assertTrue(this.productServiceImpl.getAllProducts().isEmpty());
    }
}

