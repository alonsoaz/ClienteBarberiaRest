package com.barberia.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"marca"
})
public class InsertarMarca implements Serializable
{

@JsonProperty("marca")
private String marca;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -466828180091301716L;

/**
* No args constructor for use in serialization
* 
*/
public InsertarMarca() {
}

/**
* 
* @param marca
*/
public InsertarMarca(String marca) {
super();
this.marca = marca;
}

@JsonProperty("marca")
public String getMarca() {
return marca;
}

@JsonProperty("marca")
public void setMarca(String marca) {
this.marca = marca;
}

public InsertarMarca withMarca(String marca) {
this.marca = marca;
return this;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public InsertarMarca withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}