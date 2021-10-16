package com.mbmr.dto;

public class Templates {
	
	
	private String templateID;
	private String content;
	private String subjectLine;
	
	
	
	
	
	public Templates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Templates(String templateID, String content, String subjectLine) {
		super();
		this.templateID = templateID;
		this.content = content;
		this.subjectLine = subjectLine;
	}
	public String getTemplateID() {
		return templateID;
	}
	public void setTemplateID(String templateID) {
		this.templateID = templateID;
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
	@Override
	public String toString() {
		return "Templates [templateID=" + templateID + ", content=" + content + ", subjectLine=" + subjectLine + "]";
	}
	
	
	
	
	

}
