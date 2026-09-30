package br.com.uam.exemplo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uam.exemplo3.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
    
}
