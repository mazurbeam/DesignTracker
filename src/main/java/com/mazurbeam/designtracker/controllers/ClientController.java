package com.mazurbeam.designtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.designtracker.models.Client;
import com.mazurbeam.designtracker.services.ClientService;

@Controller
@RequestMapping("/clients")
public class ClientController {
	
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	
	@RequestMapping("/")
	public String clientDashboard(@ModelAttribute("client") Client client, Model model) {
		model.addAttribute("clients", clientService.findAllClients());
		return "clients.jsp";
	}
	
	
	@PostMapping("/newclient")
	public String newClient(@ModelAttribute("client") Client client, BindingResult result) {
		if (result.hasErrors()) {
			return "clients.jsp";
		}
		clientService.saveClient(client);
		return "redirect:/clients/";
	}
}
