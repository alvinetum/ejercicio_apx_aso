package org.example.facade.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(
    name = "dtoOutLegalAgentIdentityDocumentDocumentLocationGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlType(
    name = "dtoOutLegalAgentIdentityDocumentDocumentLocationGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(
    fieldVisibility = Visibility.ANY,
    getterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE)
public class DtoOutLegalAgentIdentityDocumentDocumentLocationGet implements Serializable {

  public static final long serialVersionUID = 3494657822944000000L;

  @Valid
  @NotNull
  @JsonProperty("country")
  private DtoOutLegalAgentIdentityDocumentDocumentLocationCountryGet country;

  public DtoOutLegalAgentIdentityDocumentDocumentLocationCountryGet getCountry() {
    return this.country;
  }

  public void setCountry(DtoOutLegalAgentIdentityDocumentDocumentLocationCountryGet country) {
    this.country = country;
  }
}
