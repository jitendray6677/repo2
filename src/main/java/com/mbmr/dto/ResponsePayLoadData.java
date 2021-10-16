
package com.mbmr.dto;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;




public class ResponsePayLoadData {
	
	private List<Templates> templates;

	public List<Templates> getTemplates() {
		return templates;
	}

	public void setTemplates(List<Templates> templates) {
		this.templates = templates;
	}

	
	
	

}
