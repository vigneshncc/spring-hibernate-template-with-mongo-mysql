package org.gvignesh.service.impl;

import org.gvignesh.dao.EmployeeDAO;
import org.gvignesh.domain.mysql.Employee;
import org.gvignesh.service.SaveIntoDbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("saveIntoDbService")
public class SaveIntoDbServiceImpl implements SaveIntoDbService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(SaveIntoDbServiceImpl.class);
	
	@Override
	@Transactional
	public void saveIntoMysql() {
		logger.debug("The Company Name is "+ getEmployeeObj().getCompany());
		employeeDAO.save(getEmployeeObj());
		logger.debug("=========>   Saved object");
	}

	@Override
	public void saveIntoMongo() {
		mongoTemplate.save(getMongoEmployeeObj());
	}

	@Override
	public Employee getEmployeeObj() {
		Employee mysql = new Employee();
		mysql.setCompany("Technolog");
		mysql.setName("Vignesh Gopal");
		return mysql;
	}
	
	protected org.gvignesh.domain.mongo.Employee getMongoEmployeeObj(){
		org.gvignesh.domain.mongo.Employee mongo = new org.gvignesh.domain.mongo.Employee();
		mongo.setId(1);
		mongo.setCompany("Technolog");
		mongo.setName("Vignesh Gopal");
		return mongo;
	}
}
