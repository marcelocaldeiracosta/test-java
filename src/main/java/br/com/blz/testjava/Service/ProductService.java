package br.com.blz.testjava.Service;

import br.com.blz.testjava.Pojo.Product;
import br.com.blz.testjava.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    ProductRepository repositorio;

    public void save(Product product) {
        repositorio.save(product);
    }

}


