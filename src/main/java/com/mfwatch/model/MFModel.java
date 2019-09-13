package com.mfwatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mfmaster", schema = "dbo")
public class MFModel {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "amfi")
	private Integer amfi;
	@Column(name = "mfname")
	private String mfName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmfi() {
		return amfi;
	}

	public void setAmfi(Integer amfi) {
		this.amfi = amfi;
	}

	public String getMfName() {
		return mfName;
	}

	public void setMfName(String mfName) {
		this.mfName = mfName;
	}

}
