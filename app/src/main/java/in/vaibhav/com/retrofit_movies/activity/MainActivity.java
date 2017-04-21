package in.vaibhav.com.retrofit_movies.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import in.vaibhav.com.retrofit_movies.R;
import in.vaibhav.com.retrofit_movies.adapter.MoviesAdapter;
import in.vaibhav.com.retrofit_movies.model.Movie;
import in.vaibhav.com.retrofit_movies.model.MoviesResponse;
import in.vaibhav.com.retrofit_movies.rest.ApiClient;
import in.vaibhav.com.retrofit_movies.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String API_KEY = "c5c72246d1fe91f88f78e2a9a769e756";
    private static final String TAG = "MainactivityTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "API IS NULL", Toast.LENGTH_LONG).show();
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiServices = ApiClient.getClient().create(ApiInterface.class);

        // Call<MoviesResponse> call = apiServices.getTopRatedMovies(API_KEY);
        Call<MoviesResponse> call = apiServices.getTopRatedMovies(API_KEY);

        call.enqueue(new Callback<MoviesResponse>() {


            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                int statusCode = response.code();
                List<Movie> movies = response.body().getResults();
                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movies, getApplicationContext()));

            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {

                Log.d(TAG, t.toString());
            }
        });

    }
}
