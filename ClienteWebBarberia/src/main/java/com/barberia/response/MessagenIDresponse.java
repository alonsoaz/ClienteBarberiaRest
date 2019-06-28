package com.barberia.response;

import java.util.List;

import com.barberia.entity.MessagenID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessagenIDresponse {

	   @JsonProperty
	   private List<MessagenID> listmessagenid;

	public List<MessagenID> getListmessagenid() {
		return listmessagenid;
	}

	public void setListmessagenid(List<MessagenID> listmessagenid) {
		this.listmessagenid = listmessagenid;
	} 
	

	   
	   
}
