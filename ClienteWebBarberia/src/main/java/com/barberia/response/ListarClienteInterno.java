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
"aidCliente",
"bCodigo",
"completo",
"dni",
"estado",
"gCelular",
"hEmail",
"jDireccion",
"kModifiedBy",
"ldate"
})
public class ListarClienteInterno implements Serializable
{

@JsonProperty("aidCliente")
private String aidCliente;
@JsonProperty("bCodigo")
private String bCodigo;
@JsonProperty("completo")
private String completo;
@JsonProperty("dni")
private String dni;
@JsonProperty("estado")
private String estado;
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
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -1671655367738111419L;

/**
* No args constructor for use in serialization
* 
*/
public ListarClienteInterno() {
}

/**
* 
* @param ldate
* @param estado
* @param gCelular
* @param hEmail
* @param aidCliente
* @param completo
* @param kModifiedBy
* @param jDireccion
* @param bCodigo
* @param dni
*/
public ListarClienteInterno(String aidCliente, String bCodigo, String completo, String dni, String estado, String gCelular, String hEmail, String jDireccion, String kModifiedBy, String ldate) {
super();
this.aidCliente = aidCliente;
this.bCodigo = bCodigo;
this.completo = completo;
this.dni = dni;
this.estado = estado;
this.gCelular = gCelular;
this.hEmail = hEmail;
this.jDireccion = jDireccion;
this.kModifiedBy = kModifiedBy;
this.ldate = ldate;
}

@JsonProperty("aidCliente")
public String getAidCliente() {
return aidCliente;
}

@JsonProperty("aidCliente")
public void setAidCliente(String aidCliente) {
this.aidCliente = aidCliente;
}

public ListarClienteInterno withAidCliente(String aidCliente) {
this.aidCliente = aidCliente;
return this;
}

@JsonProperty("bCodigo")
public String getBCodigo() {
return bCodigo;
}

@JsonProperty("bCodigo")
public void setBCodigo(String bCodigo) {
this.bCodigo = bCodigo;
}

public ListarClienteInterno withBCodigo(String bCodigo) {
this.bCodigo = bCodigo;
return this;
}

@JsonProperty("completo")
public String getCompleto() {
return completo;
}

@JsonProperty("completo")
public void setCompleto(String completo) {
this.completo = completo;
}

public ListarClienteInterno withCompleto(String completo) {
this.completo = completo;
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

public ListarClienteInterno withDni(String dni) {
this.dni = dni;
return this;
}

@JsonProperty("estado")
public String getEstado() {
return estado;
}

@JsonProperty("estado")
public void setEstado(String estado) {
this.estado = estado;
}

public ListarClienteInterno withEstado(String estado) {
this.estado = estado;
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

public ListarClienteInterno withGCelular(String gCelular) {
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

public ListarClienteInterno withHEmail(String hEmail) {
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

public ListarClienteInterno withJDireccion(String jDireccion) {
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

public ListarClienteInterno withKModifiedBy(String kModifiedBy) {
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

public ListarClienteInterno withLdate(String ldate) {
this.ldate = ldate;
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

public ListarClienteInterno withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}
