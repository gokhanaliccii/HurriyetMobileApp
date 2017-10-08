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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
