package edu.pbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.pbl.entity.Candidate;
import edu.pbl.entity.Voter;
import edu.pbl.services.VoterService;

@RestController
@RequestMapping(path="/voter", produces = { "application/json", "application/xml" }, consumes = { "application/json",
"application/xml" })
public class VoterController {

    @Autowired
    private VoterService voterService;

    @PostMapping("/signup")
    public Voter signUp(@RequestBody Voter voter) {
        return voterService.signUp(voter);
    }

    @PostMapping("/login")
    public Voter login(@RequestBody Voter voter) {
        return voterService.login(voter.getEmail(), voter.getPassword());
    }

    @PostMapping("/vote/{voterId}")
    public String vote(@PathVariable Long voterId, @RequestBody Candidate candidateId) {
    	Candidate c = new Candidate();
        return voterService.vote(voterId, c.getName());
    }
//    @PostMapping("/vote")
//    public String vote(@RequestParam Long candidateId, @RequestParam Long voterId) {
//        return voterService.vote(candidateId, voterId);
//    }
}
