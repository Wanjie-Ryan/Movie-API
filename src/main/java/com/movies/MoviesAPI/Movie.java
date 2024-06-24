//this piece of code is kind of same as the one for nodejs for creating models
package com.movies.MoviesAPI;
//This declares that the class belongs to the com.movies.MoviesAPI package.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
//org.bson.types.ObjectId: This import allows you to use the ObjectId type from BSON, typically used for MongoDB document IDs.
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//org.springframework.data.mongodb.core.mapping.Document: This import is for the @Document annotation which indicates that this class is a MongoDB document.
import java.util.List;
//java.util.List: This import allows you to use the List interface for collections.

@Document(collection = "movies")
//@Document(collection = "movies"): This annotation specifies that instances of this class will be stored in the "movies" collection in MongoDB.
// the annotation Document tells the compiler that this file is for creating a document in the database

@Data
// the data annotation from LOMBOK creates getters and setters

@AllArgsConstructor
// the annotation from LOMBOK creates a constructor with all the fields in the class

@NoArgsConstructor




public class Movie {

//    This declares the Movie class as public, meaning it can be accessed from other classes.
//    over here we will have the private datas
    @Id
//    the  annotation id tells the compiler tha the id is unique
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailer_link;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;



}
