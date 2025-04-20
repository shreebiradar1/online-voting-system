package edu.pbl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pbl.dto.VoterRequest;
import edu.pbl.dto.VoterResponse;
import edu.pbl.entity.Candidate;
import edu.pbl.entity.Voter;
import edu.pbl.repo.CandidateRepo;
import edu.pbl.repo.VoterRepo;

@Service
public class VoterService {

	@Autowired
	private VoterRepo voterRepo;

	@Autowired
	private CandidateRepo candidateRepo;

	@Autowired
	private VoterResponse response;

	public VoterResponse signUp(VoterRequest voter) {
		Voter user = new Voter();
		user.setId(voter.getVoterid());
		user.setName(voter.getName());
		user.setHasVoted(voter.isHasVoted());
		user.setEmail(voter.getEmail());

		voterRepo.save(user);

		response.setResponseCode(200);
		response.setResponseMsg("User has been successfully sign-up successfully");
		response.setRequest(voter);
		return response;
	}

	public Voter login(String email, String password) {
		Voter voter = voterRepo.findByEmail(email);

		if (voter != null && voter.getPassword().equals(password)) {
			return voter;
		}
		return voter;

	}

	 public String vote(Long voterId, Long candidateId) {
	        Voter voter = voterRepo.findById(voterId).orElse(null);
	        Candidate candidate = candidateRepo.findById(candidateId).orElse(null);

	        if (voter == null || candidate == null) {
	            return "Invalid voter or candidate ID.";
	        }

	        if (voter.isHasVoted()) {
	            return "You have already voted.";
	        }

	        voter.setHasVoted(true);
	        candidate.setVoteCount(candidate.getVoteCount() + 1);

	        voterRepo.save(voter);
	        candidateRepo.save(candidate);

	        return "Vote cast successfully!";
	    }
}
