package br.com.cefet.sismanutencaospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cefet.sismanutencaospring.entities.Setor;
import br.com.cefet.sismanutencaospring.repositories.SetorRepository;

@RestController
@RequestMapping(value = "/setores")
public class SetorController {
	@Autowired
	private SetorRepository repository;

	@GetMapping
	public List<Setor> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Setor findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Setor insert(@RequestBody Setor setor) {
		return repository.save(setor);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Setor setor) {
		repository.save(setor);
	}
}
