package com.vendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vendas.domain.Produto;

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findByCategoria(String categoria);
}
