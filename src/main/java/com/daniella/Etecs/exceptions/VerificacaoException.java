package com.daniella.Etecs.exceptions;

public class VerificacaoException extends Exception {
	private static final long serialVersionUID = 1604200226042001L;

    public VerificacaoException(String msg){
        super(msg);
    }

    public VerificacaoException(String msg, Throwable cause){
        super(msg, cause);
    }
}
