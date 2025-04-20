package edu.pbl.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.pbl.entity.Candidate;

@Component
public class CandidateResponse {
	private int responseCode;
	private String responseMsg;

	@Autowired
	private CandidateRequest request;

	public CandidateRequest getRequest() {
		return request;
	}

	public void setRequest(CandidateRequest request) {
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

	public void setRequest(Candidate canditable) {
		request.setCandidateId(canditable.getId());
		request.setName(canditable.getName());
		request.setVoteCount(canditable.getVoteCount());
		
	}

}
