package com.mandrillapp.api.messages.send;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.mandrillapp.api.messages.common.Message;

@JsonPropertyOrder({
		"key",
		"message",
		"async",
		"send_at"
})
public class Send {

	@JsonProperty("key")
	private String key;
	@JsonProperty("message")
	private Message message;
	@JsonProperty("async")
	private boolean async = true;
	@JsonProperty("send_at")
	private String sendAt;

	public Send(final Message message) {
		this.message = message;
	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(final String key) {
		this.key = key;
	}

	@JsonProperty("message")
	public Message getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(final Message message) {
		this.message = message;
	}

	@JsonProperty("async")
	public boolean isAsync() {
		return async;
	}

	@JsonProperty("async")
	public void setAsync(final boolean async) {
		this.async = async;
	}

	@JsonProperty("send_at")
	public String getSendAt() {
		return sendAt;
	}

	@JsonProperty("send_at")
	public void setSendAt(final String sendAt) {
		this.sendAt = sendAt;
	}

}
