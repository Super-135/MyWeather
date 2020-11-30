package com.example.myweather.dateBase;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {

    private static App instance;

    // база данных
    private DatabaseCities db;

    // Так получаем объект приложения
    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Это для синглтона, сохраняем объект приложения
        instance = this;

        // строим базу
        db = Room.databaseBuilder(
                getApplicationContext(),
                DatabaseCities.class,
                "education_database")
                .build();
    }

    // Получаем CitiesDao для составления запросов
    public CitiesDao getEducationDao() {
        return db.getEducationDao();
    }
}