package br.com.blz.testjava.Controller;

import br.com.blz.testjava.Pojo.Product;
import br.com.blz.testjava.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product){
        productService.save(product);
    }

}
