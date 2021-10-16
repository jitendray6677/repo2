package com.mbmr.entity;

import java.io.Serializable;

public class PayLoadId implements Serializable{
	
	
	 private String clientId;
	 private String conversationId;

	   
	    public PayLoadId() {
		super();
		
	}


		public PayLoadId(String clientId, String conversationId) {
			super();
			this.clientId = clientId;
			this.conversationId = conversationId;
		}


		public String getClientId() {
			return clientId;
		}


		public void setClientId(String clientId) {
			this.clientId = clientId;
		}


		public String getConversationId() {
			return conversationId;
		}


		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}


		@Override
		public String toString() {
			return "PayLoadId [clientId=" + clientId + ", conversationId=" + conversationId + "]";
		}


		
	    

}
