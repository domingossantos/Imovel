package br.com.domsantos.imovel.exception;

import javax.persistence.PersistenceException;


public class ServiceException extends PersistenceException {

	private static final long serialVersionUID = -515133767490709254L;

	public ServiceException(String msg) {
		super(msg);
	}
}	