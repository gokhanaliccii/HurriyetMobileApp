package gokhanaliccii.hurriyetmobile.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import gokhanaliccii.hurriyetmobile.model.Writer;

/**
 * Created by gokhan on 08/10/17.
 */

@Dao
public interface WriterDao {

    @Query("select * from Writer")
    List<Writer> getWriters();

}
