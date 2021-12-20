package com.example.demo.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToOne;

import javax.validation.constraints.Email;

@Entity
/*@Inheritance(strategy = InheritanceType.JOINED)
@TableGenerator(name = "USER_GEN", table = "Id_GEN",allocationSize = 1)
@DiscriminatorColumn(name = "grade")*/
public class User {


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id ;
	
	@Column(nullable = false)
	 private String email;
	
	@Column(nullable = false )
	 private String mdp;
	
	@Column(unique = true)
	 private String nom;
	
	 @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	    
	    private Salaire salaire;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Column(unique = true)
	 private String prenom;
	
	@Email
	@Column(nullable = false)
	 private String tel;
	
	@Column(nullable = false)
	 private String adresse;
	@Column(nullable = false)
	 private String grade;
	
	
}

