package gokhanaliccii.hurriyetmobile.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;

/**
 * Created by gokhan on 08/10/17.
 */

@Dao
public interface WriterDao {

    @Query("select * from WriterEntity")
    List<WriterEntity> getWriters();

    @Insert
    void insertWriter(WriterEntity writer);

    @Insert
    void insertWriter(WriterEntity ...writer);
}
