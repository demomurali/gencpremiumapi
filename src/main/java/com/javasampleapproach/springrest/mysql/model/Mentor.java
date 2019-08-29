package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "Mentor")
public class Mentor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Column(name="username")
    private String username;

    @Column(name="linkedin_url")
    private String linkedinUrl;

    @Column(name="password")
    private String password;
    
    @Column(name="contact")
    private Long contact;

    @Column(name="reg_datetime")
    private String regDatetime ;

    @Column(name="reg_code")
    private String regCode;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "mentor_details",
    inverseJoinColumns = @JoinColumn(name = "mentorskill_id"),
    joinColumns = @JoinColumn(name = "mentor_id"))
    @JsonManagedReference
    private Set<MentorSkill> mentorskills = new HashSet<MentorSkill>();
    
    public Set<MentorSkill> getMentorskills() {
		return mentorskills;
	}
	public void setMentorskills(Set<MentorSkill> mentorskills) {
		this.mentorskills = mentorskills;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(String regDatetime) {
		this.regDatetime = regDatetime;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public Mentor(String username, String linkedinUrl, String password, Long contact, String regDatetime,
			String regCode) {
		super();
		this.username = username;
		this.linkedinUrl = linkedinUrl;
		this.password = password;
		this.contact = contact;
		this.regDatetime = regDatetime;
		this.regCode = regCode;
	}
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

    
   
	
	

	
}
