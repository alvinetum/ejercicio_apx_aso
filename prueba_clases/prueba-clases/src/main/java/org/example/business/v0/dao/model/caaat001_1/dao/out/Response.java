package org.example.business.v0.dao.model.caaat001_1.dao.out;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>response</code>, utilizado por la clase <code>ResponseTransactionCaaat001_1</code></p>
 * 
 * @see ResponseTransactionCaaat001_1
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
public class Response {
	
	/**
	 * <p>Campo <code>nombreTitular</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "nombreTitular", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 30, signo = true)
	private String nombreTitular;
	
	/**
	 * <p>Campo <code>saldo</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "saldo", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 100, signo = true)
	private String saldo;
	
	/**
	 * <p>Campo <code>numeroCuenta</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "numeroCuenta", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 100, signo = true)
	private String numeroCuenta;
	
	/**
	 * <p>Campo <code>httpCode</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "httpCode", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 10, signo = true)
	private String httpCode;
	
	/**
	 * <p>Campo <code>error</code>, &iacute;ndice: <code>5</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 5, nombre = "error", tipo = TipoCampo.DTO)
	private ResponseError error;
	

	public String getNombreTitular() {
	    return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
    	this.nombreTitular = nombreTitular;
	}

	public String getSaldo() {
	    return saldo;
	}

	public void setSaldo(String saldo) {
    	this.saldo = saldo;
	}

	public String getNumeroCuenta() {
	    return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
    	this.numeroCuenta = numeroCuenta;
	}

	public String getHttpCode() {
	    return httpCode;
	}

	public void setHttpCode(String httpCode) {
    	this.httpCode = httpCode;
	}

	public ResponseError getError() {
	    return error;
	}

	public void setError(ResponseError error) {
    	this.error = error;
	}
}