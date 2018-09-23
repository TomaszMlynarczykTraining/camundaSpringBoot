package com.netia.iwork.Demo;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.model.bpmn.impl.BpmnModelInstanceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import com.netia.iwork.Demo.services.interfaces.ProjectService;

/**
 * Process Application exposing this application's resources the process engine. 
 */
@ProcessApplication
public class CamundaBpmProcessApplication extends ServletProcessApplication {


  private static final String PROCESS_DEFINITION_KEY = "test";

  @Autowired
  private RepositoryService rs;
  

  /**
   * In a @PostDeploy Hook you can interact with the process engine and access 
   * the processes the application has deployed. 
   */
  @PostDeploy
  public void onDeploymentFinished(ProcessEngine processEngine) {
	 
	  

	  //processEngine.getRuntimeService().startProcessInstanceById("Process_1:2:33168ff3-be83-11e8-8b9e-6c3be5f32736");
	  //processEngine.getRuntimeService().startProcessInstanceById("Process_1:1:25d7ac7a-bdbd-11e8-a57b-6c3be5f32736");
	  
	  //processEngine.getRuntimeService().startProcessInstanceById("Process_1:6:b93bfeb9-bf22-11e8-9f03-6c3be5f32736");
	  processEngine.getRuntimeService().startProcessInstanceById("Process_1:7:27218ceb-bf27-11e8-8f1f-6c3be5f32736");
/*	  Starter starter = new Starter();
	  starter.setRuntimeService(processEngine.getRuntimeService());
	  try {
		starter.afterPropertiesSet();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

 }

}
