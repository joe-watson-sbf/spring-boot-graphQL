package com.joedev.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {
    private final ProductRepository productRepository;

    public GraphQLController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryMapping
    public Product product(@Argument int id) {
        return productRepository.findById(id).orElse(null);
    }

    @QueryMapping
    public Iterable<Product> products() {
        return productRepository.findAll();
    }

    @QueryMapping
    public List<Product> productsByName(@Argument String name) {
        return productRepository.findByNameIgnoreCase(name);
    }

    @QueryMapping
    public List<Product> productsByPrice(@Argument double price) {
        return productRepository.findByPrice(price);
    }


    @SchemaMapping(typeName = "Mutation", field = "createProduct")
    public Product createProduct(@Argument String name, @Argument double price, @Argument String description) {
        return productRepository.save(
                new Product(null, name, description, price)
        );
    }

    @SchemaMapping(typeName = "Mutation", field = "updateProduct")
    public Product updateProduct(@Argument int id, @Argument String name, @Argument double price, @Argument String description) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        return productRepository.save(product);
    }

    @SchemaMapping(typeName = "Mutation", field = "deleteProduct")
    public boolean deleteProduct(@Argument int id) {
        productRepository.deleteById(id);
        return true;
    }

    @SchemaMapping(typeName = "Mutation", field = "updateProductPrice")
    public Product updateProductPrice(@Argument int id, @Argument double price) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        product.setPrice(price);
        return productRepository.save(product);
    }
}
