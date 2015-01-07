package com.mandrillapp.api.messages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.codec.binary.Base64;

import com.mandrillapp.api.messages.sendtemplate.Attachment;
import com.mandrillapp.api.messages.sendtemplate.MergeVar;
import com.mandrillapp.api.messages.sendtemplate.Message;
import com.mandrillapp.api.messages.sendtemplate.NameContent;
import com.mandrillapp.api.messages.sendtemplate.To;

public class SendTemplateRequestBuilder {

	private String key;
	private String templateName;
	private List<To> toList = new ArrayList<To>();
	private List<MergeVar> mergeVars = new ArrayList<MergeVar>();
	private List<Attachment> attachments;

	public SendTemplateRequestBuilder(final String key, final String templateName) {
		this.key = key;
		this.templateName = templateName;
	}

	public SendTemplate build() {
		Message message = new Message(toList, mergeVars, attachments);
		return new SendTemplate(key, templateName, message);
	}

	public SendTemplateRequestBuilder addRecipient(final String email, final String name) {
		// add recipient
		To to = new To(email, name);
		toList.add(to);

		return this;
	}

	public SendTemplateRequestBuilder addRecipient(final String email, final String name, final Map<String, String> params) {
		// add recipient
		To to = new To(email, name);
		toList.add(to);

		// add recipient params
		if (params != null) {
			List<NameContent> vars = new ArrayList<NameContent>();
			for (Entry<String, String> param : params.entrySet()) {
				NameContent var = new NameContent(param.getKey(), param.getValue());
				vars.add(var);
			}
			MergeVar mergeVar = new MergeVar(email, vars);
			mergeVars.add(mergeVar);
		}

		return this;
	}

	public SendTemplateRequestBuilder addAttachment(final String mimeType, final String name, final byte[] bytes) {
		if (attachments == null) {
			attachments = new ArrayList<Attachment>();
		}
		this.attachments.add(new Attachment(mimeType, name, Base64.encodeBase64String(bytes)));
		return this;
	}
}
