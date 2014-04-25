package org.gvignesh.init;

import org.gvignesh.service.SaveIntoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("initiate")
public class Initiate {
	@Autowired
	private SaveIntoDbService saveIntoDbService;
	
	public void initiate(){
		saveIntoDbService.saveIntoMongo();
		//saveIntoDbService.saveIntoMysql();
	}
}