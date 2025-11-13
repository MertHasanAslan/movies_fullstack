package com.ZorroMovies.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movieService {
    @Autowired
    private movieRepository movie_repository;

    public List<movie> all_movies(){
        return movie_repository.findAll();
    }

    public Optional<movie> single_movie(ObjectId id){
        return movie_repository.findById(id);
    }

    public Optional<movie> single_movie_by_imdb_id(String imdb_id){
        return movie_repository.findMovieByImdbId(imdb_id);
    }
}
