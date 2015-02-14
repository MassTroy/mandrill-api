package com.mandrillapp.api.messages.common;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonPropertyOrder({
		"html",
		"text",
		"subject",
		"from_email",
		"from_name",
		"to",
		"merge",
		"merge_language",
		"merge_vars",
		"attachments"
})
public class Message {

	@JsonProperty("html")
	private String html;
	@JsonProperty("text")
	private String text;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("from_email")
	private String fromEmail;
	@JsonProperty("from_name")
	private String fromName;
	@JsonProperty("to")
	private List<To> to = new ArrayList<To>();

	@JsonProperty("merge")
	private boolean merge = false;
	@JsonProperty("merge_language")
	private MergeLanguage mergeLanguage = MergeLanguage.mailchimp;
	@JsonProperty("merge_vars")
	private List<MergeVar> mergeVars = new ArrayList<MergeVar>();
	@JsonProperty("preserve_recipients")
	private boolean preserveRecipients = false;

	@JsonProperty("attachments")
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private List<Attachment> attachments = new ArrayList<Attachment>();


	public Message(final List<To> to, final String fromEmail, final String subject, final String html) {
		this.to = to;
		this.fromEmail = fromEmail;
		this.subject = subject;
		this.html = html;
	}

	public Message(final List<To> to, final String fromEmail, final String fromName, final String subject, final String html) {
		this.to = to;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.subject = subject;
		this.html = html;
	}

	public Message(final List<To> to, final String fromEmail, final String subject, final String html, final List<Attachment> attachments) {
		this.to = to;
		this.fromEmail = fromEmail;
		this.subject = subject;
		this.html = html;
		this.attachments = attachments;
	}

	public Message(final List<To> to, final String fromEmail, final String fromName, final String subject, final String html,
			final List<Attachment> attachments) {
		this.to = to;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.subject = subject;
		this.html = html;
		this.attachments = attachments;
	}

	public Message(final List<To> to, final List<MergeVar> mergeVars) {
		this.to = to;
		this.merge = true;
		this.mergeVars = mergeVars;
	}

	public Message(final List<To> to, final List<MergeVar> mergeVars, final List<Attachment> attachments) {
		this.to = to;
		this.merge = true;
		this.mergeVars = mergeVars;
		this.attachments = attachments;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(final String html) {
		this.html = html;
	}

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(final String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(final String fromName) {
		this.fromName = fromName;
	}

	public List<To> getTo() {
		return to;
	}

	public void setTo(final List<To> to) {
		this.to = to;
	}

	public boolean isMerge() {
		return merge;
	}

	public void setMerge(final boolean merge) {
		this.merge = merge;
	}

	public MergeLanguage getMergeLanguage() {
		return mergeLanguage;
	}

	public void setMergeLanguage(final MergeLanguage mergeLanguage) {
		this.mergeLanguage = mergeLanguage;
	}

	public List<MergeVar> getMergeVars() {
		return mergeVars;
	}

	public void setMergeVars(final List<MergeVar> mergeVars) {
		this.mergeVars = mergeVars;
	}

	public boolean isPreserveRecipients() {
		return preserveRecipients;
	}

	public void setPreserveRecipients(final boolean preserveRecipients) {
		this.preserveRecipients = preserveRecipients;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(final List<Attachment> attachments) {
		this.attachments = attachments;
	}

}
