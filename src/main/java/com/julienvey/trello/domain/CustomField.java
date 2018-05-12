package com.julienvey.trello.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomField {	
	private String id;
	private String idModel;
	private String modelType;
	private String fieldGroup;
	private String name;
	private int pos;
	private String type;
	private List<CustomFieldOption> options;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getFieldGroup() {
		return fieldGroup;
	}

	public void setFieldGroup(String fieldGroup) {
		this.fieldGroup = fieldGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<CustomFieldOption> getOptions() {
		return options;
	}

	public void setOptions(List<CustomFieldOption> options) {
		this.options = options;
	}

	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class CustomFieldOption {
		private String id;
		private String idCustomField;
		private CustomFieldValue value;
		private String color;
		private int pos;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getIdCustomField() {
			return idCustomField;
		}
		public void setIdCustomField(String idCustomField) {
			this.idCustomField = idCustomField;
		}
		public CustomFieldValue getValue() {
			return value;
		}
		public void setValue(CustomFieldValue value) {
			this.value = value;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getPos() {
			return pos;
		}
		public void setPos(int pos) {
			this.pos = pos;
		}
		
		
	
	}
	
	
}
