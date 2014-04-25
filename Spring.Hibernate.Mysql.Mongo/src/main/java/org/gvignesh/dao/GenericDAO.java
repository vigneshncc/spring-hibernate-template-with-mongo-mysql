package org.gvignesh.dao;

import java.io.Serializable;


/**
 * 
 * GenericDAO represents a DAO interface to interact with model objects
 * persisted in the database. Typically DAOs are created only for so-called root
 * objects, i.e, model objects that are directly accessible. Dependent objects
 * are traversed from these root objects.
 * 
 * @author Vignesh Gopal
 * 
 * @param <E>
 *            the Model class
 * @param <T>
 */

public interface GenericDAO<T, E> extends com.googlecode.genericdao.dao.jpa.GenericDAO<T, Serializable> {
	
}