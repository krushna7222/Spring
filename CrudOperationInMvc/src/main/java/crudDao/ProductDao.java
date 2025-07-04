package crudDao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crudModel.Product;

@Component        //<bean  class="Prr" id="p1"> tag
public class ProductDao {  //Student  accepr

	  @Autowired                        //here, we are automatically generate the object of HibernateTemplate class...why we generate the object of HibernateTemplate class...bcz we want to use its readymade method like(save(insert),delete(delete),saveOrUpdate(update)
	 private HibernateTemplate hibernateTemplate; //Student student=new Student()
	  
	
	  //create/insert product into database
	  @Transactional                             //@Transactional annotation is used only in case of create,insert ,update,delete opeartion..not for select/get operation
	  public void createProduct(Product product) //bottle,back color,200
	  {
		  this.hibernateTemplate.saveOrUpdate(product);  //68  //load(),get(),loadAll()
		  //insert
	  }
	  
	  
	
	  //get all products/select
	  public List<Product> getProducts(  )   //10,100   excuteUpdate()=> create,insert,up,dele
	  {
		List<Product>  products   =this.hibernateTemplate.loadAll(Product.class);
		  //select
		  return products;
	  }
	  
	
	  
	  //delete the single product
	  @Transactional  
	  public void deleteProduct(int p1)  //68
	  {
		  Product p = this.hibernateTemplate.load(Product.class, p1);  //load() and get() both are used to fetch single record from the database
		  this.hibernateTemplate.delete(p);;   //saveOrUP, loadAll(),deley, load()/get()
		  
		 
		
		// alter table product AUTO_INCREMENT=1;
		  //alter table product AUTO_INCREMENT=id-1;
		  
		  
	  }
	  	
	  //get the single product  //select
	  public Product getProduct(int pid)
	  {
		  return this.hibernateTemplate.get(Product.class,pid);
	 }
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
}
