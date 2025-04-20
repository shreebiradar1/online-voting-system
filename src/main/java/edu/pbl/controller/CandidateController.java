package edu.pbl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pbl.dto.CandidateRequest;
import edu.pbl.dto.CandidateResponse;
import edu.pbl.entity.Candidate;
import edu.pbl.services.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public CandidateResponse addCandidate(@RequestBody CandidateRequest candidate) {
        return candidateService.addCandidate(candidate);
    }

    @GetMapping("/all")
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping(path="/id/{id}")
    public CandidateResponse getCandidateById(@PathVariable Long id) {
        return candidateService.getCandidateById(id);
    }
    
    @GetMapping(path="/name/{name}")
    public CandidateResponse getCandidateByName(@PathVariable String name) {
    	return candidateService.getCandidateByName(name);
    }
}
