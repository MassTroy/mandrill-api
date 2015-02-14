package com.mandrillapp.api.messages.sendtemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.codec.binary.Base64;

import com.mandrillapp.api.messages.common.Attachment;
import com.mandrillapp.api.messages.common.MergeVar;
import com.mandrillapp.api.messages.common.Message;
import com.mandrillapp.api.messages.common.NameContent;
import com.mandrillapp.api.messages.common.To;

public class SendTemplateRequestBuilder {

	private String templateName;
	private List<To> toList = new ArrayList<To>();
	private List<MergeVar> mergeVars = new ArrayList<MergeVar>();
	private List<Attachment> attachments;

	public SendTemplateRequestBuilder(final String templateName) {
		this.templateName = templateName;
	}

	public SendTemplate build() {
		Message message = new Message(toList, mergeVars, attachments);
		return new SendTemplate(templateName, message);
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
