package com.mandrillapp.api.messages;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.mandrillapp.api.messages.sendtemplate.Message;
import com.mandrillapp.api.messages.sendtemplate.NameContent;

@JsonPropertyOrder({
		"key",
		"template_name",
		"template_content",
		"message",
		"async"
})
public class SendTemplate {
	
	@JsonProperty("key")
	private String key;
	@JsonProperty("template_name")
	private String templateName;
	@JsonProperty("template_content")
	private List<NameContent> templateContent;
	@JsonProperty("message")
	private Message message;
	@JsonProperty("async")
	private boolean async = true;

	public SendTemplate(String key, String templateName, Message message) {
		this.key = key;
		this.templateName = templateName;
		this.message = message;
	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	@JsonProperty("template_name")
	public String getTemplateName() {
		return templateName;
	}

	@JsonProperty("template_name")
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@JsonProperty("template_content")
	public List<NameContent> getTemplateContent() {
		return templateContent;
	}

	@JsonProperty("template_content")
	public void setTemplateContent(List<NameContent> templateContent) {
		this.templateContent = templateContent;
	}

	@JsonProperty("message")
	public Message getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(Message message) {
		this.message = message;
	}

	@JsonProperty("async")
	public boolean isAsync() {
		return async;
	}

	@JsonProperty("async")
	public void setAsync(boolean async) {
		this.async = async;
	}

}
