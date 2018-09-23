package com.netia.iwork.Demo.processelements;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netia.iwork.Demo.services.interfaces.ProjectService;

@Component
public class TestDelegate implements JavaDelegate {
	
	@Autowired
	private ProjectService service;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.getBusinessKey();
		service.addProject();
		
	}

}
