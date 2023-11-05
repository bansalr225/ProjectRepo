package com.project.truglobal.Truglobal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.truglobal.Truglobal.dto.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

	@Query("SELECT p FROM Project p WHERE p.projectName = :projectName")
	public Project findProjectByProjectName(@Param("projectName") String projectName);

}
