package com.bbva.caaa.lib.r001.impl.utils;

import com.bbva.caaa.dto.response.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SaldoMQConnector {

    private static final Logger LOGGER = LoggerFactory.getLogger(SaldoMQConnector.class);
    private static final String CUENTA_VALIDA = "001123456";
    Constantes constantes = new Constantes();

    /**
     * Simula la mensajería asíncrona o síncrona con el Mainframe.
     * @param cuenta Número de cuenta enviado por el cliente.
     * @return ResponseDTO con los datos simulados del Host.
     */
    public ResponseDTO consultarSaldo(String cuenta) {
        LOGGER.info(">>> [SaldoMQConnector] Simulando petición enviada a IBM MQ para la cuenta: {}", cuenta);
        ResponseDTO response = new ResponseDTO();

        // Simulación del comportamiento esperado del Host/Mainframe
        if (constantes.CUENTA_VALIDA.equals(cuenta)) {
            LOGGER.info(">>> [SaldoMQConnector] Host devolvió: Cuenta Encontrada");
            response.setNombreTitular("Juan Perez");
            response.setSaldo(1500000.0);
        } else {
            LOGGER.warn(">>> [SaldoMQConnector] Host devolvió: Cuenta No Existe");
            response.setNombreTitular("Cuenta no encontrada");
            response.setSaldo(0.0);
        }

        return response;
    }
}