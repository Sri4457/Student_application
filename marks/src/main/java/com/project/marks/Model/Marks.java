package com.project.marks.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="marks")
public class Marks {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="stdid", nullable=false)
	private String stdid;
	
	@Column(name="maxmarks", nullable=false)
	private double maxmarks;
	
	@Column(name="minmarks",nullable=false)
	private double minmarks;
	
	@Column(name="avgmarks", nullable=false)
	private double avgmarks;

	

	public String getStdid() {
		return stdid;
	}

	public void setStdid(String stdid) {
		this.stdid = stdid;
	}

	public double getMinmarks() {
		return minmarks;
	}

	public void setMinmarks(double minmarks) {
		this.minmarks = minmarks;
	}

	public double getAvgmarks() {
		return avgmarks;
	}

	public void setAvgmarks(double avgmarks) {
		this.avgmarks = avgmarks;
	}

	public Marks(String stdid, double maxmarks, double minmarks, double avgmarks) {
		super();
		this.stdid = stdid;
		this.maxmarks = maxmarks;
		this.minmarks = minmarks;
		this.avgmarks = avgmarks;
	}

	public Marks() {
		super();
	}

	public long getId() {
		return id;
	}

	public double getMaxmarks() {
		return maxmarks;
	}

	public void setMaxmarks(double maxmarks) {
		this.maxmarks = maxmarks;
	}
	
	
	
}
