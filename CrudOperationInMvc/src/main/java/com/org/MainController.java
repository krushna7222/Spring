package com.org;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import crudDao.ProductDao;
import crudModel.Product;

@Controller
public class MainController {

	@Autowired
	 private ProductDao productDao; //autowire by name
	
	     
	
	
	//show add product form
	@RequestMapping("/add_p")
	public String addProduct(Model m)
	{
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	

	
	//handle add product form
	@RequestMapping("/handle_product")
	public String insertData(@ModelAttribute Product prod)
	{
		
		System.out.println(prod);
		         //saveProduct
	 productDao.createProduct(prod);  //insert//charger,good,900
	  return "redirect:/hm";
		
		
	}
	
	
	@RequestMapping("/hm")
	public String home(Model m)
	{
		List<Product> products = productDao.getProducts(  );   //saveOr
		
		m.addAttribute("title","View Product");
		m.addAttribute("product",products);
		return "index1";//demo  //viewData
	}
	
		

	
	
		//delete handler
	@RequestMapping("/delete/{productId}")  //68
	public String  deleteProduct(@PathVariable("productId") int productId)
	{
		productDao.deleteProduct(productId); //41
		
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

}
