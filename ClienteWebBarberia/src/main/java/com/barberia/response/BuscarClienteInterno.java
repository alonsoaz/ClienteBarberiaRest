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
"aiDCliente",
"bCod",
"cCompleto",
"dni",
"fEsatado",
"gCelular",
"hEmail",
"jDireccion",
"kModifiedBy",
"ldate",
"mIdUnico"
})
public class BuscarClienteInterno implements Serializable
{

@JsonProperty("aiDCliente")
private String aiDCliente;
@JsonProperty("bCod")
private String bCod;
@JsonProperty("cCompleto")
private String cCompleto;
@JsonProperty("dni")
private String dni;
@JsonProperty("fEsatado")
private String fEsatado;
@JsonProperty("gCelular")
private String gCelular;
@JsonProperty("hEmail")
private String hEmail;
@JsonProperty("jDireccion")
private String jDireccion;
@JsonProperty("kModifiedBy")
private String kModifiedBy;
@JsonProperty("ldate")
private String ldate;
@JsonProperty("mIdUnico")
private int mIdUnico;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 75175704549531388L;

/**
* No args constructor for use in serialization
* 
*/
public BuscarClienteInterno() {
}

/**
* 
* @param mIdUnico
* @param ldate
* @param aiDCliente
* @param gCelular
* @param hEmail
* @param bCod
* @param fEsatado
* @param kModifiedBy
* @param jDireccion
* @param cCompleto
* @param dni
*/
public BuscarClienteInterno(String aiDCliente, String bCod, String cCompleto, String dni, String fEsatado, String gCelular, String hEmail, String jDireccion, String kModifiedBy, String ldate, int mIdUnico) {
super();
this.aiDCliente = aiDCliente;
this.bCod = bCod;
this.cCompleto = cCompleto;
this.dni = dni;
this.fEsatado = fEsatado;
this.gCelular = gCelular;
this.hEmail = hEmail;
this.jDireccion = jDireccion;
this.kModifiedBy = kModifiedBy;
this.ldate = ldate;
this.mIdUnico = mIdUnico;
}

@JsonProperty("aiDCliente")
public String getAiDCliente() {
return aiDCliente;
}

@JsonProperty("aiDCliente")
public void setAiDCliente(String aiDCliente) {
this.aiDCliente = aiDCliente;
}

public BuscarClienteInterno withAiDCliente(String aiDCliente) {
this.aiDCliente = aiDCliente;
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

public BuscarClienteInterno withBCod(String bCod) {
this.bCod = bCod;
return this;
}

@JsonProperty("cCompleto")
public String getCCompleto() {
return cCompleto;
}

@JsonProperty("cCompleto")
public void setCCompleto(String cCompleto) {
this.cCompleto = cCompleto;
}

public BuscarClienteInterno withCCompleto(String cCompleto) {
this.cCompleto = cCompleto;
return this;
}

@JsonProperty("dni")
public String getDni() {
return dni;
}

@JsonProperty("dni")
public void setDni(String dni) {
this.dni = dni;
}

public BuscarClienteInterno withDni(String dni) {
this.dni = dni;
return this;
}

@JsonProperty("fEsatado")
public String getFEsatado() {
return fEsatado;
}

@JsonProperty("fEsatado")
public void setFEsatado(String fEsatado) {
this.fEsatado = fEsatado;
}

public BuscarClienteInterno withFEsatado(String fEsatado) {
this.fEsatado = fEsatado;
return this;
}

@JsonProperty("gCelular")
public String getGCelular() {
return gCelular;
}

@JsonProperty("gCelular")
public void setGCelular(String gCelular) {
this.gCelular = gCelular;
}

public BuscarClienteInterno withGCelular(String gCelular) {
this.gCelular = gCelular;
return this;
}

@JsonProperty("hEmail")
public String getHEmail() {
return hEmail;
}

@JsonProperty("hEmail")
public void setHEmail(String hEmail) {
this.hEmail = hEmail;
}

public BuscarClienteInterno withHEmail(String hEmail) {
this.hEmail = hEmail;
return this;
}

@JsonProperty("jDireccion")
public String getJDireccion() {
return jDireccion;
}

@JsonProperty("jDireccion")
public void setJDireccion(String jDireccion) {
this.jDireccion = jDireccion;
}

public BuscarClienteInterno withJDireccion(String jDireccion) {
this.jDireccion = jDireccion;
return this;
}

@JsonProperty("kModifiedBy")
public String getKModifiedBy() {
return kModifiedBy;
}

@JsonProperty("kModifiedBy")
public void setKModifiedBy(String kModifiedBy) {
this.kModifiedBy = kModifiedBy;
}

public BuscarClienteInterno withKModifiedBy(String kModifiedBy) {
this.kModifiedBy = kModifiedBy;
return this;
}

@JsonProperty("ldate")
public String getLdate() {
return ldate;
}

@JsonProperty("ldate")
public void setLdate(String ldate) {
this.ldate = ldate;
}

public BuscarClienteInterno withLdate(String ldate) {
this.ldate = ldate;
return this;
}

@JsonProperty("mIdUnico")
public int getMIdUnico() {
return mIdUnico;
}

@JsonProperty("mIdUnico")
public void setMIdUnico(int mIdUnico) {
this.mIdUnico = mIdUnico;
}

public BuscarClienteInterno withMIdUnico(int mIdUnico) {
this.mIdUnico = mIdUnico;
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

public BuscarClienteInterno withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}