package gokhanaliccii.hurriyetmobile.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by gokhan on 08/10/17.
 */

@Entity
public class WriterEntity {

    @PrimaryKey
    private int id;

    private String name;
    private String surname;

    public WriterEntity(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
