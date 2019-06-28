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
"aIdMarca",
"bCod",
"cMarca",
"dEstado"
})
public class ListarMarca implements Serializable
{

@JsonProperty("aIdMarca")
private int aIdMarca;
@JsonProperty("bCod")
private String bCod;
@JsonProperty("cMarca")
private String cMarca;
@JsonProperty("dEstado")
private String dEstado;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -9020044319785283763L;

/**
* No args constructor for use in serialization
* 
*/
public ListarMarca() {
}

/**
* 
* @param aIdMarca
* @param bCod
* @param cMarca
* @param dEstado
*/
public ListarMarca(int aIdMarca, String bCod, String cMarca, String dEstado) {
super();
this.aIdMarca = aIdMarca;
this.bCod = bCod;
this.cMarca = cMarca;
this.dEstado = dEstado;
}

@JsonProperty("aIdMarca")
public int getAIdMarca() {
return aIdMarca;
}

@JsonProperty("aIdMarca")
public void setAIdMarca(int aIdMarca) {
this.aIdMarca = aIdMarca;
}

public ListarMarca withAIdMarca(int aIdMarca) {
this.aIdMarca = aIdMarca;
return this;
}

@JsonProperty("bCod")
public String getBCod() {
return bCod;
}

@JsonProperty("bCod")
public void setBCod(String bCod) {
this.bCod = bCod;
}

public ListarMarca withBCod(String bCod) {
this.bCod = bCod;
return this;
}

@JsonProperty("cMarca")
public String getCMarca() {
return cMarca;
}

@JsonProperty("cMarca")
public void setCMarca(String cMarca) {
this.cMarca = cMarca;
}

public ListarMarca withCMarca(String cMarca) {
this.cMarca = cMarca;
return this;
}

@JsonProperty("dEstado")
public String getDEstado() {
return dEstado;
}

@JsonProperty("dEstado")
public void setDEstado(String dEstado) {
this.dEstado = dEstado;
}

public ListarMarca withDEstado(String dEstado) {
this.dEstado = dEstado;
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

public ListarMarca withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}