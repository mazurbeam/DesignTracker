package com.mazurbeam.designtracker.services;

import org.springframework.stereotype.Service;

import com.mazurbeam.designtracker.models.Address;
import com.mazurbeam.designtracker.repositories.AddressRepository;

@Service
public class AddressService {
	
	private AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	public void saveAddress(Address address) {
		addressRepository.save(address);
	}
}
