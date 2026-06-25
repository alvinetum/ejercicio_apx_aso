package org.example.business.v0.dao.model.caaat001_1.dao.out;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>error</code>, utilizado por la clase <code>Response</code></p>
 * 
 * @see Response
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class ResponseError {
	
	/**
	 * <p>Campo <code>description</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "description", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 200, signo = true)
	private String description;
	

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
    	this.description = description;
	}
}