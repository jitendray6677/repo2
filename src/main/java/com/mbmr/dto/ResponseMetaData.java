
package com.mbmr.dto;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;




public class ResponseMetaData {
	
	private String statusCode;
	private String statusDesc;	
	private String conversationID;
	
	
	
	
	public ResponseMetaData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseMetaData(String statusCode, String statusDesc, String conversationID) {
		super();
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
		this.conversationID = conversationID;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getConversationID() {
		return conversationID;
	}
	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}
	@Override
	public String toString() {
		return "ResponseMetaData [statusCode=" + statusCode + ", statusDesc=" + statusDesc + ", conversationID="
				+ conversationID + "]";
	}
	
	

}
