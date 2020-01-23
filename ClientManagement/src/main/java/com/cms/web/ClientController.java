package com.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.model.Client;
import com.cms.serviceimpl.ClientServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class ClientController 
{
	@Autowired
	ClientServiceImpl clientServiceImpl;
	
	@GetMapping("client/getClients")
	public List<Client>getAllClients(){
		
		return clientServiceImpl.getClients() ;
	}
	@PostMapping("client/addClient")
	public void addClient(@RequestBody Client client) 
	{
		clientServiceImpl.addClient(client);
	}
	@PutMapping("client/updateClient")
	public void updateClient(@RequestBody Client client) 
	{
		clientServiceImpl.updateClient(client);
	}
	@DeleteMapping("client/deleteClient/{id}")
	public void deleteClient(@PathVariable int id) {
		System.out.println("inside delete+++++++++++++++++++");
		clientServiceImpl.deleteClient(id);
	}
}
