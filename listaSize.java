package com.example.demo.service;

import com.example.demo.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Flux<Product> findAll() {

        Product p1 = new Product(1, "producto A", 20.0);
        Product p2 = new Product(2, "producto B", 10.0);

        //Para representar una lista vacia se haria esto:
        Product p3 = new Product();
        Product p4 = new Product();
        List<Product> l1 = Arrays.asList();


        ArrayList<Product> lista2 = new  ArrayList<>();
        lista2.add(p1);
        lista2.add(p2);

        if(lista2.size() == 0){
            log.info("lista null");
            return Flux.fromIterable(new ArrayList<>());
        }else{
            log.info("lista con data");
            return Flux.fromIterable(lista2);
        }
    }
}
