package com.ZorroMovies.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class movieController {
    @Autowired
    private movieService movie_service;

    @GetMapping("/get_all")
    public ResponseEntity<List<movie>> get_all_movies(){
        return new ResponseEntity<List<movie>>(movie_service.all_movies(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<movie>> get_single_movie(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<movie>>(movie_service.single_movie(id), HttpStatus.OK);
    }

    @GetMapping("/imdb_id/{imdb_id}")
    public ResponseEntity<Optional<movie>> get_single_movie_by_imdb_id(@PathVariable String imdb_id){
        return new ResponseEntity<Optional<movie>>(movie_service.single_movie_by_imdb_id(imdb_id), HttpStatus.OK);
    }
}
