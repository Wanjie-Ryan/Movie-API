package com.movies.MoviesAPI;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
// the annotation Document tells the compiler that this file is for creating a document in the database
public class Movie {

//    over here we will have the private datas

    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailer_link;



}
