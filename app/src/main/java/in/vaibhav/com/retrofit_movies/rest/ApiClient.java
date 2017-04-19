package in.vaibhav.com.retrofit_movies.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vaibhav on 15/4/17.
 */

public class ApiClient {

    public static final String BASE_URL = "https://api.themoviedb.org/3/movie/550?api_key=c5c72246d1fe91f88f78e2a9a769e756";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
