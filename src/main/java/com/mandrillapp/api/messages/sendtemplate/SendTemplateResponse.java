package com.mandrillapp.api.messages.sendtemplate;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
		"email",
		"status",
		"_id"
})
public class SendTemplateResponse {

	@JsonProperty("email")
	private String email;
	@JsonProperty("status")
	private String status;
	@JsonProperty("_id")
	private String Id;

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("_id")
	public String getId() {
		return Id;
	}

	@JsonProperty("_id")
	public void setId(String Id) {
		this.Id = Id;
	}

}