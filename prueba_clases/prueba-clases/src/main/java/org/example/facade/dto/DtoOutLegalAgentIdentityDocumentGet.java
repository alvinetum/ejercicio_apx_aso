package org.example.facade.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(
    name = "dtoOutLegalAgentIdentityDocumentGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlType(
    name = "dtoOutLegalAgentIdentityDocumentGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(
    fieldVisibility = Visibility.ANY,
    getterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE)
public class DtoOutLegalAgentIdentityDocumentGet implements Serializable {

  public static final long serialVersionUID = 3494657822944000000L;

  @NotNull
  @JsonProperty("documentNumber")
  private String documentNumber;

  @NotNull
  @JsonProperty("documentType")
  private String documentType;

  @Valid
  @NotNull
  @JsonProperty("documentLocation")
  private DtoOutLegalAgentIdentityDocumentDocumentLocationGet documentLocation;

  public String getDocumentNumber() {
    return this.documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public DtoOutLegalAgentIdentityDocumentDocumentLocationGet getDocumentLocation() {
    return this.documentLocation;
  }

  public void setDocumentLocation(
      DtoOutLegalAgentIdentityDocumentDocumentLocationGet documentLocation) {
    this.documentLocation = documentLocation;
  }
}
