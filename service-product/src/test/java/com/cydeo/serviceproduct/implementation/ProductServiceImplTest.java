package com.cydeo.serviceproduct.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cydeo.servicecommon.contract.ProductDto;
import com.cydeo.serviceproduct.entity.Category;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.cydeo.serviceproduct.mapper.MapperUtil;
import com.cydeo.serviceproduct.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
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
    private MapperUtil mapperUtil;
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
    public void listOfCompanyProductsTest() throws Exception {

        List<Product> mockData = new ArrayList<>();

        String errorMessage = "There is no product listed under this company yet";

        when(productRepository.findAllByCompanyId((Long) ArgumentMatchers.any())).thenReturn(mockData);
//        List<ProductDto> actualList = productServiceImpl.listOfCompanyProducts(1234L);
//        assertTrue(actualList.isEmpty());

        Exception exception = assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                productServiceImpl.listOfCompanyProducts(1234L);

            }
        });
        assertEquals(errorMessage,exception.getMessage());
//        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(new ProductDto());
//        when(this.modelMapper.map(any(),any())).thenReturn(new ProductDto());








    }

    @Test
    void testListOfCompanyProducts2() throws Exception {
        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        Product product = new Product();
        product.setLowLimitAlert(0);
        product.setCategoryId(category);
        product.setTax(0);
        product.setIsDeleted(false);
        product.setUpdated_by(123L);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setDescription("The characteristics of someone or something");
        product.setEnabled(true);
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setCreated_by(123L);
        product.setIsDeleted(true);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(0);
        product.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));


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
        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        Product product = new Product();
        product.setLowLimitAlert(0);
        product.setCategoryId(category);
        product.setTax(0);
        product.setIsDeleted(true);
        product.setUpdated_by(123L);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setDescription("The characteristics of someone or something");
        product.setEnabled(true);
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setCreated_by(123L);
        product.setIsDeleted(true);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(0);
        product.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));

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
        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        Product product = new Product();
        product.setLowLimitAlert(0);
        product.setCategoryId(category);
        product.setTax(0);
        product.setIsDeleted(true);
        product.setUpdated_by(123L);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setDescription("The characteristics of someone or something");
        product.setEnabled(true);
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setCreated_by(123L);
        product.setIsDeleted(true);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(0);
        product.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category1 = new Category();
        category1.setProduct(new ArrayList<>());
        category1.setCompanyId(123L);
        category1.setCreated_by(123L);
        category1.setIsDeleted(true);
        category1.setId(123L);
        category1.setUpdated_by(123L);
        category1.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setEnabled(true);
        category1.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setDescription("The characteristics of someone or something");

        Product product1 = new Product();
        product1.setLowLimitAlert(0);
        product1.setCategoryId(category1);
        product1.setTax(0);
        product.setIsDeleted(true);
        product1.setUpdated_by(123L);
        product1.setProductStatus(ProductStatus.ACTIVE);
        product1.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setDescription("The characteristics of someone or something");
        product1.setEnabled(true);
        product1.setCompanyId(123L);
        product1.setUnit(Unit.LIBRE);
        product1.setCreated_by(123L);
        product1.setIsDeleted(true);
        product1.setId(123L);
        product1.setProductName("Product Name");
        product1.setQty(0);
        product1.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));


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
        Category category = new Category();
        ArrayList<Product> productList = new ArrayList<>();
        category.setProduct(productList);
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        Product product = new Product();
        product.setLowLimitAlert(1);
        product.setCategoryId(category);
        product.setTax(1);
        product.setIsDeleted(true);
        product.setUpdated_by(123L);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setDescription("The characteristics of someone or something");
        product.setEnabled(true);
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setCreated_by(123L);
        product.setIsDeleted(true);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(1);
        product.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));

        when(this.productRepository.getById((Long) any())).thenReturn(product);
        ProductDto productDto = new ProductDto();
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(productDto);
        assertSame(productDto, this.productServiceImpl.getProductById(123L));
        verify(this.productRepository).getById((Long) any());
        verify(this.modelMapper).map((Object) any(), (Class<Object>) any());
        assertEquals(productList, this.productServiceImpl.getAllProducts());
    }

    @Test
    void testDelete() throws Exception {
        Category category = new Category();
        ArrayList<Product> productList = new ArrayList<>();
        category.setProduct(productList);
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        Product product = new Product();
        product.setLowLimitAlert(1);
        product.setCategoryId(category);
        product.setTax(1);
        product.setIsDeleted(true);
        product.setUpdated_by(123L);
        product.setProductStatus(ProductStatus.ACTIVE);
        product.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setDescription("The characteristics of someone or something");
        product.setEnabled(true);
        product.setCompanyId(123L);
        product.setUnit(Unit.LIBRE);
        product.setCreated_by(123L);
        product.setIsDeleted(true);
        product.setId(123L);
        product.setProductName("Product Name");
        product.setQty(1);
        product.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));


        Category category1 = new Category();
        category1.setProduct(new ArrayList<>());
        category1.setCompanyId(123L);
        category1.setCreated_by(123L);
        category1.setIsDeleted(true);
        category1.setId(123L);
        category1.setUpdated_by(123L);
        category1.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setEnabled(true);
        category1.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setDescription("The characteristics of someone or something");

        Product product1 = new Product();
        product1.setLowLimitAlert(1);
        product1.setCategoryId(category1);
        product1.setTax(1);
        product1.setIsDeleted(true);
        product1.setUpdated_by(123L);
        product1.setProductStatus(ProductStatus.ACTIVE);
        product1.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setDescription("The characteristics of someone or something");
        product1.setEnabled(true);
        product1.setCompanyId(123L);
        product1.setUnit(Unit.LIBRE);
        product1.setCreated_by(123L);
        product1.setIsDeleted(true);
        product1.setId(123L);
        product1.setProductName("Product Name");
        product1.setQty(1);
        product1.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        when(this.productRepository.save((Product) any())).thenReturn(product1);
        when(this.productRepository.getById((Long) any())).thenReturn(product);
        assertEquals("Product NameDeleted Successfully", this.productServiceImpl.delete(123L));
        verify(this.productRepository, atLeast(1)).getById((Long) any());
        verify(this.productRepository).save((Product) any());
        assertEquals(productList, this.productServiceImpl.getAllProducts());
    }

   

}

