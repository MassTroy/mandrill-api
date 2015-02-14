package com.mandrillapp.api.messages.sendtemplate;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.mandrillapp.api.messages.common.Message;
import com.mandrillapp.api.messages.common.NameContent;

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

	public SendTemplate(final String templateName, final Message message) {
		this.templateName = templateName;
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(final String templateName) {
		this.templateName = templateName;
	}

	public List<NameContent> getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(final List<NameContent> templateContent) {
		this.templateContent = templateContent;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(final Message message) {
		this.message = message;
	}

	public boolean isAsync() {
		return async;
	}

	public void setAsync(final boolean async) {
		this.async = async;
	}

}
