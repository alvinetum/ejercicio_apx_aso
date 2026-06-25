package org.example.facade;

import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.common.v1.dto.DtoInBusinessIdTypeEnum;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.facade.v1.dto.DtoOutListLegalRepresentativesGet;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;

import javax.validation.constraints.NotNull;

public interface ISrvBusinessesAPIBusinessesLegalRepresentativesV1 {

  ServiceResponse<DtoOutListLegalRepresentativesGet> businessesListBusinessesLegalRepresentativesV1(
      String legalRepIdNumber,
      String legalRepIdType,
      @NotNull DtoInBusinessIdTypeEnum businessIdType,
      @NotNull String businessIdNumber);
}
