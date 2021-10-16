package com.mbmr.dto;

import javax.persistence.Id;

public class PayLoadDataDTO {
	
	private String appName;
	private String lineOfBusiness;
	private String channelName;
	
	private String conversationId;

	private String clientId;
	private String clientName;
	
	private String templateId;
	private String content;
	private String subjectLine;
	private String creates;
	private String updates;
	
	
	
	
	public PayLoadDataDTO(String appName, String lineOfBusiness, String channelName, String conversationId,
			String clientId, String clientName, String templateId, String content, String subjectLine, String creates,
			String updates) {
		super();
		this.appName = appName;
		this.lineOfBusiness = lineOfBusiness;
		this.channelName = channelName;
		this.conversationId = conversationId;
		this.clientId = clientId;
		this.clientName = clientName;
		this.templateId = templateId;
		this.content = content;
		this.subjectLine = subjectLine;
		this.creates = creates;
		this.updates = updates;
	}
	public PayLoadDataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
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
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSubjectLine() {
		return subjectLine;
	}
	public void setSubjectLine(String subjectLine) {
		this.subjectLine = subjectLine;
	}
	public String getCreates() {
		return creates;
	}
	public void setCreates(String creates) {
		this.creates = creates;
	}
	public String getUpdates() {
		return updates;
	}
	public void setUpdates(String updates) {
		this.updates = updates;
	}
	@Override
	public String toString() {
		return "PayLoadDataDTO [appName=" + appName + ", lineOfBusiness=" + lineOfBusiness + ", channelName="
				+ channelName + ", conversationId=" + conversationId + ", clientId=" + clientId + ", clientName="
				+ clientName + ", templateId=" + templateId + ", content=" + content + ", subjectLine=" + subjectLine
				+ ", creates=" + creates + ", updates=" + updates + "]";
	}
	
	
	
	
	
	
	
	
	

}
