package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.*;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "Mentorskill")
public class MentorSkill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    
//link to Mentor.java
    
	/*
	 * @Column(name="mentor_id") private Long mentor_id;
	 */
 //unique courses must have unique mid and folowing all the entity
    
    //import sid from technology.java
	/*
	 * @Column(name="skill_id") private Long skill_id;
	 */
    
    @Column(name="self_rating")
    private Double self_rating;

    @Column(name="yoe")
    private Integer yoe;

    @Column(name="trainings_delivered")
    private Integer trainings_delivered ;
    
	/*
	 * @Column(name="facilities_offered") private String facilities_offered;
	 */
    @Column(name = "technology_name")
    private String technology_name ;
    
    @Column(name = "prerequites") 
    private String prerequites ;
    
    @Column(name="toc")
    private String toc ;

    @Column(name="start_date")
    private String start_date ;

    @Column(name="end_date")
    private String end_date ;
    
    @ManyToMany(mappedBy="mentorskills",fetch = FetchType.EAGER)
    @JsonBackReference
    private Set<Mentor> mentors;

    public Long getId() {
		return id;
	}


	public Double getSelf_rating() {
		return self_rating;
	}


	public void setSelf_rating(Double self_rating) {
		this.self_rating = self_rating;
	}


	public Integer getYoe() {
		return yoe;
	}


	public void setYoe(Integer yoe) {
		this.yoe = yoe;
	}


	public Integer getTrainings_delivered() {
		return trainings_delivered;
	}


	public void setTrainings_delivered(Integer trainings_delivered) {
		this.trainings_delivered = trainings_delivered;
	}


	public String getTechnology_name() {
		return technology_name;
	}


	public void setTechnology_name(String technology_name) {
		this.technology_name = technology_name;
	}


	public String getPrerequites() {
		return prerequites;
	}


	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}


	public String getToc() {
		return toc;
	}


	public void setToc(String toc) {
		this.toc = toc;
	}


	public String getStart_date() {
		return start_date;
	}


	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}


	public String getEnd_date() {
		return end_date;
	}


	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	public MentorSkill(Double self_rating, Integer yoe, Integer trainings_delivered, String technology_name,
			String prerequites, String toc, String start_date, String end_date) {
		super();
		this.self_rating = self_rating;
		this.yoe = yoe;
		this.trainings_delivered = trainings_delivered;
		this.technology_name = technology_name;
		this.prerequites = prerequites;
		this.toc = toc;
		this.start_date = start_date;
		this.end_date = end_date;
	}


	public Set<Mentor> getMentors() {
		return mentors;
	}


	public void setMentors(Set<Mentor> mentors) {
		this.mentors = mentors;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public MentorSkill() {
		super();
		// TODO Auto-generated constructor stub
	}




    
	


}
