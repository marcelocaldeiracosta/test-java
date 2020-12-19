package br.com.blz.testjava.Repository;

import br.com.blz.testjava.Pojo.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ProductRepository {
    @PersistenceContext
    EntityManager entityManager;


    public void save(Product product) {
        entityManager.persist(product);
    }

}
