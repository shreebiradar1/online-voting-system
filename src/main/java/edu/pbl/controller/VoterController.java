package edu.pbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String login(@RequestBody Voter voter) {
        Voter loggedIn = voterService.login(voter.getEmail(), voter.getPassword());
        if(loggedIn != null) {
        	return "Login successful. Voter ID: " + loggedIn.getId();
        }
        else {
        	return "Login failed. Invalid email or password.";
        }
    }

    @PostMapping("/vote")
    public String vote(@RequestParam Long voterId, @RequestParam Long candidateId) {
        return voterService.vote(voterId, candidateId);
    }
}
