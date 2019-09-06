package com.uni.app.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uni.app.main.request.modal.TableMetadataReq;
import com.uni.app.main.response.modal.OutputResponse;

@CrossOrigin(origins = "http://localhost:9786", maxAge = 3600)
@RestController
@EnableAutoConfiguration
public class ComparatorController implements ApplicationContextAware{
	private static final Logger logger = LoggerFactory.getLogger(ComparatorController.class); 
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	@RequestMapping(
			method = RequestMethod.POST,
			value = "/compareTableMetaData", 
			consumes = {"application/JSON"},
			produces = {"application/JSON"})
	public ResponseEntity<OutputResponse> compareTableMetaData(@RequestBody TableMetadataReq tableMetadata) {
		logger.info("Table Metadata request {}", tableMetadata.toString());
		OutputResponse outputResponse = new OutputResponse();
		outputResponse.setOutput("THIS IS OUTPUT1");
		outputResponse.setOutput("THIS IS OUTPUT2");
		outputResponse.setOutput("THIS IS OUTPUT3");
		outputResponse.setError("THIS IS ERROR1");
		outputResponse.setError("THIS IS ERROR2");
		return new ResponseEntity<OutputResponse>(outputResponse, HttpStatus.OK);
		//TableMetadataComparatorDao tableMetadataComparatorDao = applicationContext.getBean("tableMetadataComparatorDao", TableMetadataComparatorDao.class);
		//return tableMetadataComparatorDao.compareTableColumns(tableMetadata.getTableNames(),tableMetadata.getPrimaryEnv(), tableMetadata.getSecondaryEnv());
	}
}
