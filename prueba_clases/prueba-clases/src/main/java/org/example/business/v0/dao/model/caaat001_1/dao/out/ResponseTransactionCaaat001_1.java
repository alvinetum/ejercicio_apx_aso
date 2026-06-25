package org.example.business.v0.dao.model.caaat001_1.dao.out;

import org.example.business.v0.dao.model.caaat001_1.dao.in.RequestTransactionCaaat001_1;
import com.bbva.jee.arq.spring.core.host.Cabecera;
import com.bbva.jee.arq.spring.core.host.NombreCabecera;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.RespuestaTransaccion;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * Bean de respuesta para la transacci&oacute;n <code>CAAAT001</code>
 * 
 * @see RequestTransactionCaaat001_1
 */
@RespuestaTransaccion
@Formato(nombre = "1")
public class ResponseTransactionCaaat001_1 {
	
	/**
	 * <p>Cabecera <code>COD-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.CODIGO_AVISO)
	private String codigoAviso;
	
	/**
	 * <p>Cabecera <code>DES-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.DESCRIPCION_AVISO)
	private String descripcionAviso;
	
	/**
	 * <p>Cabecera <code>COD-UUAA-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.APLICACION_AVISO)
	private String aplicacionAviso;
	
	/**
	 * <p>Cabecera <code>COD-RETORNO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.CODIGO_RETORNO)
	private String codigoRetorno;
	
	/**
	 * <p>Campo <code>response</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "response", tipo = TipoCampo.DTO)
	private Response response;
	

    public String getCodigoAviso() {
        return codigoAviso;
    }

    public void setCodigoAviso(String codigoAviso) {
        this.codigoAviso = codigoAviso;
    }

    public String getDescripcionAviso() {
        return descripcionAviso;
    }

    public void setDescripcionAviso(String descripcionAviso) {
        this.descripcionAviso = descripcionAviso;
    }

    public String getAplicacionAviso() {
        return aplicacionAviso;
    }

    public void setAplicacionAviso(String aplicacionAviso) {
        this.aplicacionAviso = aplicacionAviso;
    }

    public String getCodigoRetorno(){
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

	public Response getResponse() {
	    return response;
	}

	public void setResponse(Response response) {
    	this.response = response;
	}
}