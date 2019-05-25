package com.daniella.Etecs.view;



import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.daniella.Etecs.bussiness.CadastroSB;
import com.daniella.Etecs.exceptions.VerificacaoException;
import com.daniella.Etecs.model.Cadastro;

import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Controller
@Scope("view")
public class CadastroMB extends BaseMB {
	
	@Autowired
	private CadastroSB cadastroSB;
	
	private Cadastro edit = new Cadastro();
	
	
	public void onSave() {
			try {
				cadastroSB.save(edit);
				showInsertMessage();
			} catch (Exception e) {
				showErrorMessage(e.getMessage());
			}
  }
	
	
	
	private String message;
	 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
	
}
