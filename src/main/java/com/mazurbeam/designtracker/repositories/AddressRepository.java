package com.mazurbeam.designtracker.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.designtracker.models.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long>{

}
