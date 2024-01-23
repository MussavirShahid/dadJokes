package edu.greenriverdev.sdev.dadjokes.service;

import edu.greenriverdev.sdev.dadjokes.db.DadJokeRepository;
import edu.greenriverdev.sdev.dadjokes.domain.DadJoke;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DadJokeService {

    private DadJokeRepository repository;
    public DadJokeService(DadJokeRepository repository)
    {
        this.repository = repository;
    }

    public List<DadJoke> getall()
    {
     List<DadJoke> dadJokes = repository.findAll();

     return Collections.unmodifiableList(dadJokes);
    }

    public void addJoke(DadJoke dadJoke)
    {
        repository.save(dadJoke);
    }

    public DadJoke update(int id, String newJoketext)
    {

       DadJoke currentjoke = repository.findById(id).orElseThrow();

        currentjoke.setJokeText(newJoketext);

       return repository.save(currentjoke);
    }

    public void delete(int id, String dadJoke)
    {
        repository.deleteById(id);
    }


}
