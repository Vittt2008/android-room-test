package ru.tinkoff.room.ext;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * @author Vitaliy Markus
 */
@Entity
public class City {

    @NonNull
    @PrimaryKey
    private final String name;

    @NonNull
    private final String location;

    public City(@NonNull String name, @NonNull String location) {
        this.name = name;
        this.location = location;
    }

    @Ignore
    public City() {
        this.name = "";
        this.location = "";
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (!name.equals(city.name)) return false;
        return location.equals(city.location);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
