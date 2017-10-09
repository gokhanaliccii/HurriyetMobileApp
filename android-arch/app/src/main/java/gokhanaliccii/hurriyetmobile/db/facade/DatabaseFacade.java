package gokhanaliccii.hurriyetmobile.db.facade;

import android.app.Application;
import android.arch.persistence.room.Room;

import gokhanaliccii.hurriyetmobile.R;
import gokhanaliccii.hurriyetmobile.db.AppDatabase;

/**
 * Created by gokhan on 08/10/17.
 */

public class DatabaseFacade {

    private static DatabaseFacade instance;

    private AppDatabase database;

    private DatabaseFacade(Application app) {
        final String dbName = app.getString(R.string.database_name);
        database = Room.databaseBuilder(app, AppDatabase.class, dbName).build();
    }

    public static DatabaseFacade newInstance(Application app) {
        if (instance == null) {
            instance = new DatabaseFacade(app);
        }

        return instance;
    }

    public AppDatabase database() {
        return database;
    }
}
