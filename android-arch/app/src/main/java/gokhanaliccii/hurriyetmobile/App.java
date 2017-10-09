package gokhanaliccii.hurriyetmobile;

import android.app.Application;

import gokhanaliccii.hurriyetmobile.db.AppDatabase;
import gokhanaliccii.hurriyetmobile.db.facade.DatabaseFacade;

/**
 * Created by gokhan on 08/10/17.
 */

public class App extends Application {

    AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        database = DatabaseFacade.newInstance(this).database();
    }
}
