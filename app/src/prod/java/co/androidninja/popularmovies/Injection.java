package co.androidninja.popularmovies;

import android.content.Context;

import co.androidninja.popularmovies.data.source.MoviesDataSource;
import co.androidninja.popularmovies.data.source.MoviesRepository;
import co.androidninja.popularmovies.data.source.remote.MoviesRemoteDataSource;

/**
 * Created by Aditya Mehta on 16/06/16.
 */
public class Injection {
    public static MoviesDataSource injectMoviesDataSource(Context context) {
        return new MoviesRepository(context, new MoviesRemoteDataSource());
    }
}
