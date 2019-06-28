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
"odate",
"pIdUnik"
})
public class BuscarProductoInterno implements Serializable
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
@JsonProperty("pIdUnik")
private int pIdUnik;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -42331127410194595L;

/**
* No args constructor for use in serialization
* 
*/
public BuscarProductoInterno() {
}

/**
* 
* @param bcodigo
* @param pIdUnik
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
public BuscarProductoInterno(int aidProducto, String bcodigo, String dTipo, String eProd, String gMarca, String iEstado, int jCantidad, double kPrecio, String lDescripcion, String nUser, String odate, int pIdUnik) {
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
this.pIdUnik = pIdUnik;
}

@JsonProperty("aidProducto")
public int getAidProducto() {
return aidProducto;
}

@JsonProperty("aidProducto")
public void setAidProducto(int aidProducto) {
this.aidProducto = aidProducto;
}

public BuscarProductoInterno withAidProducto(int aidProducto) {
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

public BuscarProductoInterno withBcodigo(String bcodigo) {
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

public BuscarProductoInterno withDTipo(String dTipo) {
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

public BuscarProductoInterno withEProd(String eProd) {
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

public BuscarProductoInterno withGMarca(String gMarca) {
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

public BuscarProductoInterno withIEstado(String iEstado) {
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

public BuscarProductoInterno withJCantidad(int jCantidad) {
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

public BuscarProductoInterno withKPrecio(double kPrecio) {
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

public BuscarProductoInterno withLDescripcion(String lDescripcion) {
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

public BuscarProductoInterno withNUser(String nUser) {
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

public BuscarProductoInterno withOdate(String odate) {
this.odate = odate;
return this;
}

@JsonProperty("pIdUnik")
public int getPIdUnik() {
return pIdUnik;
}

@JsonProperty("pIdUnik")
public void setPIdUnik(int pIdUnik) {
this.pIdUnik = pIdUnik;
}

public BuscarProductoInterno withPIdUnik(int pIdUnik) {
this.pIdUnik = pIdUnik;
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

public BuscarProductoInterno withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}