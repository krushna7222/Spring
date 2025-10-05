package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.crudDao.ProductDao;


@Controller
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
//	 @RequestMapping("/handle_product")
//	    public String insertData(@ModelAttribute Product p) //charger,white,2000
//	    {
//	        
//	        System.out.println(p);
//	                 //saveProduct
//	        productDao.createProduct(p);  //insert//charger,good,900
//	     // return "redirect:https://www.google.com/search?q="+p.getName();
//	     return "redirect:/viewpage";
//	        
//	        
//	    }


//
//    @Autowired
//    private ProductDao dao;
//
    // When "Add Product" is clicked
    @GetMapping("/addpage")
    public String showAddForm() {
//        model.addAttribute("product", new Product());
        return "addpage";
    }
//
//    // When "View Product" is clicked
//    @GetMapping("/viewpage")
//    public String showProductList(Model model) {
//        List<Product> products = dao.getAllProducts();
//        model.addAttribute("products", products);
//        return "viewpage";
//    }
//
//    @PostMapping("/save")
//    public String saveProduct(@ModelAttribute Product product) {
//        dao.saveProduct(product);
//        return "redirect:/viewpage";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String editProduct(@PathVariable int id, Model model) {
//        model.addAttribute("product", dao.getProductById(id));
//        return "product-form";
//    }
//
//    @PostMapping("/update")
//    public String updateProduct(@ModelAttribute Product product) {
//        dao.updateProduct(product);
//        return "redirect:/viewpage";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        dao.deleteProduct(id);
//        return "redirect:/viewpage";
//    }
}
