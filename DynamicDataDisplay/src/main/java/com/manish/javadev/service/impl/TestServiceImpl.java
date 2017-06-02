package com.manish.javadev.service.impl;

import com.manish.javadev.service.TestService;

public class TestServiceImpl implements TestService {
	private String avsProperties;
	private String transferProperties;

	public String getAvsProperties() {
		return avsProperties;
	}

	public void setAvsProperties(String avsProperties) {
		this.avsProperties = avsProperties;
		System.out.println(this.avsProperties);
	}

	public String getTransferProperties() {
		return transferProperties;
	}

	public void setTransferProperties(String transferProperties) {
		this.transferProperties = transferProperties;
		System.out.println(this.transferProperties);
	}

}
