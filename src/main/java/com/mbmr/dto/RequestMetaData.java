
package com.mbmr.dto;

import javax.persistence.Embeddable;

import javax.persistence.Entity;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;



public class RequestMetaData {
	
	private String appName;
	private String lineOfBusiness;
	private String channelName;
	private String conversationID;
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getConversationID() {
		return conversationID;
	}
	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}
	@Override
	public String toString() {
		return "RequestMetaData [appName=" + appName + ", lineOfBusiness=" + lineOfBusiness + ", channelName="
				+ channelName + ", conversationID=" + conversationID + "]";
	}	 

}
