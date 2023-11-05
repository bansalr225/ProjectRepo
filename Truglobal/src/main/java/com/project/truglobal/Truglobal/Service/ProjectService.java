package com.project.truglobal.Truglobal.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project.truglobal.Truglobal.dto.Project;
import com.project.truglobal.Truglobal.pojo.ProjectRequest;

@Service
public interface ProjectService {

	public Boolean createProject(ProjectRequest projectRequest);

	public List<Project> getProjects();

}
