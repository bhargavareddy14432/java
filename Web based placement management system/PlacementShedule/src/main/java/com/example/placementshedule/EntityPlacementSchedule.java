package com.example.placementshedule;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placementschedule")
public class EntityPlacementSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String date;
	
	private String qualification;
	
	private int year;

	public EntityPlacementSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntityPlacementSchedule(long id, String date, String qualification, int year) {
		super();
		this.id = id;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "EntityPlaceentSchedule [id=" + id + ", date=" + date + ", qualification=" + qualification + ", year="
				+ year + "]";
	}

	}
