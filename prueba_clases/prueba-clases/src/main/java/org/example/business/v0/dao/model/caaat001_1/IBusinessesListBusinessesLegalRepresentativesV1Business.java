package org.example.business.v0.dao.model.caaat001_1;

import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.dto.BDtoOutListLegalRepresentativesGet;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.common.v1.dto.DtoInBusinessIdTypeEnum;
import org.example.dto.ConsultaSaldo;

public interface IBusinessesListBusinessesLegalRepresentativesV1Business {
  ConsultaSaldo businessesListBusinessesLegalRepresentativesV1(
      String consultaSaldo);
}
