package com.example.myweather.dateBase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CitiesDao {

    // Метод для добавления города в базу данных
    // @Insert - признак добавления
    // onConflict - что делать, если такая запись уже есть
    // В данном случае просто заменим ее
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCities(Cities cities);
//
//    // Метод для замены данных
//    @Update
//    void updateStudent(Cities cities);
//
    // Удалим данные города
    @Delete
    void deleteCities(Cities cities);
//
    // Удалим данные города, просто зная ключ
    @Query("DELETE FROM cities WHERE id = :id")
    void deteleStudentById(long id);

    // Заберем данные по всем студентам
    @Query("SELECT * FROM cities")
    List<Cities> getTopCities();

//    // Получим данные только одного студента по id
//    @Query("SELECT * FROM student WHERE id = :id")
//    Student getStudentById(long id);
//}
}
