package com.henry.jewellery.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.henry.jewellery.domain.Product;
import com.henry.jewellery.domain.ProductRepository;
import com.henry.jewellery.domain.ProductType;

@RestController
@RequestMapping("/products")
public class ProductController {
    
  private final ProductRepository repository;

  @Autowired
  public ProductController(ProductRepository repository) {
      this.repository = repository;
  }

  @RequestMapping(method=RequestMethod.GET)
  public List<Product> getProducts() {
      return repository.findAll();
  }
  
  @RequestMapping(method=RequestMethod.GET, params={"type"})
  public List<Product> getProducts(@RequestParam("type") ProductType productType) {
      return repository.findByType(productType);
  }
  
  @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
  public Product getProduct(@PathVariable Long productId) {
      return repository.findOne(productId);
  }
  @RequestMapping(value = "/types", method = RequestMethod.GET)
  public ProductType[] getProductTypes(){
      return ProductType.values();
  }
}
