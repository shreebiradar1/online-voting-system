package edu.pbl.dto;

public class VoterResponse {
	private Long voterId;
	private String email;
	private boolean hasVoted;
	
	private int responseCode;
	private String responseMsg;
	
	public Long getVoterId() {
		return voterId;
	}
	public void setVoterId(Long voterId) {
		this.voterId = voterId;
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
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
}
