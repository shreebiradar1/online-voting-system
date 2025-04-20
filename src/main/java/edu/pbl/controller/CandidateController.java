package edu.pbl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pbl.entity.Candidate;
import edu.pbl.services.CandidateService;

@RestController
@RequestMapping(path="/candidate", produces = { "application/json", "application/xml" }, consumes = { "application/json",
"application/xml" })
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return candidateService.addCandidate(candidate);
    }

    @GetMapping("/all")
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/id/{id}")
    public Candidate getCandidateById(@PathVariable Long id) {
        return candidateService.getCandidateById(id);
    }
    
    @GetMapping("/name/{name}")
    public Candidate getCandidateByName(@PathVariable String name) {
    	return candidateService.getCandidateByName(name);
    }
}
