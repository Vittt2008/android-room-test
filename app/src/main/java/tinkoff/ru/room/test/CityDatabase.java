package tinkoff.ru.room.test;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ru.tinkoff.room.ext.City;
import ru.tinkoff.room.ext.CityDao;

/**
 * @author Vitaliy Markus
 */
@Database(entities = {City.class}, version = 1)
public abstract class CityDatabase extends RoomDatabase {

    public abstract CityDao getCityDao();
}
