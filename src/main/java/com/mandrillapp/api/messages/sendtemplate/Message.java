package com.mandrillapp.api.messages.sendtemplate;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonPropertyOrder({
	"to",
	"merge",
	"merge_language",
	"merge_vars",
	"attachments"
})
public class Message {

	@JsonProperty("to")
	private List<To> to = new ArrayList<To>();
	@JsonProperty("merge")
	private boolean merge = true;
	@JsonProperty("merge_language")
	private MergeLanguage mergeLanguage = MergeLanguage.mailchimp;
	@JsonProperty("merge_vars")
	private List<MergeVar> mergeVars = new ArrayList<MergeVar>();
	@JsonProperty("attachments")
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private List<Attachment> attachments = new ArrayList<Attachment>();

	public Message(final List<To> to, final List<MergeVar> mergeVars) {
		this.to = to;
		this.mergeVars = mergeVars;
	}

	public Message(final List<To> to, final List<MergeVar> mergeVars, final List<Attachment> attachments) {
		this.to = to;
		this.mergeVars = mergeVars;
		this.attachments = attachments;
	}

	@JsonProperty("to")
	public List<To> getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(final List<To> to) {
		this.to = to;
	}

	@JsonProperty("merge")
	public boolean isMerge() {
		return merge;
	}

	@JsonProperty("merge")
	public void setMerge(final boolean merge) {
		this.merge = merge;
	}

	@JsonProperty("merge_language")
	public MergeLanguage getMergeLanguage() {
		return mergeLanguage;
	}

	@JsonProperty("merge_language")
	public void setMergeLanguage(final MergeLanguage mergeLanguage) {
		this.mergeLanguage = mergeLanguage;
	}

	@JsonProperty("merge_vars")
	public List<MergeVar> getMergeVars() {
		return mergeVars;
	}

	@JsonProperty("merge_vars")
	public void setMergeVars(final List<MergeVar> mergeVars) {
		this.mergeVars = mergeVars;
	}

	@JsonProperty("attachments")
	public List<Attachment> getAttachments() {
		return attachments;
	}

	@JsonProperty("attachments")
	public void setAttachments(final List<Attachment> attachments) {
		this.attachments = attachments;
	}

}
