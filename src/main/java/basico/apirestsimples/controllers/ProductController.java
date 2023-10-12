package basico.apirestsimples.controllers;

import basico.apirestsimples.entities.Department;
import basico.apirestsimples.entities.Product;
import basico.apirestsimples.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getObjects() {

        List<Product> list = productRepository.findAll();
        return list;

    }

}
