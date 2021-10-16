package com.mbmr.dto;

public class RequestPayloadData {	
	
	
	private String clientId;
	private String clientName;
	
	public RequestPayloadData(String clientId, String clientName) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
	}
	public RequestPayloadData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	@Override
	public String toString() {
		return "RequestPayloadData [clientId=" + clientId + ", clientName=" + clientName + "]";
	}

	
	
}
