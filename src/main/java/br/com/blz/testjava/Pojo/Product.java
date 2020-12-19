package br.com.blz.testjava.Pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Product {

    private int sku;
    private String name;
    private Inventory inventory;


}
