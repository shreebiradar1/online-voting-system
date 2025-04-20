package edu.pbl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Voter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long voterid;

	private String name;

	@Column(unique = true)
	private String email;

	private String password;

	private boolean hasVoted = false;

	// Constructors
	public Voter() {
	}

	public Voter(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	// Getters and Setters
	public Long getId() {
		return voterid;
	}

	public void setId(Long voterid) {
		this.voterid = voterid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHasVoted() {
		return hasVoted;
	}

	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
}
