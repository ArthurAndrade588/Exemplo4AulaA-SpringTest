package br.com.uam.exemplo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uam.exemplo3.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
