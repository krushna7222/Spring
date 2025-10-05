package com.org.crudDao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Repository;
//
////@Component
////public class ProductDao {
////
////}
//
//@Repository
//public class ProductDao {
//
//    @Autowired
//    private HibernateTemplate hibernateTemplate;  
//
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.crudModel.Product;


@Repository
//@Component
public class ProductDao {

	@Autowired   
    //here, we are automatically generate the object of HibernateTemplate class...why we generate the object of HibernateTemplate class...bcz we want to use its readymade method like(save(insert),delete(delete),saveOrUpdate(update)
    private HibernateTemplate hibernateTemplate; //Student student=new Student()
   
     //create/insert product into database
     @Transactional                             //@Transactional annotation is used only in case of create,insert ,update,delete opeartion..not for select/get operation
     public void createProduct(Product p) 
     {
         this.hibernateTemplate.saveOrUpdate(p);  //9//68  //load(),get(),loadAll()
         //insert,update,delete,select
     }
}
