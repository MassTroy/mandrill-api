package com.mandrillapp.api.messages.common;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
		"rcpt",
		"vars"
})
public class MergeVar {

	@JsonProperty("rcpt")
	private String rcpt;
	@JsonProperty("vars")
	private List<NameContent> vars = new ArrayList<NameContent>();

	public MergeVar(final String rcpt, final List<NameContent> vars) {
		this.rcpt = rcpt;
		this.vars = vars;
	}

	public String getRcpt() {
		return rcpt;
	}

	public void setRcpt(final String rcpt) {
		this.rcpt = rcpt;
	}

	public List<NameContent> getVars() {
		return vars;
	}

	public void setVars(final List<NameContent> vars) {
		this.vars = vars;
	}

}
