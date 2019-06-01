package com.daniella.Etecs.bussiness;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.daniella.Etecs.dao.CadastroDAO;
import com.daniella.Etecs.exceptions.VerificacaoException;
import com.daniella.Etecs.model.Cadastro;

import br.com.etechoracio.common.business.BaseSB;

@Service
public class CadastroSB extends BaseSB {
	
	private CadastroDAO cadastroDAO;

	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Cadastro cadastro) throws Exception {
		Cadastro cad = cadastroDAO.findByNomeOrCodigo(cadastro.getNome(), cadastro.getCodigo());
		if (cad != null) {
			throw new VerificacaoException("Nome e/ou código já registrado(s).");
		} else {
			cadastroDAO.save(cadastro);
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Cadastro cadastro) throws Exception {
		Cadastro cad = cadastroDAO.findByNomeOrCodigo(cadastro.getNome(), cadastro.getCodigo());
		if (cad == cadastro || cad == null) {
			cadastroDAO.save(cadastro);
		} else {
			throw new VerificacaoException("");
		}
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Cadastro> findAll(){
		return cadastroDAO.findAll();
		
	}	
	
	public Cadastro findById(Long id) {
		
		Optional<Cadastro>  cad=  cadastroDAO.findById(id);
		return cad.get();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void remove(Cadastro cadastro) {
		cadastroDAO.delete(cadastro);

	}
}
