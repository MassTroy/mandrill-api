package com.mandrillapp.api.messages.send;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import com.mandrillapp.api.messages.common.Attachment;
import com.mandrillapp.api.messages.common.Message;
import com.mandrillapp.api.messages.common.To;

public class SendRequestBuilder {

	private List<To> toList = new ArrayList<To>();
	private String fromEmail;
	private String fromName;
	private String subject;
	private String html;
	private List<Attachment> attachments;

	public SendRequestBuilder() {
	}

	public Send build() {
		Message message = new Message(toList, fromEmail, fromName, subject, html, attachments);
		return new Send(message);
	}

	public SendRequestBuilder addRecipient(final String email, final String name) {
		// add recipient
		To to = new To(email, name);
		toList.add(to);

		return this;
	}

	public SendRequestBuilder from(final String fromEmail) {
		this.fromEmail = fromEmail;
		return this;
	}

	public SendRequestBuilder from(final String fromEmail, final String fromName) {
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		return this;
	}

	public SendRequestBuilder subject(final String subject) {
		this.subject = subject;
		return this;
	}

	public SendRequestBuilder html(final String html) {
		this.html = html;
		return this;
	}

	public SendRequestBuilder addAttachment(final String mimeType, final String name, final byte[] bytes) {
		if (attachments == null) {
			attachments = new ArrayList<Attachment>();
		}
		this.attachments.add(new Attachment(mimeType, name, Base64.encodeBase64String(bytes)));
		return this;
	}
}
