package com.julienvey.trello.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Plugin extends TrelloEntity {
	
	private String id;
	private String author;
	private List<String> capabilities;
	private List<String> categories;
	private String iframeConnectorUrl;
	private String name;
	private String privacyUrl;
	private String supportEmail;
	private String url;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<String> getCapabilities() {
		return capabilities;
	}
	public void setCapabilities(List<String> capabilities) {
		this.capabilities = capabilities;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public String getIframeConnectorUrl() {
		return iframeConnectorUrl;
	}
	public void setIframeConnectorUrl(String iframeConnectorUrl) {
		this.iframeConnectorUrl = iframeConnectorUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrivacyUrl() {
		return privacyUrl;
	}
	public void setPrivacyUrl(String privacyUrl) {
		this.privacyUrl = privacyUrl;
	}
	public String getSupportEmail() {
		return supportEmail;
	}
	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
