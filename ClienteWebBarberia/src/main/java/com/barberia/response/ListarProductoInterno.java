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
"aidProducto",
"bcodigo",
"dTipo",
"eProd",
"gMarca",
"iEstado",
"jCantidad",
"kPrecio",
"lDescripcion",
"nUser",
"odate"
})
public class ListarProductoInterno implements Serializable
{

@JsonProperty("aidProducto")
private int aidProducto;
@JsonProperty("bcodigo")
private String bcodigo;
@JsonProperty("dTipo")
private String dTipo;
@JsonProperty("eProd")
private String eProd;
@JsonProperty("gMarca")
private String gMarca;
@JsonProperty("iEstado")
private String iEstado;
@JsonProperty("jCantidad")
private int jCantidad;
@JsonProperty("kPrecio")
private double kPrecio;
@JsonProperty("lDescripcion")
private String lDescripcion;
@JsonProperty("nUser")
private String nUser;
@JsonProperty("odate")
private String odate;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 505800970640758919L;

/**
* No args constructor for use in serialization
* 
*/
public ListarProductoInterno() {
}

/**
* 
* @param bcodigo
* @param jCantidad
* @param dTipo
* @param odate
* @param gMarca
* @param eProd
* @param nUser
* @param kPrecio
* @param iEstado
* @param aidProducto
* @param lDescripcion
*/
public ListarProductoInterno(int aidProducto, String bcodigo, String dTipo, String eProd, String gMarca, String iEstado, int jCantidad, double kPrecio, String lDescripcion, String nUser, String odate) {
super();
this.aidProducto = aidProducto;
this.bcodigo = bcodigo;
this.dTipo = dTipo;
this.eProd = eProd;
this.gMarca = gMarca;
this.iEstado = iEstado;
this.jCantidad = jCantidad;
this.kPrecio = kPrecio;
this.lDescripcion = lDescripcion;
this.nUser = nUser;
this.odate = odate;
}

@JsonProperty("aidProducto")
public int getAidProducto() {
return aidProducto;
}

@JsonProperty("aidProducto")
public void setAidProducto(int aidProducto) {
this.aidProducto = aidProducto;
}

public ListarProductoInterno withAidProducto(int aidProducto) {
this.aidProducto = aidProducto;
return this;
}

@JsonProperty("bcodigo")
public String getBcodigo() {
return bcodigo;
}

@JsonProperty("bcodigo")
public void setBcodigo(String bcodigo) {
this.bcodigo = bcodigo;
}

public ListarProductoInterno withBcodigo(String bcodigo) {
this.bcodigo = bcodigo;
return this;
}

@JsonProperty("dTipo")
public String getDTipo() {
return dTipo;
}

@JsonProperty("dTipo")
public void setDTipo(String dTipo) {
this.dTipo = dTipo;
}

public ListarProductoInterno withDTipo(String dTipo) {
this.dTipo = dTipo;
return this;
}

@JsonProperty("eProd")
public String getEProd() {
return eProd;
}

@JsonProperty("eProd")
public void setEProd(String eProd) {
this.eProd = eProd;
}

public ListarProductoInterno withEProd(String eProd) {
this.eProd = eProd;
return this;
}

@JsonProperty("gMarca")
public String getGMarca() {
return gMarca;
}

@JsonProperty("gMarca")
public void setGMarca(String gMarca) {
this.gMarca = gMarca;
}

public ListarProductoInterno withGMarca(String gMarca) {
this.gMarca = gMarca;
return this;
}

@JsonProperty("iEstado")
public String getIEstado() {
return iEstado;
}

@JsonProperty("iEstado")
public void setIEstado(String iEstado) {
this.iEstado = iEstado;
}

public ListarProductoInterno withIEstado(String iEstado) {
this.iEstado = iEstado;
return this;
}

@JsonProperty("jCantidad")
public int getJCantidad() {
return jCantidad;
}

@JsonProperty("jCantidad")
public void setJCantidad(int jCantidad) {
this.jCantidad = jCantidad;
}

public ListarProductoInterno withJCantidad(int jCantidad) {
this.jCantidad = jCantidad;
return this;
}

@JsonProperty("kPrecio")
public double getKPrecio() {
return kPrecio;
}

@JsonProperty("kPrecio")
public void setKPrecio(double kPrecio) {
this.kPrecio = kPrecio;
}

public ListarProductoInterno withKPrecio(double kPrecio) {
this.kPrecio = kPrecio;
return this;
}

@JsonProperty("lDescripcion")
public String getLDescripcion() {
return lDescripcion;
}

@JsonProperty("lDescripcion")
public void setLDescripcion(String lDescripcion) {
this.lDescripcion = lDescripcion;
}

public ListarProductoInterno withLDescripcion(String lDescripcion) {
this.lDescripcion = lDescripcion;
return this;
}

@JsonProperty("nUser")
public String getNUser() {
return nUser;
}

@JsonProperty("nUser")
public void setNUser(String nUser) {
this.nUser = nUser;
}

public ListarProductoInterno withNUser(String nUser) {
this.nUser = nUser;
return this;
}

@JsonProperty("odate")
public String getOdate() {
return odate;
}

@JsonProperty("odate")
public void setOdate(String odate) {
this.odate = odate;
}

public ListarProductoInterno withOdate(String odate) {
this.odate = odate;
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

public ListarProductoInterno withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}