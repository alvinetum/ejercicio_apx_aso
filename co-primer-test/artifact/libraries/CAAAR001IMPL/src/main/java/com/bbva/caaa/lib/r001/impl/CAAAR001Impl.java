package com.bbva.caaa.lib.r001.impl;

import com.bbva.caaa.dto.response.ResponseDTO;
import com.bbva.caaa.lib.r001.impl.utils.Constantes;
import com.bbva.caaa.lib.r001.impl.utils.SaldoMQConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The CAAAR001Impl class...
 */
public class CAAAR001Impl extends CAAAR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CAAAR001Impl.class);
    private final SaldoMQConnector mqConnector = new SaldoMQConnector();

    @Override
    public ResponseDTO executeGetBalance(String numeroCuenta) {
        LOGGER.info("Iniciando executeGetBalance. Delegando comunicación al Conector MQ.");
        ResponseDTO response;

        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) {
            LOGGER.error("Error de validación: El número de cuenta es nulo o vacío.");
            return buildErrorResponse("400", "El número de cuenta es obligatorio.");
        }

        try {
            response = mqConnector.consultarSaldo(numeroCuenta);
            response.setHttpCode("200");

        } catch (Exception e) {
            LOGGER.error("Error técnico de infraestructura en el Conector MQ", e);
            return buildErrorResponse("500", "Error interno al procesar la consulta.");
        }

        return response;
    }

    private ResponseDTO buildErrorResponse(String code, String message) {
        ResponseDTO errorResponse = new ResponseDTO();
        errorResponse.setHttpCode(code);
        errorResponse.setNombreTitular(message);
        //errorResponse.setSaldo(0.0);
        return errorResponse;
    }

}
