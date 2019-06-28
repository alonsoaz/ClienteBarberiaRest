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
"aDni",
"bTelf"
})
public class LoginCliente implements Serializable
{

@JsonProperty("aDni")
private String aDni;
@JsonProperty("bTelf")
private String bTelf;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 823324862575746769L;

/**
* No args constructor for use in serialization
* 
*/
public LoginCliente() {
}

/**
* 
* @param aDni
* @param bTelf
*/
public LoginCliente(String aDni, String bTelf) {
super();
this.aDni = aDni;
this.bTelf = bTelf;
}

@JsonProperty("aDni")
public String getADni() {
return aDni;
}

@JsonProperty("aDni")
public void setADni(String aDni) {
this.aDni = aDni;
}

public LoginCliente withADni(String aDni) {
this.aDni = aDni;
return this;
}

@JsonProperty("bTelf")
public String getBTelf() {
return bTelf;
}

@JsonProperty("bTelf")
public void setBTelf(String bTelf) {
this.bTelf = bTelf;
}

public LoginCliente withBTelf(String bTelf) {
this.bTelf = bTelf;
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

public LoginCliente withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}