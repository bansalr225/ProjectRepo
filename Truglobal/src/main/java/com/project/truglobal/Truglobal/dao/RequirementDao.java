package com.project.truglobal.Truglobal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.truglobal.Truglobal.dto.Requirement;

@Repository
public interface RequirementDao extends JpaRepository<Requirement, Integer>{

}
