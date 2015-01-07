package com.mandrillapp.api.messages.sendtemplate;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"email",
	"name",
	"type"
})
public class To {

	@JsonProperty("email")
	private String email;
	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private ToType type = ToType.to;

	public To(final String email, final String name) {
		this.email = email;
		this.name = name;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(final String email) {
		this.email = email;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(final String name) {
		this.name = name;
	}

	@JsonProperty("type")
	public ToType getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(final ToType type) {
		this.type = type;
	}

}
