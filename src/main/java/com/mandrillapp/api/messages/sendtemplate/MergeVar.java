package com.mandrillapp.api.messages.sendtemplate;

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
	private List<Var> vars = new ArrayList<Var>();

	public MergeVar(String rcpt, List<Var> vars) {
		this.rcpt = rcpt;
		this.vars = vars;
	}

	@JsonProperty("rcpt")
	public String getRcpt() {
		return rcpt;
	}

	@JsonProperty("rcpt")
	public void setRcpt(String rcpt) {
		this.rcpt = rcpt;
	}

	@JsonProperty("vars")
	public List<Var> getVars() {
		return vars;
	}

	@JsonProperty("vars")
	public void setVars(List<Var> vars) {
		this.vars = vars;
	}

}
