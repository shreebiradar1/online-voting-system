package edu.pbl.dto;

import org.springframework.stereotype.Component;

@Component
public class CandidateRequest {
	private Long CandidateId;
	private String name;
	private int voteCount;
	
	public Long getCandidateId() {
		return CandidateId;
	}
	public void setCandidateId(Long candidateId) {
		CandidateId = candidateId;
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
