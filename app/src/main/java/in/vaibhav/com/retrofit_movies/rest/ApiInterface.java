package in.vaibhav.com.retrofit_movies.rest;

import in.vaibhav.com.retrofit_movies.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vaibhav on 15/4/17.
 */

public interface ApiInterface {

    @GET("top_rated/{api_key}")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String api_key);

//    @GET("movies/{id}")
//    Call<MoviesResponse> getMoviesDetails(@Path("id") int id, @Query("api_key") String api_key);
}
