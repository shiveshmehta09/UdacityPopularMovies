package com.debajyotibasak.udacitypopularmovies.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.debajyotibasak.udacitypopularmovies.database.converter.DateConverter;
import com.debajyotibasak.udacitypopularmovies.database.converter.IntegerListConvertor;
import com.debajyotibasak.udacitypopularmovies.database.dao.MoviesDao;
import com.debajyotibasak.udacitypopularmovies.database.entity.GenreEntity;
import com.debajyotibasak.udacitypopularmovies.database.entity.MovieEntity;

@Database(entities = {MovieEntity.class, GenreEntity.class}, version = 1, exportSchema = false)
@TypeConverters({IntegerListConvertor.class, DateConverter.class})
public abstract class MoviesDb extends RoomDatabase {

    // --- SINGLETON ---
    private static volatile MoviesDb INSTANCE;

    // --- DAO ---
    public abstract MoviesDao moviesDao();

}
