package com.mandrillapp.api.messages.sendtemplate;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
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
	public void setEmail(final String email) {
		this.email = email;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(final String status) {
		this.status = status;
	}

	@JsonProperty("_id")
	public String getId() {
		return Id;
	}

	@JsonProperty("_id")
	public void setId(final String Id) {
		this.Id = Id;
	}

}