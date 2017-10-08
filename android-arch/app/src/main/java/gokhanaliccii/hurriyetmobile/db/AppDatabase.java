package gokhanaliccii.hurriyetmobile.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import gokhanaliccii.hurriyetmobile.db.dao.WriterDao;
import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;

/**
 * Created by gokhan on 08/10/17.
 */

@Database(entities = {WriterEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract WriterDao writerDao();
}
