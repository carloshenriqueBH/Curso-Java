package com.programacaoweb.portfolio.services;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.programacaoweb.portfolio.entities.User;
import com.programacaoweb.portfolio.repositories.UserRepository;
import com.programacaoweb.portfolio.services.exceptions.DatabaseException;
import com.programacaoweb.portfolio.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	/*
	 * Inserir registro:
	 */
	public User insert(User obj) {
		return repository.save(obj);
	}

	/*
	 * Excluir registro:
	 */
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			// e.printStackTrace();
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	/*
	 * Alteração de registro:
	 *
	 */
	public User update(Long id, User obj) {
		try {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
//			e.printStackTrace();
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
