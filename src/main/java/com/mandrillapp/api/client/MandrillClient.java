package com.mandrillapp.api.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.mandrillapp.api.messages.SendTemplate;
import com.mandrillapp.api.messages.sendtemplate.SendTemplateResponse;

public class MandrillClient {
	private static final String MANDRILL_BASE_URL = "https://mandrillapp.com/api/1.0/";
	private static final String SEND_TEMPLATE = "messages/send-template.json";

	public Map<String, SendTemplateResponse> sendTemplate(SendTemplate request) {
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