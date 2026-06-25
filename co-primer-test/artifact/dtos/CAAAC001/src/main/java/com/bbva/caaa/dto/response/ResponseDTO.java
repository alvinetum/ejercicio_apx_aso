package com.bbva.caaa.dto.response;

import com.bbva.caaa.dto.ErrorDTO;
import com.bbva.caaa.dto.ServiceDownDTO;
import lombok.Data;

@Data
public class ResponseDTO {
    private static final long serialVersionUID = 2931699728946643245L;
    private String nombreTitular;
    private Double saldo;
    private String numeroCuenta;
    private String httpCode;
    private ErrorDTO error;

}
