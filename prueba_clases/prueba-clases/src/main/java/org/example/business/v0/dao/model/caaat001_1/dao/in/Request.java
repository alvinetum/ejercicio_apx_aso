package org.example.business.v0.dao.model.caaat001_1.dao.in;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>request</code>, utilizado por la clase <code>RequestTransactionCaaat001_1</code></p>
 * 
 * @see RequestTransactionCaaat001_1
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Request {
	
	/**
	 * <p>Campo <code>numeroCuenta</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "numeroCuenta", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true, obligatorio = true)
	private String numeroCuenta;
	

	public String getNumeroCuenta() {
	    return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
    	this.numeroCuenta = numeroCuenta;
	}
}