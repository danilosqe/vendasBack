package com.vendas.interfaceService;

import java.util.List;

import com.vendas.domain.Produto;

@FunctionalInterface
public interface IProdutoService {
	
	/**
	 * @param categoria
	 * @return
	 */
	public List<Produto> listarProdutoCategoria(String categoria);
}
