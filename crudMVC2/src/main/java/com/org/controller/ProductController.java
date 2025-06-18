package com.org.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.crudDao.ProductDao;
import com.org.crudmodel.Product;

@Controller
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // show add product form
    @RequestMapping("/addpage")
    public String showAddForm(Model m) {
        m.addAttribute("product", new Product());
        return "add_product";
    }

    // handle form submission
    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        productDao.save(product);
        return "redirect:/viewpage";
    }

    // show all products
    @RequestMapping("/viewpage")
    public String viewProducts(Model m) {
        List<Product> list = productDao.getAllProducts();
        m.addAttribute("list", list);
        return "view_product";
    }

    // delete
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        productDao.delete(id);
        return "redirect:/viewpage";
    }

    // edit form
    @RequestMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model m) {
        Product p = productDao.getProduct(id);
        m.addAttribute("product", p);
        return "edit_product";
    }

    // update product
    @PostMapping("/update")
    public String updateProduct(@ModelAttribute Product product) {
        productDao.update(product);
        return "redirect:/viewpage";
    }
}