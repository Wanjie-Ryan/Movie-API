package com.movies.MoviesAPI;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    // Autowired, instantiates the MovieRepository class

    private MovieRepository movieRepository;
    public List<Movie> AllMovies (){

        return movieRepository.findAll();
    }

    // the optional means that the response might be null
    public Optional <Movie> singleMovie (String imdbId ){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}

