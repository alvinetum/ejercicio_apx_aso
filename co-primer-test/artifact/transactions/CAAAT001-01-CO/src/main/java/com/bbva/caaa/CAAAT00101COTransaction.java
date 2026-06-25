package com.bbva.caaa;

import com.bbva.caaa.dto.request.RequestDTO;
import com.bbva.caaa.dto.response.ResponseDTO;
import com.bbva.caaa.lib.r001.CAAAR001;
import com.bbva.elara.domain.transaction.Severity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * trx de primera prueba
 *
 */
public class CAAAT00101COTransaction extends AbstractCAAAT00101COTransaction {

    private static final String LOGGER_ID = ">>>> <LOG-FIRMA>";
	private static final Logger LOGGER = LoggerFactory.getLogger(CAAAT00101COTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
        LOGGER.info(LOGGER_ID + " Iniciando Transacción de Consulta de Saldo <<<<");

        CAAAR001 caaaR001 = this.getServiceLibrary(CAAAR001.class);

        RequestDTO requestDTO = this.getRequest();
        String numeroCuenta = (requestDTO != null) ? requestDTO.getNumeroCuenta() : null;

        ResponseDTO response = caaaR001.executeGetBalance(numeroCuenta);

        if (response != null) {
            if (getAdviceList().isEmpty()) {
                LOGGER.info(LOGGER_ID + " Result execute successful caaaR001Transaction <<<<");
                this.setResponse(response);
            } else {
                LOGGER.warn(LOGGER_ID + " Result execute fail caaaR001Transaction (AdviceList con errores) <<<<");
                this.setSeverity(Severity.ENR);
            }
        } else {
            LOGGER.error(LOGGER_ID + " Result execute fail null caaaR001Transaction <<<<");
            this.setSeverity(Severity.ENR);
        }
    }

}
