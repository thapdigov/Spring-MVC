package az.perfect.springweb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "product_name")
    private String product_name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "category_id")
    private int category_id;
    @Column(name = "country_id")
    private int country_id;
}

