package com.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("api/v1")
public class ClientController 
{
	@Autowired
	ClientServiceImpl clientServiceImpl;
	
	@GetMapping("/client")
	public ResponseEntity<List<Client>>getAllClients(){
		return new ResponseEntity<>(clientServiceImpl.getClients(), HttpStatus.FOUND) ;
	}
	
	@PostMapping("/client")
	public ResponseEntity<?> addClient(@RequestBody Client client) {
		return new ResponseEntity<>(clientServiceImpl.addClient(client), HttpStatus.CREATED);
	}
	
	@PutMapping("/client")
	public ResponseEntity<?> updateClient(@RequestBody Client client) {
		return new ResponseEntity<>(clientServiceImpl.updateClient(client), HttpStatus.OK);
	}
	
	@DeleteMapping("client/{id}")
	public ResponseEntity<?> deleteClient(@PathVariable int id) {
		return new ResponseEntity<>(clientServiceImpl.deleteClient(id), HttpStatus.OK);
	}
}
