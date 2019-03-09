package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Pedido;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cuenta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-09T15:05:13.892Z[GMT]")
public class Cuenta   {
  @JsonProperty("idCuenta")
  private String idCuenta = null;

  @JsonProperty("valor")
  private BigDecimal valor = null;

  @JsonProperty("idPedido")
  private Pedido idPedido = null;

  public Cuenta idCuenta(String idCuenta) {
    this.idCuenta = idCuenta;
    return this;
  }

  /**
   * Get idCuenta
   * @return idCuenta
  **/
  @ApiModelProperty(example = "cu100", required = true, value = "")
  @NotNull

  public String getIdCuenta() {
    return idCuenta;
  }

  public void setIdCuenta(String idCuenta) {
    this.idCuenta = idCuenta;
  }

  public Cuenta valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(example = "10000", required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public Cuenta idPedido(Pedido idPedido) {
    this.idPedido = idPedido;
    return this;
  }

  /**
   * Get idPedido
   * @return idPedido
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Pedido getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(Pedido idPedido) {
    this.idPedido = idPedido;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cuenta cuenta = (Cuenta) o;
    return Objects.equals(this.idCuenta, cuenta.idCuenta) &&
        Objects.equals(this.valor, cuenta.valor) &&
        Objects.equals(this.idPedido, cuenta.idPedido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCuenta, valor, idPedido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cuenta {\n");
    
    sb.append("    idCuenta: ").append(toIndentedString(idCuenta)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    idPedido: ").append(toIndentedString(idPedido)).append("\n");
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
