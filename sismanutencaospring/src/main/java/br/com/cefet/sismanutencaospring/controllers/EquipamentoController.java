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

import br.com.cefet.sismanutencaospring.entities.Equipamento;
import br.com.cefet.sismanutencaospring.repositories.EquipamentoRepository;

@RestController
@RequestMapping(value = "/equipamentos")
public class EquipamentoController {
	@Autowired
	private EquipamentoRepository repository;

	@GetMapping
	public List<Equipamento> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Equipamento findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Equipamento insert(@RequestBody Equipamento equipamento) {
		return repository.save(equipamento);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Equipamento equipamento) {
		repository.save(equipamento);
	}
}
