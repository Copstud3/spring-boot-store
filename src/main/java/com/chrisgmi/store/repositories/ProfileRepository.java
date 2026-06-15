package com.chrisgmi.store.repositories;

import com.chrisgmi.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}