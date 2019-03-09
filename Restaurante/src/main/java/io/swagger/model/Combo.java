package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Combo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-09T15:05:13.892Z[GMT]")
public class Combo extends ResourceSupport {
  @JsonProperty("idCombo")
  private String idCombo = null;

  @JsonProperty("platoPpal")
  private String platoPpal = null;

  @JsonProperty("postre")
  private String postre = null;

  public Combo idCombo(String idCombo) {
    this.idCombo = idCombo;
    return this;
  }

  /**
   * Get idCombo
   * @return idCombo
  **/
  @ApiModelProperty(example = "c100", required = true, value = "")
  @NotNull

  public String getIdCombo() {
    return idCombo;
  }

  public void setIdCombo(String idCombo) {
    this.idCombo = idCombo;
  }

  public Combo platoPpal(String platoPpal) {
    this.platoPpal = platoPpal;
    return this;
  }

  /**
   * Get platoPpal
   * @return platoPpal
  **/
  @ApiModelProperty(example = "tamal", required = true, value = "")
  @NotNull

  public String getPlatoPpal() {
    return platoPpal;
  }

  public void setPlatoPpal(String platoPpal) {
    this.platoPpal = platoPpal;
  }

  public Combo postre(String postre) {
    this.postre = postre;
    return this;
  }

  /**
   * Get postre
   * @return postre
  **/
  @ApiModelProperty(example = "volcan chocolate", value = "")

  public String getPostre() {
    return postre;
  }

  public void setPostre(String postre) {
    this.postre = postre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Combo combo = (Combo) o;
    return Objects.equals(this.idCombo, combo.idCombo) &&
        Objects.equals(this.platoPpal, combo.platoPpal) &&
        Objects.equals(this.postre, combo.postre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCombo, platoPpal, postre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Combo {\n");
    
    sb.append("    idCombo: ").append(toIndentedString(idCombo)).append("\n");
    sb.append("    platoPpal: ").append(toIndentedString(platoPpal)).append("\n");
    sb.append("    postre: ").append(toIndentedString(postre)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
