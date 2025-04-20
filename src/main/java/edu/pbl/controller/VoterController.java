package edu.pbl.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.pbl.dto.VoterRequest;
import edu.pbl.dto.VoterResponse;
import edu.pbl.entity.Candidate;
import edu.pbl.entity.Voter;
import edu.pbl.services.VoterService;

@RestController
@RequestMapping("/voter")
public class VoterController {

    @Autowired
    private VoterService voterService;

    @PostMapping("/signup")
    public VoterResponse signUp(@RequestBody VoterRequest voter) {
        return voterService.signUp(voter);
    }

    @PostMapping("/login")
    public Voter login(@RequestBody Voter voter) {
        return voterService.login(voter.getEmail(), voter.getPassword());
    }

    @PostMapping("/vote")
    public String vote(@RequestParam Long voterId, @RequestParam Long candidateId) {
        return voterService.vote(voterId, candidateId);
    }

}
