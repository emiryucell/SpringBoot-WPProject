package sen3004.healthyapp.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Person {

	@NotEmpty
	private String name;
	@NotEmpty
	private String surName;
	@NotEmpty
	private String gender;
	@NotNull
	@Positive
	@Min(value = 40)
	@Max(value = 200)
	private Double weight;
	@NotNull
	@Positive
	@Min(value = 1)
	@Max(value = 3)
	private Double height;
	@NotNull
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate birthday;
	@NotEmpty
	private List<String> emotions;

	public int getAge() {
		return Period.between(birthday, LocalDate.now()).getYears();
	}

	public double getBodyMassIndex() {
		return weight / (height * height);
	}

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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
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
