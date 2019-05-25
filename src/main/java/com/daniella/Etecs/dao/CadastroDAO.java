package com.daniella.Etecs.dao;



import com.daniella.Etecs.model.Cadastro;

import br.com.etechoracio.common.dao.BaseDAO;

public interface CadastroDAO extends BaseDAO<Cadastro>{
		
	public Cadastro findByNomeOrCodigo
			(  String nome,
			 Integer codigo);
	
}
