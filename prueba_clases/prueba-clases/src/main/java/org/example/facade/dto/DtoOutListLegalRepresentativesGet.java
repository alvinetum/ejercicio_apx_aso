package org.example.facade.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(
    name = "dtoOutListLegalRepresentativesGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlType(
    name = "dtoOutListLegalRepresentativesGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(
    fieldVisibility = Visibility.ANY,
    getterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE)
public class DtoOutListLegalRepresentativesGet implements Serializable {

  public static final long serialVersionUID = 3494657822946000000L;

  @Valid
  @NotNull
  @JsonProperty("legalAgent")
  private List<DtoOutLegalAgentGet> legalAgent;

  public List<DtoOutLegalAgentGet> getLegalAgent() {
    return this.legalAgent;
  }

  public void setLegalAgent(List<DtoOutLegalAgentGet> legalAgent) {
    this.legalAgent = legalAgent;
  }
}
