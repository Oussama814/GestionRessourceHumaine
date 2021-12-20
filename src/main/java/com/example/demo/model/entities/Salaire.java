package com.example.demo.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Salaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id ;
	
	@Column
	private float nette;
	
	@Column
	private float brute;
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getNette() {
		return nette;
	}

	public void setNette(float nette) {
		this.nette = nette;
	}

	public float getBrute() {
		return brute;
	}

	public void setBrute(float brute) {
		this.brute = brute;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
