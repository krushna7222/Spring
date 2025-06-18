package com.org.crudDao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.org.crudmodel.Product;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Product p) {
        sessionFactory.getCurrentSession().save(p);
    }

    public List<Product> getAllProducts() {
        return sessionFactory.getCurrentSession().createQuery("from Product", Product.class).list();
    }

    public void delete(int id) {
        Product p = sessionFactory.getCurrentSession().get(Product.class, id);
        if (p != null) sessionFactory.getCurrentSession().delete(p);
    }

    public Product getProduct(int id) {
        return sessionFactory.getCurrentSession().get(Product.class, id);
    }

    public void update(Product p) {
        sessionFactory.getCurrentSession().update(p);
    }
}