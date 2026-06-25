package org.example.facade.mapper;

import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.business.v1.dto.BDtoOutListLegalRepresentativesGet;
import com.bbva.csch.businessesbusinesseslegalrepresentativesv1.facade.v1.dto.DtoOutListLegalRepresentativesGet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ListLegalRepresentativesGetMapper {

  BDtoOutListLegalRepresentativesGet
      dtoOutListLegalRepresentativesGetToBDtoOutListLegalRepresentativesGet(
          DtoOutListLegalRepresentativesGet dtoOutListLegalRepresentativesGet);

  DtoOutListLegalRepresentativesGet
      bDtoOutListLegalRepresentativesGetToDtoOutListLegalRepresentativesGet(
          BDtoOutListLegalRepresentativesGet bDtoOutListLegalRepresentativesGet);

  List<BDtoOutListLegalRepresentativesGet>
      dtoOutListListLegalRepresentativesGetToBDtoOutListListLegalRepresentativesGet(
          List<DtoOutListLegalRepresentativesGet> dtoOutListListLegalRepresentativesGet);

  List<DtoOutListLegalRepresentativesGet>
      bDtoOutListListLegalRepresentativesGetToDtoOutListListLegalRepresentativesGet(
          List<BDtoOutListLegalRepresentativesGet> bDtoOutListListLegalRepresentativesGet);
}
