package com.example.learn.repositories;

import com.example.learn.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.UUID;
 /*

 Bean: the objects that form the backbone of your application

 @Component
 @Service
 @Repostitory -possui transações
 @Contoller - possui endpoints

 */

@Repository // é opcional, pois essa interface herda os atributos de JpaRepository, que utiliza o bean Repository implicitamente
public interface ProductRepository extends JpaRepository<ProductModel, UUID> { // interface responsável por implementar todas funções do JPA
}
