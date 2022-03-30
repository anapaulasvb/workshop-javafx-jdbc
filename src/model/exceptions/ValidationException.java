package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	// Para ter um erro para cada campo. O primeiro String vai indicar o nome do campo e o segundo vai indicar a mensagem de erro 
	private Map<String, String> errors = new HashMap<>();
	
	// Exceção para validar o formulário
	public ValidationException(String msg) {
		super(msg);		
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}

}
