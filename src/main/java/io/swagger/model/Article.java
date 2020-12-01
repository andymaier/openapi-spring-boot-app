package io.swagger.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Article
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-01T13:09:57.424Z[GMT]")


public class Article   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  public Article name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Friedirch ist ein Beispielname
   * @return name
   **/
  @Schema(example = "Friedrich", description = "Friedirch ist ein Beispielname")
  
  @Size(max=20)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Article price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Unsere Standardpreise
   * minimum: 0
   * @return price
   **/
  @Schema(example = "0.99", description = "Unsere Standardpreise")
  
    @Valid
  @DecimalMin("0")  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.name, article.name) &&
        Objects.equals(this.price, article.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
