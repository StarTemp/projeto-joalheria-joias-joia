package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.CupomDesconto;

public interface CupomDescontoRepository extends JpaRepository<CupomDesconto, Long> {

}