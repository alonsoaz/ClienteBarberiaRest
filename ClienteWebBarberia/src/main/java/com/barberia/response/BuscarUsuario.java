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
"hDescripcion",
"idUnico"
})
public class BuscarUsuario implements Serializable
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
@JsonProperty("idUnico")
private int idUnico;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -3097959731843879675L;

/**
* No args constructor for use in serialization
* 
*/
public BuscarUsuario() {
}

/**
* 
* @param gcelular
* @param hDescripcion
* @param bCod
* @param aidUsuario
* @param eaka
* @param dargo
* @param idUnico
* @param fmail
* @param cnombre
*/
public BuscarUsuario(String aidUsuario, String bCod, String cnombre, String dargo, String eaka, String fmail, String gcelular, String hDescripcion, int idUnico) {
super();
this.aidUsuario = aidUsuario;
this.bCod = bCod;
this.cnombre = cnombre;
this.dargo = dargo;
this.eaka = eaka;
this.fmail = fmail;
this.gcelular = gcelular;
this.hDescripcion = hDescripcion;
this.idUnico = idUnico;
}

@JsonProperty("aidUsuario")
public String getAidUsuario() {
return aidUsuario;
}

@JsonProperty("aidUsuario")
public void setAidUsuario(String aidUsuario) {
this.aidUsuario = aidUsuario;
}

public BuscarUsuario withAidUsuario(String aidUsuario) {
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

public BuscarUsuario withBCod(String bCod) {
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

public BuscarUsuario withCnombre(String cnombre) {
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

public BuscarUsuario withDargo(String dargo) {
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

public BuscarUsuario withEaka(String eaka) {
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

public BuscarUsuario withFmail(String fmail) {
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

public BuscarUsuario withGcelular(String gcelular) {
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

public BuscarUsuario withHDescripcion(String hDescripcion) {
this.hDescripcion = hDescripcion;
return this;
}

@JsonProperty("idUnico")
public int getIdUnico() {
return idUnico;
}

@JsonProperty("idUnico")
public void setIdUnico(int idUnico) {
this.idUnico = idUnico;
}

public BuscarUsuario withIdUnico(int idUnico) {
this.idUnico = idUnico;
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

public BuscarUsuario withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}