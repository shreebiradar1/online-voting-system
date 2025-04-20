package edu.pbl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pbl.entity.Voter;

public interface VoterRepo extends JpaRepository<Voter, Long> {
	Voter findByEmail(String email);
	
}
