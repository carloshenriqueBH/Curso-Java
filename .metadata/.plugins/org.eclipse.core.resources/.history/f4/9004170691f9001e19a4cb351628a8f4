package com.programacaoweb.portfolio.services;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacaoweb.portfolio.entities.User;
import com.programacaoweb.portfolio.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	/*
	 * localizar todos os registros no BD:
	 */
	public List<User> findAll() {
		return repository.findAll();
	}
	/*
	 * Localizar qualquer registro pela sua PK:
	 */
	
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	/*
	 * Inserir registro:
	 */
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}
