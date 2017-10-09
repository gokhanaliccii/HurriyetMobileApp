package gokhanaliccii.hurriyetmobile.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
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

    @Query("select * from WriterEntity where id IN(:ids)")
    WriterEntity getWriters(String ids);

    @Insert()
    void insertWriter(WriterEntity writer);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWriter(WriterEntity... writer);

    @Delete
    void remove(WriterEntity writerEntity);
}
