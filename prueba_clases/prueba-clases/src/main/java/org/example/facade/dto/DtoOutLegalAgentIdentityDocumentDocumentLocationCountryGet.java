package org.example.facade.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(
    name = "dtoOutLegalAgentIdentityDocumentDocumentLocationCountryGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlType(
    name = "dtoOutLegalAgentIdentityDocumentDocumentLocationCountryGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(
    fieldVisibility = Visibility.ANY,
    getterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE)
public class DtoOutLegalAgentIdentityDocumentDocumentLocationCountryGet implements Serializable {

  public static final long serialVersionUID = 3494657822942000000L;

  @NotNull
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @Valid
  @JsonProperty("department")
  private DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentGet department;

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

  public DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentGet getDepartment() {
    return this.department;
  }

  public void setDepartment(
      DtoOutLegalAgentIdentityDocumentDocumentLocationCountryDepartmentGet department) {
    this.department = department;
  }
}
