package edu.pbl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pbl.dto.CandidateRequest;
import edu.pbl.dto.CandidateResponse;
import edu.pbl.entity.Candidate;
import edu.pbl.repo.CandidateRepo;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepo candidateRepo;
    
    @Autowired private CandidateResponse response;

    //working
    public CandidateResponse addCandidate(CandidateRequest candidate) {
    	
    	Candidate canditable = new Candidate();
    	canditable.setId(candidate.getCandidateId());
    	canditable.setName(candidate.getName());
    	canditable.setVoteCount(candidate.getVoteCount());
    	
    	candidateRepo.save(canditable);
    	
    		response.setResponseCode(200);
    		response.setResponseMsg("New Candidate added successfully");
    		response.setRequest(canditable);
    		return response;
    }

    //working
    public List<Candidate> getAllCandidates() {
    	
        return candidateRepo.findAll();
    }

    public CandidateResponse getCandidateById(Long id) {
    	candidateRepo.findById(id).orElse(null);
    	if(candidateRepo.findById(id) == null) {
    		response.setResponseCode(400);
    		response.setResponseMsg("Candidate not found");
    	}
    	else {
    		response.setResponseCode(200);
    		response.setResponseMsg("Candidate found");
    		response.setRequest(candidateRepo.findById(id).orElse(null));
    		
    	}
        return response;
    }
    public CandidateResponse getCandidateByName(String name) {
//    	Candidate can = new Candidate();
    	if(candidateRepo.findByName(name) == null){
    		response.setResponseCode(400);
    		response.setResponseMsg("Candidate not found");
    	}
    	else {
    		response.setResponseCode(200);
    		response.setResponseMsg("Candidate found");
    		response.setRequest(candidateRepo.findByName(name));
    		
    	}
    	
    	return response;
    }
}
