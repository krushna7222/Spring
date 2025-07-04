package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudDao.ProductDao;
import com.crudModel.Product;



@Controller
public class CrudController {
	
	@Autowired
    private ProductDao productDao; //autowire by name
	
	
	@RequestMapping("/add_p")
	public String addProduct()
	{
		//m.addAttribute("title","Add Product");
		return "addPage";
	}
	
	
	@RequestMapping("/hm")
    public String viewData(Model m)
    {
        List<Product> plist=productDao.getAllData();
        
    	m.addAttribute("title","View Product");        
        m.addAttribute("prouctList", plist);
        
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

	
	@RequestMapping("update/{id}") //202   
    public String update( @PathVariable("id") int i, Model m) //i=252
    {
      Product    p=productDao.getSingleProd(i);  // 202 |  2928 | ash saha ashas asa| watch |
        
      m.addAttribute("product", p);
      
        return "update_form";
        
    }
    
    //update_product
    @PostMapping(value = "/update_product" )
    public String updateData(@ModelAttribute("product") Product prod) 
    {
     
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
