package com.mandrillapp.api.messages.sendtemplate;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
		"name",
		"content"
})
public class Var {

	@JsonProperty("name")
	private String name;
	@JsonProperty("content")
	private String content;

	public Var(String name, String content) {
		this.name = name;
		this.content = content;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("content")
	public String getContent() {
		return content;
	}

}
