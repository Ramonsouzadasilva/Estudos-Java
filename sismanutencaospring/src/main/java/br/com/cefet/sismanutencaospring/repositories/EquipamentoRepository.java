package br.com.cefet.sismanutencaospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cefet.sismanutencaospring.entities.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

}
