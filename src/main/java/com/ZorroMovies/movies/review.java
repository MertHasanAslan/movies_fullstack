package com.ZorroMovies.movies;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class review {

    @Id
    private ObjectId id;

    private String review_body;

    public review() {   }

    public review(ObjectId id, String review_body){
        this.id = id;
        this.review_body = review_body;
    }

    public review(String review_body){
        this.review_body = review_body;
    }

    public ObjectId get_id() { return id; }
    public void set_id(ObjectId id) { this.id = id; }

    public String get_review_body() { return review_body; }
    public void set_review_body(String review_body) {this.review_body = review_body; }


}
