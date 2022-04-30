package sen3004.healthyapp.model;

import java.util.List;
import javax.validation.constraints.*;

public class Person {
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String surName;
	@Min(value=10)
	@Max(value=100)
	private Integer age;
	@NotEmpty
	private String gender;
	@Min(value=40)
	@Max(value=200)
	private Double weight;
	@Min(value=1)
	@Max(value=3)
	private Double height;
	@NotEmpty
	private List<String> emotions;
	
	
	public List<String> getEmotions() {
		return emotions;
	}
	public void setEmotions(List<String> emotions) {
		this.emotions = emotions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	

}
