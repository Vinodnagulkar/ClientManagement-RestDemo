package com.cms.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.cms.model.Client;

@Service
public class ClientServiceImpl 
{
static List<Client>clientList=new ArrayList<Client>();

static {
		clientList.add(new Client(1, "JOHN DHEERE"));
		clientList.add(new Client(2, "BNY"));
		clientList.add(new Client(3, "SCHLUMBERGER"));
	   }

	
	public List<Client>getClients()
	{
		
		return clientList;
	}
	
	public void addClient(Client client) 
	{
		clientList.add(client);
	}
	
	public void updateClient(Client client) {
	
		ListIterator <Client> listIterator = clientList.listIterator();
        
		while (listIterator.hasNext()) {
		Client client2 = (Client) listIterator.next();
		
			if(client2.getClientId()==client.getClientId())
			{
        	client2.setClientName(client.getClientName());
        	listIterator.add(client2);
			}
		}
	}
	
	public void deleteClient(int id) 
	{
		Iterator<Client>itr=clientList.iterator();
		while (itr.hasNext())
		{
			Client c = (Client) itr.next();
			if(c.getClientId()==id)
				itr.remove();
		}
	}
}
