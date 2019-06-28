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
"aidServicio",
"bCod",
"cNombre",
"eEstado",
"fDuracion",
"gPrecio",
"hDescripcion",
"jUser",
"kDate"
})
public class ListarServicioInterno implements Serializable
{

@JsonProperty("aidServicio")
private int aidServicio;
@JsonProperty("bCod")
private String bCod;
@JsonProperty("cNombre")
private String cNombre;
@JsonProperty("eEstado")
private String eEstado;
@JsonProperty("fDuracion")
private int fDuracion;
@JsonProperty("gPrecio")
private double gPrecio;
@JsonProperty("hDescripcion")
private String hDescripcion;
@JsonProperty("jUser")
private String jUser;
@JsonProperty("kDate")
private String kDate;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 7314978736893101896L;

/**
* No args constructor for use in serialization
* 
*/
public ListarServicioInterno() {
}

/**
* 
* @param eEstado
* @param hDescripcion
* @param bCod
* @param fDuracion
* @param aidServicio
* @param cNombre
* @param gPrecio
* @param jUser
* @param kDate
*/
public ListarServicioInterno(int aidServicio, String bCod, String cNombre, String eEstado, int fDuracion, double gPrecio, String hDescripcion, String jUser, String kDate) {
super();
this.aidServicio = aidServicio;
this.bCod = bCod;
this.cNombre = cNombre;
this.eEstado = eEstado;
this.fDuracion = fDuracion;
this.gPrecio = gPrecio;
this.hDescripcion = hDescripcion;
this.jUser = jUser;
this.kDate = kDate;
}

@JsonProperty("aidServicio")
public int getAidServicio() {
return aidServicio;
}

@JsonProperty("aidServicio")
public void setAidServicio(int aidServicio) {
this.aidServicio = aidServicio;
}

public ListarServicioInterno withAidServicio(int aidServicio) {
this.aidServicio = aidServicio;
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

public ListarServicioInterno withBCod(String bCod) {
this.bCod = bCod;
return this;
}

@JsonProperty("cNombre")
public String getCNombre() {
return cNombre;
}

@JsonProperty("cNombre")
public void setCNombre(String cNombre) {
this.cNombre = cNombre;
}

public ListarServicioInterno withCNombre(String cNombre) {
this.cNombre = cNombre;
return this;
}

@JsonProperty("eEstado")
public String getEEstado() {
return eEstado;
}

@JsonProperty("eEstado")
public void setEEstado(String eEstado) {
this.eEstado = eEstado;
}

public ListarServicioInterno withEEstado(String eEstado) {
this.eEstado = eEstado;
return this;
}

@JsonProperty("fDuracion")
public int getFDuracion() {
return fDuracion;
}

@JsonProperty("fDuracion")
public void setFDuracion(int fDuracion) {
this.fDuracion = fDuracion;
}

public ListarServicioInterno withFDuracion(int fDuracion) {
this.fDuracion = fDuracion;
return this;
}

@JsonProperty("gPrecio")
public double getGPrecio() {
return gPrecio;
}

@JsonProperty("gPrecio")
public void setGPrecio(double gPrecio) {
this.gPrecio = gPrecio;
}

public ListarServicioInterno withGPrecio(double gPrecio) {
this.gPrecio = gPrecio;
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

public ListarServicioInterno withHDescripcion(String hDescripcion) {
this.hDescripcion = hDescripcion;
return this;
}

@JsonProperty("jUser")
public String getJUser() {
return jUser;
}

@JsonProperty("jUser")
public void setJUser(String jUser) {
this.jUser = jUser;
}

public ListarServicioInterno withJUser(String jUser) {
this.jUser = jUser;
return this;
}

@JsonProperty("kDate")
public String getKDate() {
return kDate;
}

@JsonProperty("kDate")
public void setKDate(String kDate) {
this.kDate = kDate;
}

public ListarServicioInterno withKDate(String kDate) {
this.kDate = kDate;
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

public ListarServicioInterno withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}