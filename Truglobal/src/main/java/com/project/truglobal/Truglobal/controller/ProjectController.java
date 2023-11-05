package com.project.truglobal.Truglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.truglobal.Truglobal.Service.ProjectService;
import com.project.truglobal.Truglobal.dto.Project;
import com.project.truglobal.Truglobal.pojo.ProjectRequest;
import com.project.truglobal.Truglobal.pojo.RestResponse;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@PostMapping("/createProject")
	public RestResponse<String> createProject(@RequestBody ProjectRequest projectRequest) {
		if (projectService.createProject(projectRequest))
			return new RestResponse<String>(false, "0", "Project Created Successfully", "SUCCESS");
		return new RestResponse<String>(true, "0", "Unable to create project", "FAILED");
	}

	@GetMapping("/getProjects")
	public RestResponse<List<Project>> getProjects() {
		List<Project> list = projectService.getProjects();
		return new RestResponse<List<Project>>(false, "0", list, "SUCCESS");
	}

}
