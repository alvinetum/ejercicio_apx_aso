package org.example.common;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement(
    name = "dtoInBusinessIdTypeEnum",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:common:v1:dto")
@XmlType(
    name = "dtoInBusinessIdTypeEnum",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:common:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public enum DtoInBusinessIdTypeEnum {
  @JsonProperty("NIT")
  NIT("NIT"),
  @JsonProperty("PNN")
  PNN("PNN");

  private String code;

  private DtoInBusinessIdTypeEnum(final String code) {
    this.code = code;
  }

  public static DtoInBusinessIdTypeEnum getDtoInBusinessIdTypeEnum(final String code) {
    for (DtoInBusinessIdTypeEnum item : DtoInBusinessIdTypeEnum.values()) {
      if (item.getCode().equals(code)) return item;
    }
    return null;
  }

  public String getCode() {
    return this.code;
  }
}
