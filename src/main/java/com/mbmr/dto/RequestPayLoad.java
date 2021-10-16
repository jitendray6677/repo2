package com.mbmr.dto;


public class RequestPayLoad {
	
	private RequestMetaData requestMetaData;
	
	private RequestPayloadData requestPayloadData;

	public RequestPayLoad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestPayLoad(RequestMetaData requestMetaData, RequestPayloadData requestPayloadData) {
		super();
		this.requestMetaData = requestMetaData;
		this.requestPayloadData = requestPayloadData;
	}

	public RequestMetaData getRequestMetaData() {
		return requestMetaData;
	}

	public void setRequestMetaData(RequestMetaData requestMetaData) {
		this.requestMetaData = requestMetaData;
	}

	public RequestPayloadData getRequestPayloadData() {
		return requestPayloadData;
	}

	public void setRequestPayloadData(RequestPayloadData requestPayloadData) {
		this.requestPayloadData = requestPayloadData;
	}

	@Override
	public String toString() {
		return "AppRequest [requestMetaData=" + requestMetaData + ", requestPayloadData=" + requestPayloadData + "]";
	}

	
	
	

}
