package com.mfwatch.service;

import java.util.List;

import com.mfwatch.model.MFModel;

public interface IMFService {

	public List<MFModel> getAllFunds();

	public List<MFModel> getFundsByName(String inpData);

}
