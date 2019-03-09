package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Combo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pedido
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-09T15:05:13.892Z[GMT]")
public class Pedido extends ResourceSupport {
  @JsonProperty("idPedido")
  private String idPedido = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("usuario")
  private String usuario = null;

  @JsonProperty("combos")
  @Valid
  private List<Combo> combos = null;

  public Pedido idPedido(String idPedido) {
    this.idPedido = idPedido;
    return this;
  }

  /**
   * Get idPedido
   * @return idPedido
  **/
  @ApiModelProperty(example = "p100", required = true, value = "")
  @NotNull

  public String getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(String idPedido) {
    this.idPedido = idPedido;
  }

  public Pedido nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "Pedido especial", required = true, value = "")
  @NotNull

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Pedido usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

  /**
   * Get usuario
   * @return usuario
  **/
  @ApiModelProperty(example = "user1", required = true, value = "")
  @NotNull

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public Pedido combos(List<Combo> combos) {
    this.combos = combos;
    return this;
  }

  public Pedido addCombosItem(Combo combosItem) {
    if (this.combos == null) {
      this.combos = new ArrayList<Combo>();
    }
    this.combos.add(combosItem);
    return this;
  }

  /**
   * Get combos
   * @return combos
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Combo> getCombos() {
    return combos;
  }

  public void setCombos(List<Combo> combos) {
    this.combos = combos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pedido pedido = (Pedido) o;
    return Objects.equals(this.idPedido, pedido.idPedido) &&
        Objects.equals(this.nombre, pedido.nombre) &&
        Objects.equals(this.usuario, pedido.usuario) &&
        Objects.equals(this.combos, pedido.combos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPedido, nombre, usuario, combos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pedido {\n");
    
    sb.append("    idPedido: ").append(toIndentedString(idPedido)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    combos: ").append(toIndentedString(combos)).append("\n");
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
