package org.example.business.v0.dao.model.caaat001_1.dao.mapper;

import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.dao.model.cscht003_1.RequestTransactionCscht003_1;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.dao.model.cscht003_1.ResponseTransactionCscht003_1;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.dto.BDtoOutListLegalRepresentativesGet;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.common.v1.dto.DtoInBusinessIdTypeEnum;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IBusinessesGetListBusinessesLegalRepresentativesV1Mapper {

    @Mapping(target = "bussinnes.identityDocumentDTO.businessDocumentType.number", source = "legalRepIdNumber")
    @Mapping(target = "bussinnes.identityDocumentDTO.businessDocumentType.id", source = "legalRepIdType")
    @Mapping(target = "bussinnes.businessType", source = "businessIdType")
    @Mapping(target = "bussinnes.businessID", source = "businessIdNumber")
    RequestTransactionCscht003_1 requestTransactionCscht003_1(String legalRepIdNumber, String legalRepIdType, DtoInBusinessIdTypeEnum businessIdType, String businessIdNumber);

    @Mapping(source = "legalAngentList", target = "legalAgent")
    BDtoOutListLegalRepresentativesGet responseTransactionCscht003_1 (ResponseTransactionCscht003_1 responseTransactionCscht003_1);

}
