package crudDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crudModel.Product;
//import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;


@Component
public class ProductDao {

	  @Autowired                        //here, we are automatically generate the object of HibernateTemplate class...why we generate the object of HibernateTemplate class...bcz we want to use its readymade method like(save(insert),delete(delete),saveOrUpdate(update)
	  private SessionFactory sessionFactory; //Student student=new Student()
		  
//	@Autowired
	//private HibernateTemplate hibernateTemplate ;
		
		  //create/insert product into database
		  @Transactional                             //@Transactional annotation is used only in case of create,insert ,update,delete opeartion..not for select/get operation
		  public void createProduct(Product product) //bottle,back color,200
		  {
			  sessionFactory.getCurrentSession().persist(product);//68  //load(),get(),loadAll()
			  
			  //insert
			 // this.hibernateTemplate.save(product);
		  }
		  
		  
//By using @Transactional, Spring opens a session and binds it to the thread — allowing you to call getCurrentSession() safely.
          @Transactional
		  public List<Product> getProducts() 
		  {
			  
			Session s=  sessionFactory.getCurrentSession();
			   Query<Product> q =s.createQuery("from Product", Product.class);
			  return  q.getResultList();
		
		  }
          
          @Transactional(readOnly = true)
          public Product getProduct(int id) {
              return sessionFactory.getCurrentSession().get(Product.class, id);
          }
		  

          @Transactional
          public void updateProduct(Product product) {
             // sessionFactory.getCurrentSession().update(product);
        	  sessionFactory.getCurrentSession().merge(product);
          }
          
          @Transactional
          public void deleteProduct(int pid) 
          {
        	 Product pd= sessionFactory.getCurrentSession().get(Product.class, pid);
              sessionFactory.getCurrentSession().remove(pd);
          }

} 

