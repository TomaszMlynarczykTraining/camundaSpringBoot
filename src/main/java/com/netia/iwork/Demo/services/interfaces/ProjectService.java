package com.netia.iwork.Demo.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netia.iwork.Demo.entities.Project;


public interface ProjectService {
	public List<String> getAllProjects();
	public void addProject();
}
