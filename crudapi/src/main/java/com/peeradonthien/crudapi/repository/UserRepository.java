package com.peeradonthien.crudapi.repository;

import com.peeradonthien.crudapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
