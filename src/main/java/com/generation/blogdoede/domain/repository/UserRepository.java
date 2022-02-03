package com.generation.blogdoede.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogdoede.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
		
	public Optional<User> findByUserLoginContainingIgnoreCase (String userLogin);
	
	public Optional<User> findByUserEmail (String userEmail);
}
