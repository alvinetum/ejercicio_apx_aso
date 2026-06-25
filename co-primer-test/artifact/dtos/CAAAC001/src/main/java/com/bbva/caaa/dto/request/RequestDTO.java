package com.bbva.caaa.dto.request;

import java.io.Serializable;
import com.bbva.caaa.dto.ErrorDTO;
import com.bbva.caaa.dto.ServiceDownDTO;
import lombok.Data;


/**
 * The RequestDTO class...
 */
@Data
public class RequestDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;
    private String numeroCuenta;
}
