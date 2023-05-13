package br.com.fiap.FBIInterpol.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "procurados")
public class Procurado {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Long id;

	    @Column(name="name")
	    public String title;

	    @Column(name="description")
	    public String description;

	    @Column(name="race")
	    public String race;

	    @Column(name="sex")
	    public String sex;

	    @Column(name = "weight")
	    public String weight;
	    
	    @Column(name = "height")
	    public String height;

	    @Column(name="eyes_color")
	    public String eyes_color;

	    @Column(name="hair_color")
	    public String hair_color;

	    @Column(name="remarks")
	    public String remarks;

	    @Column(name = "rewardText")
	    public String rewardText;

	    @Column(name = "age")
	    public String age;
	    
	    @Column(name="nationalities")
	    public String nationalities;
	    
	    @Column(name="date_of_birth")
	    public Calendar date_of_birth;

		public Procurado() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String name) {
			this.title = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRace() {
			return race;
		}

		public void setRace(String race) {
			this.race = race;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getEyes_color() {
			return eyes_color;
		}

		public void setEyes_color(String eyes_color) {
			this.eyes_color = eyes_color;
		}

		public String getHair_color() {
			return hair_color;
		}

		public void setHair_color(String hair_color) {
			this.hair_color = hair_color;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public String getRewardText() {
			return rewardText;
		}

		public void setRewardText(String rewardText) {
			this.rewardText = rewardText;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getNationalities() {
			return nationalities;
		}

		public void setNationalities(String nationalities) {
			this.nationalities = nationalities;
		}

		public Calendar getDate_of_birth() {
			return date_of_birth;
		}

		public void setDate_of_birth(Calendar date_of_birth) {
			this.date_of_birth = date_of_birth;
		}

		@Override
		public String toString() {
			return "Wanted {id=" + id + ", name=" + title + ", description=" + description + ", race=" + race
					+ ", sex=" + sex + ", weight=" + weight + ", height=" + height + ", eyes_color=" + eyes_color
					+ ", hair_color=" + hair_color + ", remarks=" + remarks + ", rewardText=" + rewardText + ", age="
					+ age + ", nationalities=" + nationalities + ", date_of_birth=" + date_of_birth + "}";
		}
		


}
