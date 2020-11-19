import java.util.*;  

class Movie {
  private String title;
  private String studio;
  private String rating;

  public Movie(String titleInput, String studioInput, String ratingInput){
    title = titleInput;
    studio = studioInput;
    rating = ratingInput;
  }

  public Movie(String titleInput, String studioInput){
    title = titleInput;
    studio = studioInput;
  }

  public Movie(){
    title = "";
    studio = "";
    rating = "";
  }

  public Movie[] getPG(Movie[] movies){
    List<Movie> pgMoviesList = new ArrayList<Movie>();

    for (int i = 0; i < 0; i++){
      if (movies[i].rating == "PG"){
        pgMoviesList.add(movies[i]);
      }
    }

    Movie[] pgMoviesArray = new Movie[pgMoviesList.size()];
    for (int i = 0; i < pgMoviesList.size(); i++){
      pgMoviesArray[i] = pgMoviesList.get(i);
    }

    return pgMoviesArray;
  }
  public String getRating(){
    return rating;
  }

  public void changeRating(String newRating){
    rating = newRating;
  }

  public String getStudio(){
    return studio;
  }

  public void changeStudio(String newStudio){
    studio = newStudio;
  }

  public String getTitle(){
    return title;
  }

  public void changeTitle(String newTitle){
    title = newTitle;
  }

}