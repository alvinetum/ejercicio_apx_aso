package com.bbva.caaa;

import com.bbva.caaa.dto.request.RequestDTO;
import com.bbva.caaa.dto.response.ResponseDTO;
import com.bbva.elara.transaction.AbstractTransaction;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractCAAAT00101COTransaction extends AbstractTransaction {

	protected AbstractCAAAT00101COTransaction(){
	}


    /**
     * Return value for input parameter request
     */
    protected RequestDTO getRequest(){
        return (RequestDTO)this.getParameter("request");
    }

    /**
     * Set value for PaymentResponseDTO output parameter response
     */
    protected void setResponse(final ResponseDTO field){
        this.addParameter("response", field);
    }

    protected String getChannel(){
        return (String)this.getParameter("channel");
    }

}
