package com.controller;

import com.model.ProductModel;
import com.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The type Product controller.
 */
@Controller
public class ProductController {
    @Autowired

    private ProductService productService;

    /**
     * Add customer view page string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/")
    public String addCustomerViewPage(final Model model){
        productService.addProducts(model);
        return "AddProducts";
    }

    /**
     * Save product string.
     *
     * @param productModel the product model
     * @return the string
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("Product") final ProductModel productModel){
        productService.saveProducts(productModel);
        return "redirect:ViewProducts";
    }

    /**
     * Get product string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping(value = "/ViewProducts")
    public String getProduct(final Model model){
     productService.getAllProducts(model);
     return "ViewProducts";
    }
}
