package com.amsidh.mvc.slowapiwebapplication.controller;

import com.amsidh.mvc.slowapiwebapplication.entity.Movie;
import com.amsidh.mvc.slowapiwebapplication.repositories.MovieRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieController {
    private final MovieRepository movieRepository;

    /*@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getAllMovies() {
        log.info("................Calling getAllMovies method of MovieController..........................");
        List<Movie> movies = movieRepository.findAll();
        log.info("................Sending response from getAllMovies method of MovieController..........................");
        return movies;
    }

    @RequestMapping(value = "/{minRange}/{maxRange}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getAllMoviesInRange(@PathVariable(name = "minRange") Long minRange, @PathVariable(name = "maxRange") Long maxRange) {
        log.info("................Calling getAllMoviesInRange method of MovieController..........................");
        List<Movie> movies = movieRepository.findByIdBetween(minRange, maxRange);
        log.info("................Sending response from getAllMoviesInRange method of MovieController..........................");
        return movies;
    }
*/
    @PostMapping(value = "/ids", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getAllMoviesForIds(@RequestBody List<Long> ids) {
        log.info("................Calling getAllMoviesForIds method of MovieController..........................");
        List<Movie> movies = movieRepository.findAllById(ids);
        log.info("................Sending response from getAllMoviesForIds method of MovieController..........................");
        return movies;
    }

}
