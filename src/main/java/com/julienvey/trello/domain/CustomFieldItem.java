package com.julienvey.trello.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFieldItem extends TrelloEntity {
	private String id;
	private String idValue;
	private String idCustomField;
	private String idModel;
	private String modelType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdValue() {
		return idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	public String getIdCustomField() {
		return idCustomField;
	}
	public void setIdCustomField(String idCustomField) {
		this.idCustomField = idCustomField;
	}
	public String getIdModel() {
		return idModel;
	}
	public void setIdModel(String idModel) {
		this.idModel = idModel;
	}
	public String getModelType() {
		return modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

}
