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
"cmarca",
"didEstado"
})
public class RecuperarMarca implements Serializable
{

@JsonProperty("cmarca")
private String cmarca;
@JsonProperty("didEstado")
private int didEstado;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -8397439819272739943L;

/**
* No args constructor for use in serialization
* 
*/
public RecuperarMarca() {
}

/**
* 
* @param cmarca
* @param didEstado
*/
public RecuperarMarca(String cmarca, int didEstado) {
super();
this.cmarca = cmarca;
this.didEstado = didEstado;
}

@JsonProperty("cmarca")
public String getCmarca() {
return cmarca;
}

@JsonProperty("cmarca")
public void setCmarca(String cmarca) {
this.cmarca = cmarca;
}

public RecuperarMarca withCmarca(String cmarca) {
this.cmarca = cmarca;
return this;
}

@JsonProperty("didEstado")
public int getDidEstado() {
return didEstado;
}

@JsonProperty("didEstado")
public void setDidEstado(int didEstado) {
this.didEstado = didEstado;
}

public RecuperarMarca withDidEstado(int didEstado) {
this.didEstado = didEstado;
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

public RecuperarMarca withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}