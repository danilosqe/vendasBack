package com.vendas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendas.domain.Produto;
import com.vendas.interfaceService.IProdutoService;
import com.vendas.repository.IProdutoRepository;

@Service
public class ProdutoService implements IProdutoService {

	@Autowired
	private IProdutoRepository repository;
	
	@Override
	public List<Produto> listarProdutoCategoria(String categoria) {
		
		List<Produto> retorno = new ArrayList<Produto>();

		try {
			if(!categoria.isEmpty()) {
				retorno = repository.findByCategoria(categoria);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}

}
