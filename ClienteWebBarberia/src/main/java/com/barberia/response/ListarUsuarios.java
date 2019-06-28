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
"aidUsuario",
"bCod",
"cnombre",
"dargo",
"eaka",
"fmail",
"gcelular",
"hDescripcion"
})
public class ListarUsuarios implements Serializable
{

@JsonProperty("aidUsuario")
private String aidUsuario;
@JsonProperty("bCod")
private String bCod;
@JsonProperty("cnombre")
private String cnombre;
@JsonProperty("dargo")
private String dargo;
@JsonProperty("eaka")
private String eaka;
@JsonProperty("fmail")
private String fmail;
@JsonProperty("gcelular")
private String gcelular;
@JsonProperty("hDescripcion")
private String hDescripcion;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 29678575022783163L;

/**
* No args constructor for use in serialization
* 
*/
public ListarUsuarios() {
}

/**
* 
* @param gcelular
* @param hDescripcion
* @param bCod
* @param aidUsuario
* @param eaka
* @param dargo
* @param fmail
* @param cnombre
*/
public ListarUsuarios(String aidUsuario, String bCod, String cnombre, String dargo, String eaka, String fmail, String gcelular, String hDescripcion) {
super();
this.aidUsuario = aidUsuario;
this.bCod = bCod;
this.cnombre = cnombre;
this.dargo = dargo;
this.eaka = eaka;
this.fmail = fmail;
this.gcelular = gcelular;
this.hDescripcion = hDescripcion;
}

@JsonProperty("aidUsuario")
public String getAidUsuario() {
return aidUsuario;
}

@JsonProperty("aidUsuario")
public void setAidUsuario(String aidUsuario) {
this.aidUsuario = aidUsuario;
}

public ListarUsuarios withAidUsuario(String aidUsuario) {
this.aidUsuario = aidUsuario;
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

public ListarUsuarios withBCod(String bCod) {
this.bCod = bCod;
return this;
}

@JsonProperty("cnombre")
public String getCnombre() {
return cnombre;
}

@JsonProperty("cnombre")
public void setCnombre(String cnombre) {
this.cnombre = cnombre;
}

public ListarUsuarios withCnombre(String cnombre) {
this.cnombre = cnombre;
return this;
}

@JsonProperty("dargo")
public String getDargo() {
return dargo;
}

@JsonProperty("dargo")
public void setDargo(String dargo) {
this.dargo = dargo;
}

public ListarUsuarios withDargo(String dargo) {
this.dargo = dargo;
return this;
}

@JsonProperty("eaka")
public String getEaka() {
return eaka;
}

@JsonProperty("eaka")
public void setEaka(String eaka) {
this.eaka = eaka;
}

public ListarUsuarios withEaka(String eaka) {
this.eaka = eaka;
return this;
}

@JsonProperty("fmail")
public String getFmail() {
return fmail;
}

@JsonProperty("fmail")
public void setFmail(String fmail) {
this.fmail = fmail;
}

public ListarUsuarios withFmail(String fmail) {
this.fmail = fmail;
return this;
}

@JsonProperty("gcelular")
public String getGcelular() {
return gcelular;
}

@JsonProperty("gcelular")
public void setGcelular(String gcelular) {
this.gcelular = gcelular;
}

public ListarUsuarios withGcelular(String gcelular) {
this.gcelular = gcelular;
return this;
}

@JsonProperty("hDescripcion")
public String getHDescripcion() {
return hDescripcion;
}

@JsonProperty("hDescripcion")
public void setHDescripcion(String hDescripcion) {
this.hDescripcion = hDescripcion;
}

public ListarUsuarios withHDescripcion(String hDescripcion) {
this.hDescripcion = hDescripcion;
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

public ListarUsuarios withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}