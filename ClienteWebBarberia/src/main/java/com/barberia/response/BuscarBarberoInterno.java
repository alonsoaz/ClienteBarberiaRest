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
"aidBarbero",
"bcod",
"eCompleto",
"fEstado",
"hcelular",
"iDni",
"jEmail",
"kDireccion",
"lModifiedBy",
"mdate",
"lIdUnico"
})
public class BuscarBarberoInterno implements Serializable
{

@JsonProperty("aidBarbero")
private int aidBarbero;
@JsonProperty("bcod")
private String bcod;
@JsonProperty("eCompleto")
private String eCompleto;
@JsonProperty("fEstado")
private String fEstado;
@JsonProperty("hcelular")
private String hcelular;
@JsonProperty("iDni")
private String iDni;
@JsonProperty("jEmail")
private String jEmail;
@JsonProperty("kDireccion")
private String kDireccion;
@JsonProperty("lModifiedBy")
private String lModifiedBy;
@JsonProperty("mdate")
private String mdate;
@JsonProperty("lIdUnico")
private int lIdUnico;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -3761112459837931093L;

/**
* No args constructor for use in serialization
* 
*/
public BuscarBarberoInterno() {
}

/**
* 
* @param mdate
* @param jEmail
* @param fEstado
* @param aidBarbero
* @param kDireccion
* @param hcelular
* @param bcod
* @param eCompleto
* @param lModifiedBy
* @param lIdUnico
* @param iDni
*/
public BuscarBarberoInterno(int aidBarbero, String bcod, String eCompleto, String fEstado, String hcelular, String iDni, String jEmail, String kDireccion, String lModifiedBy, String mdate, int lIdUnico) {
super();
this.aidBarbero = aidBarbero;
this.bcod = bcod;
this.eCompleto = eCompleto;
this.fEstado = fEstado;
this.hcelular = hcelular;
this.iDni = iDni;
this.jEmail = jEmail;
this.kDireccion = kDireccion;
this.lModifiedBy = lModifiedBy;
this.mdate = mdate;
this.lIdUnico = lIdUnico;
}

@JsonProperty("aidBarbero")
public int getAidBarbero() {
return aidBarbero;
}

@JsonProperty("aidBarbero")
public void setAidBarbero(int aidBarbero) {
this.aidBarbero = aidBarbero;
}

public BuscarBarberoInterno withAidBarbero(int aidBarbero) {
this.aidBarbero = aidBarbero;
return this;
}

@JsonProperty("bcod")
public String getBcod() {
return bcod;
}

@JsonProperty("bcod")
public void setBcod(String bcod) {
this.bcod = bcod;
}

public BuscarBarberoInterno withBcod(String bcod) {
this.bcod = bcod;
return this;
}

@JsonProperty("eCompleto")
public String getECompleto() {
return eCompleto;
}

@JsonProperty("eCompleto")
public void setECompleto(String eCompleto) {
this.eCompleto = eCompleto;
}

public BuscarBarberoInterno withECompleto(String eCompleto) {
this.eCompleto = eCompleto;
return this;
}

@JsonProperty("fEstado")
public String getFEstado() {
return fEstado;
}

@JsonProperty("fEstado")
public void setFEstado(String fEstado) {
this.fEstado = fEstado;
}

public BuscarBarberoInterno withFEstado(String fEstado) {
this.fEstado = fEstado;
return this;
}

@JsonProperty("hcelular")
public String getHcelular() {
return hcelular;
}

@JsonProperty("hcelular")
public void setHcelular(String hcelular) {
this.hcelular = hcelular;
}

public BuscarBarberoInterno withHcelular(String hcelular) {
this.hcelular = hcelular;
return this;
}

@JsonProperty("iDni")
public String getIDni() {
return iDni;
}

@JsonProperty("iDni")
public void setIDni(String iDni) {
this.iDni = iDni;
}

public BuscarBarberoInterno withIDni(String iDni) {
this.iDni = iDni;
return this;
}

@JsonProperty("jEmail")
public String getJEmail() {
return jEmail;
}

@JsonProperty("jEmail")
public void setJEmail(String jEmail) {
this.jEmail = jEmail;
}

public BuscarBarberoInterno withJEmail(String jEmail) {
this.jEmail = jEmail;
return this;
}

@JsonProperty("kDireccion")
public String getKDireccion() {
return kDireccion;
}

@JsonProperty("kDireccion")
public void setKDireccion(String kDireccion) {
this.kDireccion = kDireccion;
}

public BuscarBarberoInterno withKDireccion(String kDireccion) {
this.kDireccion = kDireccion;
return this;
}

@JsonProperty("lModifiedBy")
public String getLModifiedBy() {
return lModifiedBy;
}

@JsonProperty("lModifiedBy")
public void setLModifiedBy(String lModifiedBy) {
this.lModifiedBy = lModifiedBy;
}

public BuscarBarberoInterno withLModifiedBy(String lModifiedBy) {
this.lModifiedBy = lModifiedBy;
return this;
}

@JsonProperty("mdate")
public String getMdate() {
return mdate;
}

@JsonProperty("mdate")
public void setMdate(String mdate) {
this.mdate = mdate;
}

public BuscarBarberoInterno withMdate(String mdate) {
this.mdate = mdate;
return this;
}

@JsonProperty("lIdUnico")
public int getLIdUnico() {
return lIdUnico;
}

@JsonProperty("lIdUnico")
public void setLIdUnico(int lIdUnico) {
this.lIdUnico = lIdUnico;
}

public BuscarBarberoInterno withLIdUnico(int lIdUnico) {
this.lIdUnico = lIdUnico;
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

public BuscarBarberoInterno withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}