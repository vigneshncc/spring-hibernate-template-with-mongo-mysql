package org.gvignesh.dao.impl;

import java.io.Serializable;

import org.gvignesh.dao.GenericDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hibernate implementation of the GenericDAO interface.
 * 
 * @author Vignesh Gopal
 *
 * @param <E> the model class for this DAO
 * @param <T> Default Mention as Long
 */

public class GenericDAOImpl<T, E> extends com.googlecode.genericdao.dao.jpa.GenericDAOImpl<T, Serializable> implements GenericDAO<T, E> {
	
	@Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
	
}