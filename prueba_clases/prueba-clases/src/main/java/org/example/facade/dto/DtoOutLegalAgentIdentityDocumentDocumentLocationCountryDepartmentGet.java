package org.example.facade.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(
    name = "dtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlType(
    name = "dtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(
    fieldVisibility = Visibility.ANY,
    getterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE)
public class DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentGet
    implements Serializable {

  public static final long serialVersionUID = 3494657822942000000L;

  @NotNull
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @Valid
  @JsonProperty("city")
  private DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentCityGet city;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentCityGet getCity() {
    return this.city;
  }

  public void setCity(
      DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentCityGet city) {
    this.city = city;
  }
}
