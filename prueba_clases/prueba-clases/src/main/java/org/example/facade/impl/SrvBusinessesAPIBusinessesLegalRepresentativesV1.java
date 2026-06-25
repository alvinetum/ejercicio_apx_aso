package org.example.facade.impl;

import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.IBusinessesListBusinessesLegalRepresentativesV1Business;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.dto.BDtoOutListLegalRepresentativesGet;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.common.v1.dto.DtoInBusinessIdTypeEnum;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.facade.v1.ISrvBusinessesAPIBusinessesLegalRepresentativesV1;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.facade.v1.dto.DtoOutListLegalRepresentativesGet;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.facade.v1.mapper.ListLegalRepresentativesGetMapper;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse.ServiceResponseBuilder;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseOK;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Service
@SN(registryID = "SNGG20220082", logicalID = "businesses")
@VN(vnn = "v1")
@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SrvBusinessesAPIBusinessesLegalRepresentativesV1
    implements ISrvBusinessesAPIBusinessesLegalRepresentativesV1 {
  private final IBusinessesListBusinessesLegalRepresentativesV1Business
      businessesListBusinessesLegalRepresentativesV1;

  public SrvBusinessesAPIBusinessesLegalRepresentativesV1(
      IBusinessesListBusinessesLegalRepresentativesV1Business
          businessesListBusinessesLegalRepresentativesV1) {
    this.businessesListBusinessesLegalRepresentativesV1 =
        businessesListBusinessesLegalRepresentativesV1;
  }

  @Override
  @GET
  @Path("/businesses/legal-representatives")
  @SMC(
      registryID = "SMGG20251477",
      logicalID = "businessesListBusinessesLegalRepresentativesV1",
      forcedCatalog = "gabiCatalog") // 1.12.1
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public ServiceResponse<DtoOutListLegalRepresentativesGet>
      businessesListBusinessesLegalRepresentativesV1(
          @QueryParam("legalRepIdNumber") String legalRepIdNumber,
          @QueryParam("legalRepIdType") String legalRepIdType,
          @QueryParam("businessIdType") @NotNull DtoInBusinessIdTypeEnum businessIdType,
          @QueryParam("businessIdNumber") @NotNull String businessIdNumber) {

    final BDtoOutListLegalRepresentativesGet internalResponse =
        businessesListBusinessesLegalRepresentativesV1
            .businessesListBusinessesLegalRepresentativesV1(
                legalRepIdNumber, legalRepIdType, businessIdType, businessIdNumber);

    ListLegalRepresentativesGetMapper mapper =
        Mappers.getMapper(ListLegalRepresentativesGetMapper.class);
    DtoOutListLegalRepresentativesGet response =
        mapper.bDtoOutListLegalRepresentativesGetToDtoOutListLegalRepresentativesGet(
            internalResponse);
    ServiceResponseBuilder<DtoOutListLegalRepresentativesGet> builder =
        ServiceResponseOK.data(response);
    return builder.build();
  }
}
