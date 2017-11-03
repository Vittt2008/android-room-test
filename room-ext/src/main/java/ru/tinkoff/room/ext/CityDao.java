package ru.tinkoff.room.ext;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * @author Vitaliy Markus
 */
@Dao
public interface CityDao {

    @Query("SELECT * FROM City")
    List<City> getAllCity();

}
