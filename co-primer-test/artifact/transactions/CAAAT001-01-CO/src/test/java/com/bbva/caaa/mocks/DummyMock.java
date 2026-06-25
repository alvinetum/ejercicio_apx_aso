package com.bbva.caaa.mocks;


import com.bbva.caaa.dto.ErrorDTO;
import com.bbva.caaa.dto.response.ResponseDTO;

public class DummyMock {

    public ResponseDTO responseDTOSucces(){
        ResponseDTO responseDTO = new ResponseDTO();

        responseDTO.setHttpCode("ok");
        responseDTO.setError(new ErrorDTO());
        responseDTO.getError().setDescription("ok");
        return responseDTO;
    }

}
