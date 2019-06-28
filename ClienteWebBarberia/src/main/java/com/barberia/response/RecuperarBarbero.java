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
"aidEstado",
"bNombre",
"cApellido",
"dTelefono",
"eDni",
"fEmail",
"gDireccion"
})
public class RecuperarBarbero implements Serializable
{

@JsonProperty("aidEstado")
private int aidEstado;
@JsonProperty("bNombre")
private String bNombre;
@JsonProperty("cApellido")
private String cApellido;
@JsonProperty("dTelefono")
private String dTelefono;
@JsonProperty("eDni")
private String eDni;
@JsonProperty("fEmail")
private String fEmail;
@JsonProperty("gDireccion")
private String gDireccion;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 3183599315995206626L;

/**
* No args constructor for use in serialization
* 
*/
public RecuperarBarbero() {
}

/**
* 
* @param dTelefono
* @param gDireccion
* @param eDni
* @param aidEstado
* @param fEmail
* @param bNombre
* @param cApellido
*/
public RecuperarBarbero(int aidEstado, String bNombre, String cApellido, String dTelefono, String eDni, String fEmail, String gDireccion) {
super();
this.aidEstado = aidEstado;
this.bNombre = bNombre;
this.cApellido = cApellido;
this.dTelefono = dTelefono;
this.eDni = eDni;
this.fEmail = fEmail;
this.gDireccion = gDireccion;
}

@JsonProperty("aidEstado")
public int getAidEstado() {
return aidEstado;
}

@JsonProperty("aidEstado")
public void setAidEstado(int aidEstado) {
this.aidEstado = aidEstado;
}

public RecuperarBarbero withAidEstado(int aidEstado) {
this.aidEstado = aidEstado;
return this;
}

@JsonProperty("bNombre")
public String getBNombre() {
return bNombre;
}

@JsonProperty("bNombre")
public void setBNombre(String bNombre) {
this.bNombre = bNombre;
}

public RecuperarBarbero withBNombre(String bNombre) {
this.bNombre = bNombre;
return this;
}

@JsonProperty("cApellido")
public String getCApellido() {
return cApellido;
}

@JsonProperty("cApellido")
public void setCApellido(String cApellido) {
this.cApellido = cApellido;
}

public RecuperarBarbero withCApellido(String cApellido) {
this.cApellido = cApellido;
return this;
}

@JsonProperty("dTelefono")
public String getDTelefono() {
return dTelefono;
}

@JsonProperty("dTelefono")
public void setDTelefono(String dTelefono) {
this.dTelefono = dTelefono;
}

public RecuperarBarbero withDTelefono(String dTelefono) {
this.dTelefono = dTelefono;
return this;
}

@JsonProperty("eDni")
public String getEDni() {
return eDni;
}

@JsonProperty("eDni")
public void setEDni(String eDni) {
this.eDni = eDni;
}

public RecuperarBarbero withEDni(String eDni) {
this.eDni = eDni;
return this;
}

@JsonProperty("fEmail")
public String getFEmail() {
return fEmail;
}

@JsonProperty("fEmail")
public void setFEmail(String fEmail) {
this.fEmail = fEmail;
}

public RecuperarBarbero withFEmail(String fEmail) {
this.fEmail = fEmail;
return this;
}

@JsonProperty("gDireccion")
public String getGDireccion() {
return gDireccion;
}

@JsonProperty("gDireccion")
public void setGDireccion(String gDireccion) {
this.gDireccion = gDireccion;
}

public RecuperarBarbero withGDireccion(String gDireccion) {
this.gDireccion = gDireccion;
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

public RecuperarBarbero withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}