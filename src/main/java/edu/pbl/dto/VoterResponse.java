package edu.pbl.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.pbl.entity.Voter;
@Component
public class VoterResponse {
	private int responseCode;
	private String responseMsg;

	@Autowired
	public VoterRequest request;
	
	public VoterRequest getRequest() {
		return request;
	}
	public void setRequest(VoterRequest request) {
		this.request = request;
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
	public void setRequest(Voter voter) {
		request.setVoterid(voter.getId());
		request.setName(voter.getName());
		request.setEmail(voter.getEmail());
		request.setHasVoted(voter.isHasVoted());
		
	}
}
