package com.project.truglobal.Truglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.truglobal.Truglobal.Service.RequirementService;
import com.project.truglobal.Truglobal.dto.Project;
import com.project.truglobal.Truglobal.dto.Requirement;
import com.project.truglobal.Truglobal.pojo.RestResponse;
import com.project.truglobal.Truglobal.pojo.requirementRequest;

@RestController
@RequestMapping("/requirement")
public class RequirementController {
	@Autowired
	private RequirementService requirementService;

	@PostMapping("/createRequirement")
	public RestResponse<String> createRequirement(@RequestBody requirementRequest requirementRequest) {
		if (requirementService.createRequirement(requirementRequest))
			return new RestResponse<String>(false, "0", "Requirement Created Successfully", "SUCCESS");
		return new RestResponse<String>(true, "0", "Requiremnt Not Created. Project with project name not exists.",
				"FAILED");
	}

	@GetMapping("/getRequirements")
	public RestResponse<List<Requirement>> getProjects() {
		List<Requirement> list = requirementService.getRequirements();
		return new RestResponse<List<Requirement>>(false, "0", list, "SUCCESS");
	}
}
