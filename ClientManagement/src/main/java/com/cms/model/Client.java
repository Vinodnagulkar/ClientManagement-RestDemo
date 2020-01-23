package com.cms.model;

public class Client 
{
	private int clientId;
	private String ClientName;
	public Client(int clientId, String clientName) {
		super();
		this.clientId = clientId;
		ClientName = clientName;
	}
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", ClientName=" + ClientName + "]";
	}
	
}
