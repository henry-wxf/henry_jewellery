package com.henry.jewellery.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.henry.jewellery.domain.model.Product;
import com.henry.jewellery.domain.model.ProductType;
import com.henry.jewellery.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    
  private final ProductService service;

  @Autowired
  public ProductController(ProductService productService) {
      this.service = productService;
  }

  @RequestMapping(method=RequestMethod.GET)
  public List<Product> getProducts() {
      return service.getAllProducts();
  }
  
  @RequestMapping(method=RequestMethod.GET, params={"type"})
  public List<Product> getProducts(@RequestParam("type") ProductType productType) {
      return service.findProductsByType(productType);
  }
  
  @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
  public Product getProduct(@PathVariable Long productId) {
      return service.getProductById(productId);
  }
  @RequestMapping(value = "/types", method = RequestMethod.GET)
  public ProductType[] getProductTypes(){
      return ProductType.values();
  }
}
