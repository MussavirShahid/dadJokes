package edu.greenriverdev.sdev.dadjokes.controller;

import edu.greenriverdev.sdev.dadjokes.domain.DadJoke;
import edu.greenriverdev.sdev.dadjokes.service.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DadJokeController {

    private DadJokeService service;

    public DadJokeController(DadJokeService service)
    {
        this.service = service;
    }

    @GetMapping("/jokes")
    public List<DadJoke> getJoke()
    {
        return service.getall();
    }

    @PostMapping("/jokes")
    public DadJoke addJoke()
    {
        return service.addJoke(new DadJoke());
    }

    @PutMapping("/jokes/{id}")
    public DadJoke updateJoke(@PathVariable int id, String jokeText)
    {

        return service.update(id, jokeText);
    }

    @DeleteMapping("/jokes/delete/{id}")
    public void delete(@PathVariable int id)
    {
        service.delete(id);
    }






}
