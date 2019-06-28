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
"aidTipoProducto",
"ctipo",
"dEstado"
})
public class ListarTipo implements Serializable
{

@JsonProperty("aidTipoProducto")
private int aidTipoProducto;
@JsonProperty("ctipo")
private String ctipo;
@JsonProperty("dEstado")
private String dEstado;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 1693579867038874527L;

/**
* No args constructor for use in serialization
* 
*/
public ListarTipo() {
}

/**
* 
* @param ctipo
* @param aidTipoProducto
* @param dEstado
*/
public ListarTipo(int aidTipoProducto, String ctipo, String dEstado) {
super();
this.aidTipoProducto = aidTipoProducto;
this.ctipo = ctipo;
this.dEstado = dEstado;
}

@JsonProperty("aidTipoProducto")
public int getAidTipoProducto() {
return aidTipoProducto;
}

@JsonProperty("aidTipoProducto")
public void setAidTipoProducto(int aidTipoProducto) {
this.aidTipoProducto = aidTipoProducto;
}

public ListarTipo withAidTipoProducto(int aidTipoProducto) {
this.aidTipoProducto = aidTipoProducto;
return this;
}

@JsonProperty("ctipo")
public String getCtipo() {
return ctipo;
}

@JsonProperty("ctipo")
public void setCtipo(String ctipo) {
this.ctipo = ctipo;
}

public ListarTipo withCtipo(String ctipo) {
this.ctipo = ctipo;
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

public ListarTipo withDEstado(String dEstado) {
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

public ListarTipo withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}