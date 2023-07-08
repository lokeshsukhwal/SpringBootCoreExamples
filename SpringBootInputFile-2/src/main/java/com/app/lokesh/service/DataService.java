package com.app.lokesh.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.app")
public class DataService {

	// Primitive Type Dependency
	private int code;
	private String name;

	// Collection Type Dependency
	private String[] arrayColors;
	private List<String> TypeOfAnimalList;
	private Set<String> BodyPartsSet;

	private Map<String, Integer> languagesMap;
	
	// Reference Type Dependency
	private ProcessService service;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getArrayColors() {
		return arrayColors;
	}

	public void setArrayColors(String[] arrayColors) {
		this.arrayColors = arrayColors;
	}

	public List<String> getTypeOfAnimalList() {
		return TypeOfAnimalList;
	}

	public void setTypeOfAnimalList(List<String> typeOfAnimalList) {
		TypeOfAnimalList = typeOfAnimalList;
	}

	public Set<String> getBodyPartsSet() {
		return BodyPartsSet;
	}

	public void setBodyPartsSet(Set<String> bodyPartsSet) {
		BodyPartsSet = bodyPartsSet;
	}

	public Map<String, Integer> getLanguagesMap() {
		return languagesMap;
	}

	public void setLanguagesMap(Map<String, Integer> languagesMap) {
		this.languagesMap = languagesMap;
	}

	public ProcessService getService() {
		return service;
	}

	public void setService(ProcessService service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "DataService [code=" + code + ", name=" + name + ", arrayColors=" + Arrays.toString(arrayColors)
				+ ", TypeOfAnimalList=" + TypeOfAnimalList + ", BodyPartsSet=" + BodyPartsSet + ", languagesMap="
				+ languagesMap + ", service=" + service + "]";
	}

}
