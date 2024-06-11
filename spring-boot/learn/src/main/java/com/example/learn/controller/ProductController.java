package com.example.learn.controller;


import com.example.learn.dto.ProductRecord;
import com.example.learn.models.ProductModel;
import com.example.learn.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController // subclasse de @Controler, deixa claro a implementação de uma API RESTful
public class ProductController {

    @Autowired // ponto de injeção de dados
    ProductRepository productRepository;


    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        return mv;
    }

    // métodos CRUD

    @PostMapping("/products") // método HTTP RESTful
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecord productRecord) {
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecord,productModel); // conversão de Record (DTO - data transfer object para Model
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel)); // retorna o status de objeto criado e salva o produto no repositório
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductModel>> getAllProducts(){
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Object> getOneProduct(@PathVariable(value="id")UUID id){
        Optional<ProductModel> product0 = productRepository.findById(id);
        if (product0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(product0.get());
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value="id")UUID id,
                                                @RequestBody @Valid ProductRecord productRecord){
        Optional<ProductModel> product0 = productRepository.findById(id);
        if (product0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        var productModel = product0.get();
        BeanUtils.copyProperties(productRecord, productModel);
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.save(productModel));
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable(value ="id") UUID id){
        Optional<ProductModel> product0 = productRepository.findById(id);
        if (product0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        productRepository.delete(product0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Product Deteted sussefully.");
    }
}
