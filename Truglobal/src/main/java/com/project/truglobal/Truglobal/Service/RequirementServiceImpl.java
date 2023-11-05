package com.project.truglobal.Truglobal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.truglobal.Truglobal.dao.ProjectDao;
import com.project.truglobal.Truglobal.dao.RequirementDao;
import com.project.truglobal.Truglobal.dto.Project;
import com.project.truglobal.Truglobal.dto.Requirement;
import com.project.truglobal.Truglobal.pojo.requirementRequest;

@Service
public class RequirementServiceImpl implements RequirementService {

	@Autowired
	private RequirementDao requirementDao;

	@Autowired
	private ProjectDao projectDao;

	@Override
	public boolean createRequirement(requirementRequest requirementRequest) {

		String projectName = requirementRequest.getProjectName();
		Project project = projectDao.findProjectByProjectName(projectName);
		if (null != project) {
			Requirement requirement = new Requirement();
			requirement.setProject(project);
			requirement.setRequirementDetail(requirementRequest.getRequirementDetail());
			requirement.setRequirementType(requirementRequest.getRequirementType());
			requirement.setRequiremntEstimate(requirementRequest.getRequiremntEstimate());
			requirement.setTeamAssigned(requirementRequest.getTeamAssigned());
			requirementDao.save(requirement);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Requirement> getRequirements() {
		return requirementDao.findAll();
	}

}
