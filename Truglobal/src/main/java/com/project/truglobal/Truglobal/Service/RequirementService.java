package com.project.truglobal.Truglobal.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.truglobal.Truglobal.dto.Project;
import com.project.truglobal.Truglobal.dto.Requirement;
import com.project.truglobal.Truglobal.pojo.requirementRequest;

@Service
public interface RequirementService {

 	public boolean createRequirement(requirementRequest requirementRequest);

	public List<Requirement> getRequirements();

}
