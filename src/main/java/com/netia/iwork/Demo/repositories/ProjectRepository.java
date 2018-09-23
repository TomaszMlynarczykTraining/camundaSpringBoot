package com.netia.iwork.Demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netia.iwork.Demo.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	 Project findByProject(long projectId);
}
