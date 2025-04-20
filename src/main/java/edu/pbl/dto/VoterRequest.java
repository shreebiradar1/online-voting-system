package edu.pbl.dto;

public class VoterRequest {
	private Long voterid;
	private String name;
	private String email;
	private boolean hasVoted;
	public Long getVoterid() {
		return voterid;
	}
	public void setVoterid(Long voterid) {
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
	public boolean isHasVoted() {
		return hasVoted;
	}
	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
	
}
