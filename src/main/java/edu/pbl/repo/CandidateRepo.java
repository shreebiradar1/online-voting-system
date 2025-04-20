package edu.pbl.repo;
import edu.pbl.entity.Candidate;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate, Long> {
	public Optional<Candidate> findByName(String name);
}
