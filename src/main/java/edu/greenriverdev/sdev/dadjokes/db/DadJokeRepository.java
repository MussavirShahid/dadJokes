package edu.greenriverdev.sdev.dadjokes.db;


import edu.greenriverdev.sdev.dadjokes.domain.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {

}
