package com.project.truglobal.Truglobal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.truglobal.Truglobal.dao.ProjectDao;
import com.project.truglobal.Truglobal.dto.Project;
import com.project.truglobal.Truglobal.pojo.ProjectRequest;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectDao projectDao;
	
	@Override
	public Boolean createProject(ProjectRequest projectRequest) {
		
		Project project= new Project();
		project.setProjectDetail(projectRequest.getProjectDetail());
		project.setProjectHead(projectRequest.getProjectHead());
		project.setProjectLocation(projectRequest.getProjectLocation());
		project.setProjectName(projectRequest.getProjectName());
		projectDao.save(project);
		return true;
	}

	@Override
	public List<Project> getProjects() {
		return projectDao.findAll();
	}

}
