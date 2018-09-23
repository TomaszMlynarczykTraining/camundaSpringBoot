package com.netia.iwork.Demo;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean {

	 @Autowired
	  private RuntimeService runtimeService;

	  public void afterPropertiesSet() throws Exception {
		runtimeService.startProcessInstanceById("Process_1:7:27218ceb-bf27-11e8-8f1f-6c3be5f32736");
	  }

	  public void setRuntimeService(RuntimeService runtimeService) {
	    this.runtimeService = runtimeService;
	  }
	}