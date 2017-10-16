package gokhanaliccii.hurriyetmobile;

import android.app.Application;

import gokhanaliccii.hurriyetmobile.db.AppDatabase;
import gokhanaliccii.hurriyetmobile.db.facade.DatabaseFacade;
import gokhanaliccii.hurriyetmobile.di.Provider;

/**
 * Created by gokhan on 08/10/17.
 */

public class App extends Application {

    private AppDatabase database;
    private Provider repositoryProvider;

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        database = DatabaseFacade.newInstance(this).database();
    }

    public static Provider repositoryProvider() {
        return repositoryProvider();
    }


}
