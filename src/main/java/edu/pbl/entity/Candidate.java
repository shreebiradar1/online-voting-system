package edu.pbl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long candidateid;

	private String name;

	private int voteCount = 0;

	// Constructors
	public Candidate() {
	}

	public Candidate(String name) {
		this.name = name;
	}

	// Getters and Setters
	public Long getId() {
		return candidateid;
	}

	public void setId(Long candidateid) {
		this.candidateid = candidateid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
}