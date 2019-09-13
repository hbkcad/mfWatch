package com.mfwatch.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mfwatch.model.MFModel;

@Repository
public interface IMFdao extends JpaRepository<MFModel, Integer>{

	@Query("Select m from MFModel m where m.mfName LIKE CONCAT('%',:inpdata,'%')")
	List<MFModel> getFundsByName(@Param("inpdata")String inpData);
	
}
