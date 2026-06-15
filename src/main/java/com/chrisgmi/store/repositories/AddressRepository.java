package com.chrisgmi.store.repositories;

import com.chrisgmi.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}