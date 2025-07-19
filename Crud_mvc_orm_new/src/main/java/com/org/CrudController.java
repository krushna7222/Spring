package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import crudDao.ProductDao;
import crudModel.Product;

@Controller
public class CrudController {
	
	@Autowired
    private ProductDao productDao; //autowire by name
	
	
	@RequestMapping("/add_p")
	public String addProduct(Model m)
	{
		//m.addAttribute("title","Add Product");
		return "addPage";
	}
	
	@RequestMapping("/hm")
	public String viewProduct(Model m)
	{
		List<Product> products = productDao.getProducts(  );   //saveOr
	
	m.addAttribute("title","View Product");
	m.addAttribute("product",products);
	
		return "viewPage";
	}
	
	@RequestMapping("/handle_product")
	public String insertData(@ModelAttribute Product prod)
	{
		
		System.out.println(prod);
		         //saveProduct
	 productDao.createProduct(prod);  //insert//charger,good,900
	  return "redirect:/hm";
		
		
	}


	//update handler
	@RequestMapping("/update/{productId}") //QWW68
	public String updateProduct(@PathVariable("productId") int productId, Model m)
	{
		
		Product product=productDao.getProduct(productId);
		
		m.addAttribute("product",product);
		return "update_form";
		
		
	}
	
	@PostMapping("/update_product")
	public String updateData(@ModelAttribute("product") Product prod) {
	    productDao.updateProduct(prod);
	    return "redirect:/hm";
	}
	

			//delete handler
		@RequestMapping("/delete/{productId}")  //68
		public String  deleteProduct(@PathVariable("productId") int productId)
		{
			productDao.deleteProduct(productId); //41
			
			return "redirect:/hm";
			}


}
