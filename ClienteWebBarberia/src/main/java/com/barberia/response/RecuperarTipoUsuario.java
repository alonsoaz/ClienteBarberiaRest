
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
"message",
"id"
})
public class RecuperarTipoUsuario implements Serializable
{

@JsonProperty("message")
private String message;
@JsonProperty("id")
private int id;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -5418983290578561175L;

/**
* No args constructor for use in serialization
* 
*/
public RecuperarTipoUsuario() {
}

/**
* 
* @param id
* @param message
*/
public RecuperarTipoUsuario(String message, int id) {
super();
this.message = message;
this.id = id;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

public RecuperarTipoUsuario withMessage(String message) {
this.message = message;
return this;
}

@JsonProperty("id")
public int getId() {
return id;
}

@JsonProperty("id")
public void setId(int id) {
this.id = id;
}

public RecuperarTipoUsuario withId(int id) {
this.id = id;
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

public RecuperarTipoUsuario withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}