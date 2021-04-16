package com.podutos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.podutos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	/*
	 * O JPA repository já possui vários métodos prontos para persistir os dados no banco de dados, 
	 * isso facilita o desenvolvimento do projeto
	 * Basta criar uma instância dessa interface e utilizaar os métodos disponíveis no nosso model
	 * 
	 */

}
