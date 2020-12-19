package br.com.blz.testjava.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Inventory {
    private int quantity;
    private List<Warehouse> warehouses = new ArrayList<Warehouse>();
}
