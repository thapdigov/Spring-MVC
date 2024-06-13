package az.perfect.springweb.controller;

import az.perfect.springweb.model.Product;
import az.perfect.springweb.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mehsulls")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("all")
    public List<Product> getAllprodutcs(){
        return productRepository.findAll();

    }


}
