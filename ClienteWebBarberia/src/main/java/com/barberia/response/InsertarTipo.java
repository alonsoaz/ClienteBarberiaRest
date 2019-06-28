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
"tipo"
})
public class InsertarTipo implements Serializable
{

@JsonProperty("tipo")
private String tipo;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -8955067935619671625L;

/**
* No args constructor for use in serialization
* 
*/
public InsertarTipo() {
}

/**
* 
* @param tipo
*/
public InsertarTipo(String tipo) {
super();
this.tipo = tipo;
}

@JsonProperty("tipo")
public String getTipo() {
return tipo;
}

@JsonProperty("tipo")
public void setTipo(String tipo) {
this.tipo = tipo;
}

public InsertarTipo withTipo(String tipo) {
this.tipo = tipo;
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

public InsertarTipo withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}