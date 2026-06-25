package org.example.facade.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(
    name = "dtoOutLegalAgentGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlType(
    name = "dtoOutLegalAgentGet",
    namespace = "com:bbva:csch:businessesbusinesseslegalrepresentativesv1:facade:v1:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(
    fieldVisibility = Visibility.ANY,
    getterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE)
public class DtoOutLegalAgentGet implements Serializable {

  public static final long serialVersionUID = 3494657822944000000L;

  @NotNull
  @JsonProperty("id")
  private String id;

  @NotNull
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("secondName")
  private String secondName;

  @NotNull
  @JsonProperty("firstLastName")
  private String firstLastName;

  @JsonProperty("secondLastName")
  private String secondLastName;

  @Valid
  @NotNull
  @JsonProperty("identityDocument")
  private DtoOutLegalAgentIdentityDocumentGet identityDocument;

  @NotNull
  @JsonProperty("profileId")
  private String profileId;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return this.secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getFirstLastName() {
    return this.firstLastName;
  }

  public void setFirstLastName(String firstLastName) {
    this.firstLastName = firstLastName;
  }

  public String getSecondLastName() {
    return this.secondLastName;
  }

  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }

  public DtoOutLegalAgentIdentityDocumentGet getIdentityDocument() {
    return this.identityDocument;
  }

  public void setIdentityDocument(DtoOutLegalAgentIdentityDocumentGet identityDocument) {
    this.identityDocument = identityDocument;
  }

  public String getProfileId() {
    return this.profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }
}
