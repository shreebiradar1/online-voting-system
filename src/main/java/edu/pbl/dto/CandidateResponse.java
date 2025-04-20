package edu.pbl.dto;

public class CandidateResponse {
	private Long CandidateId;
	private String name;
	private int voteCount;
	
	private int responseCode;
	private String responseMsg;
	
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
