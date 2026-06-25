package org.example.business.v0.dao.model.caaat001_1.dao.in;

import org.example.business.v0.dao.model.caaat001_1.dao.out.ResponseTransactionCaaat001_1;

import com.bbva.jee.arq.spring.core.host.Atributo;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Transaccion;

/**
 * <p>Transacci&oacute;n <code>CAAAT001</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> RequestTransactionCaaat001_1</li>
 *    <li><b>Clase de respuesta:</b> ResponseTransactionCaaat001_1</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_apx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: CAAAT001-01-CO.xml
 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;yes&quot;?&gt;
 * &lt;transaction xmlns=&quot;http://www.w3schools.com&quot; transactionName=&quot;CAAAT001&quot; application=&quot;CAAA&quot; version=&quot;01&quot; country=&quot;CO&quot; language=&quot;ES&quot;&gt;
 * &lt;paramsIn&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;request&quot; mandatory=&quot;1&quot; package=&quot;com.bbva.caaa.dto.request.RequestDTO&quot; artifactId=&quot;CAAAC001&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;numeroCuenta&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;/paramsIn&gt;
 * &lt;paramsOut&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;response&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.caaa.dto.response.ResponseDTO&quot; artifactId=&quot;CAAAC001&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;nombreTitular&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;30&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;saldo&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;100&quot;/&gt;
 * &lt;parameter order=&quot;3&quot; name=&quot;numeroCuenta&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;100&quot;/&gt;
 * &lt;parameter order=&quot;4&quot; name=&quot;httpCode&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;10&quot;/&gt;
 * 
 * &lt;dto order=&quot;5&quot; name=&quot;error&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.caaa.dto.ErrorDTO&quot; artifactId=&quot;CAAAC001&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;description&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;200&quot;/&gt;
 * &lt;/dto&gt;
 * 
 * &lt;/dto&gt;
 * 
 * 
 * &lt;/paramsOut&gt;
 * &lt;description&gt;Transacción de consulta de cliente CAAAT001 - Datos de identidad y perfil&lt;/description&gt;
 * &lt;/transaction&gt;
</pre></code>
 * 
 * @see ResponseTransactionCaaat001_1
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "CAAAT001",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_apx",
	respuesta = ResponseTransactionCaaat001_1.class,
	atributos = {@Atributo(nombre = "country", valor = "CO")}
)
public class RequestTransactionCaaat001_1 {
		
		/**
	 * <p>Campo <code>request</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "request", tipo = TipoCampo.DTO)
	private Request request;
	

	public Request getRequest() {
	    return request;
	}

	public void setRequest(Request request) {
    	this.request = request;
	}
}