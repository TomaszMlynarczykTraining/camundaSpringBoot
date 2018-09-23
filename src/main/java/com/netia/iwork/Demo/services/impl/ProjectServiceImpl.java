package com.netia.iwork.Demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netia.iwork.Demo.entities.Project;
import com.netia.iwork.Demo.repositories.ProjectRepository;
import com.netia.iwork.Demo.services.interfaces.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<String> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProject() {
		Project project = new Project();
		project.setName("Name");
		project.setNum(3);
		project.setPosition("3");

		projectRepository.save(project);
	}

}
