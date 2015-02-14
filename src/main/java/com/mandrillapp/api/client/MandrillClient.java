package com.mandrillapp.api.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.mandrillapp.api.messages.send.Send;
import com.mandrillapp.api.messages.send.SendResponse;
import com.mandrillapp.api.messages.sendtemplate.SendTemplate;
import com.mandrillapp.api.messages.sendtemplate.SendTemplateResponse;

public class MandrillClient {
	private static final String MANDRILL_BASE_URL = "https://mandrillapp.com/api/1.0/";
	private static final String SEND = "messages/send.json";
	private static final String SEND_TEMPLATE = "messages/send-template.json";

	private final String apiKey;

	public MandrillClient(final String apiKey) {
		this.apiKey = apiKey;
	}

	public Map<String, SendResponse> send(final Send request) {
		request.setKey(apiKey);
		RestTemplate restTemplate = new RestTemplate();
		String url = MANDRILL_BASE_URL + SEND;
		SendResponse[] resp = restTemplate.postForObject(url, request, SendResponse[].class);

		Map<String, SendResponse> responses = new HashMap<String, SendResponse>();
		for (SendResponse response : resp) {
			responses.put(response.getEmail(), response);
		}
		return responses;
	}

	public Map<String, SendTemplateResponse> sendTemplate(final SendTemplate request) {
		request.setKey(apiKey);
		RestTemplate restTemplate = new RestTemplate();
		String url = MANDRILL_BASE_URL + SEND_TEMPLATE;
		SendTemplateResponse[] resp = restTemplate.postForObject(url, request, SendTemplateResponse[].class);

		Map<String, SendTemplateResponse> responses = new HashMap<String, SendTemplateResponse>();
		for (SendTemplateResponse response : resp) {
			responses.put(response.getEmail(), response);
		}
		return responses;
	}

}