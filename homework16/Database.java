package de.telran.averchenko.elena.homework16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Database <K extends Number,V> {
    private K key;
    V value;
    Map<K,V> database = new HashMap <>();



    public Database(Map<K, V> database) {
        this.database = database;
    }

    public Database() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Database<?, ?> database = (Database<?, ?>) o;
        return Objects.equals(key, database.key) && Objects.equals(value, database.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public void add(K currentKey, V currentVal){

        database.put(currentKey,currentVal);

    }

    @Override
    public String toString() {
        return "Database{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
