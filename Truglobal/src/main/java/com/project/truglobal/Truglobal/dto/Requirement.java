package com.project.truglobal.Truglobal.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Requirement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String requirementDetail;
	private String requirementType;
	private String requiremntEstimate;
	private String teamAssigned;

	@ManyToOne
	@JoinColumn(name = "project")
	private Project project;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequirementDetail() {
		return requirementDetail;
	}

	public void setRequirementDetail(String requirementDetail) {
		this.requirementDetail = requirementDetail;
	}

	public String getRequirementType() {
		return requirementType;
	}

	public void setRequirementType(String requirementType) {
		this.requirementType = requirementType;
	}

	public String getRequiremntEstimate() {
		return requiremntEstimate;
	}

	public void setRequiremntEstimate(String requiremntEstimate) {
		this.requiremntEstimate = requiremntEstimate;
	}

	public String getTeamAssigned() {
		return teamAssigned;
	}

	public void setTeamAssigned(String teamAssigned) {
		this.teamAssigned = teamAssigned;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
