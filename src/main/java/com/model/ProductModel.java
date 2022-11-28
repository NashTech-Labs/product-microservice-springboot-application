package com.model;


import javax.persistence.*;

/**
 * The type Product model.
 */
@Entity
public class ProductModel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;
    private String productCategory;
    private String productPrice;


    /**
     * Instantiates a new Product model.
     *
     * @param id              the id
     * @param productName     the product name
     * @param productCategory the product category
     * @param productPrice    the product price
     */
    public ProductModel(Long id, String productName, String productCategory, String productPrice) {
        this.id = id;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }

    /**
     * Instantiates a new Product model.
     */
    public ProductModel() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets product category.
     *
     * @return the product category
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets product category.
     *
     * @param productCategory the product category
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Gets product price.
     *
     * @return the product price
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * Sets product price.
     *
     * @param productPrice the product price
     */
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }




}
