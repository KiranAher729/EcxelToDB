package com.kiranaher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allergy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="allergy_id")
	private String allergy_id;
	
	@Column(name="allergy_type")
	private String type;
	
	@Column(name="allergy_name")
	private String name;
	
	@Column(name="allergy_source")
	private String source;
	
	@Column(name="isoform")
	private String isoform;
	
	@Column(name="allerginicity")
	private String allerginicity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAllergy_id() {
		return allergy_id;
	}

	public void setAllergy_id(String allergy_id) {
		this.allergy_id = allergy_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIsoform() {
		return isoform;
	}

	public void setIsoform(String isoform) {
		this.isoform = isoform;
	}

	public String getAllerginicity() {
		return allerginicity;
	}

	public void setAllerginicity(String allerginicity) {
		this.allerginicity = allerginicity;
	}

	@Override
	public String toString() {
		return "Allergy [id=" + id + ", allergy_id=" + allergy_id + ", type=" + type + ", name=" + name + ", source="
				+ source + ", isoform=" + isoform + ", allerginicity=" + allerginicity + "]";
	}

	
	
	
}
