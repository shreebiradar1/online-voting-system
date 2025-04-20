package edu.pbl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pbl.entity.Candidate;
import edu.pbl.repo.CandidateRepo;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepo candidateRepo;

    public Candidate addCandidate(Candidate candidate) {
        return candidateRepo.save(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateRepo.findAll();
    }

    public Candidate getCandidateById(Long id) {
        return candidateRepo.findById(id).orElse(null);
    }
}
