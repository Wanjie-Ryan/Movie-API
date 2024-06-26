package com.movies.MoviesAPI;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
// the annotation, RestController tells the compiler that this file is for creating REST api
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieservice;
    @GetMapping

    public ResponseEntity<?> getallMovies (){

//        return new ResponseEntity<String>("All Moviessssss", HttpStatus.OK);

        return new ResponseEntity<List <Movie>>(movieservice.AllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")

//    the data fetched will be passed as a path variable and it will be converted to an object id called id
    public ResponseEntity<Optional <Movie>> getSingleMovie (@PathVariable ObjectId id){

        return new ResponseEntity<Optional <Movie>>(movieservice.singleMovie(id), HttpStatus.OK);
    }

}
