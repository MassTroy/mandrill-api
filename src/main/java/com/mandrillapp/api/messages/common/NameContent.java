package com.mandrillapp.api.messages.common;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"name",
	"content"
})
public class NameContent {

	@JsonProperty("name")
	private String name;
	@JsonProperty("content")
	private String content;

	public NameContent(final String name, final String content) {
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

}
