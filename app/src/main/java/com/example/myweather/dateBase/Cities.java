package com.example.myweather.dateBase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"CitiesEN"})})
public class Cities {

    public final static String ID = "id";
    public final static String CITIES_EN = "Cities_EN";
    public final static String CITIES = "Cities";
    public final static String COUNT_CALLS = "Count_Calls";

    // @Entity - это признак табличного объекта, то есть объект
    // будет сохранятся в базе данных в виде строки
   // indices - указывает на индексы в таблице

    // @PrimaryKey - указывает на ключевую запись,
    // autoGenerate = true - автоматическая генерация ключа
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    public long id;

    // @ColumnInfo - позволяет задавать параметры колонки в БД
    // name = "Cities_EN" - такое будет имя колонки
    @ColumnInfo(name = CITIES_EN)
    public String citiesEN;

    @ColumnInfo(name = CITIES)
    public String cities;


    // Колличество вызовов
    @ColumnInfo(name = COUNT_CALLS)
    public long countCalls;
}
