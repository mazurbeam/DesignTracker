package com.mazurbeam.designtracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.designtracker.models.Client;
import com.mazurbeam.designtracker.repositories.ClientRepository;

@Service
public class ClientService {
	
	private ClientRepository clientRepository;
	
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public void saveClient(Client client) {
		clientRepository.save(client);
	}
	
	public List<Client> findAllClients(){
		return clientRepository.findAll();
	}
}
