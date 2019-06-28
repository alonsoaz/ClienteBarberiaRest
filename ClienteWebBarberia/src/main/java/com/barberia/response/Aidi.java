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
"aidi"
})
public class Aidi implements Serializable
{

@JsonProperty("aidi")
private int aidi;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 4796481592291368780L;

/**
* No args constructor for use in serialization
* 
*/
public Aidi() {
}

/**
* 
* @param aidi
*/
public Aidi(int aidi) {
super();
this.aidi = aidi;
}

@JsonProperty("aidi")
public int getAidi() {
return aidi;
}

@JsonProperty("aidi")
public void setAidi(int aidi) {
this.aidi = aidi;
}

public Aidi withAidi(int aidi) {
this.aidi = aidi;
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

public Aidi withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}
