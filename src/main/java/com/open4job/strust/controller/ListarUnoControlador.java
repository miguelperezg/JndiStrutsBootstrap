package com.open4job.strust.controller;

import org.apache.commons.validator.GenericValidator;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMessage;

public class ListarUnoControlador extends ActionForm {

	String texto;
	String nombre;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ActionErrors validate(
			org.apache.struts.action.ActionMapping mapping,
			javax.servlet.http.HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if (GenericValidator.isBlankOrNull(this.texto)) {
			errors.add("operando1",
					new ActionMessage("error.operando.negativo"));
		}

		if (GenericValidator.isBlankOrNull(this.nombre)) {
			errors.add("operando2",
					new ActionMessage("error.operando.negativo"));
		}

		return errors;
	}

}
