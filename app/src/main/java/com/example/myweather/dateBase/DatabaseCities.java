package com.example.myweather.dateBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Cities.class}, version = 1)
public abstract class DatabaseCities extends RoomDatabase {
    public abstract CitiesDao getEducationDao();
}