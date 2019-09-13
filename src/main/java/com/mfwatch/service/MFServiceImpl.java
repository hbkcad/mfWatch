package com.mfwatch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfwatch.dao.IMFdao;
import com.mfwatch.model.MFModel;

@Service
public class MFServiceImpl implements IMFService {

	@Autowired
	IMFdao iMFdao;

	@Override
	public List<MFModel> getAllFunds() {
		return iMFdao.findAll();

	}

	@Override
	public List<MFModel> getFundsByName(String inpData) {
		
		return iMFdao.getFundsByName(inpData);
	}

}
