package com.amsidh.mvc.slowapiwebapplication.initialize;

import com.amsidh.mvc.slowapiwebapplication.entity.Movie;
import com.amsidh.mvc.slowapiwebapplication.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Data
@AllArgsConstructor
public class InitializeMovieData implements CommandLineRunner {
    private final MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {

        //movieRepository.deleteAll();
       // movieRepository.saveAllAndFlush(getMovies());
        System.out.println("==================================Data Loading is completed===================================");
    }

    private List<Movie> getMovies() {
        Random random = new Random();
        return Stream.generate(() -> {
                    Long randomLong = Math.abs(random.nextLong());
                    System.out.println(randomLong);
                    return Movie.builder().title("Title-" + randomLong).build();
                })
                .limit(10000000).collect(Collectors.toList());
    }
}
