package gokhanaliccii.hurriyetmobile;

import android.app.Application;

import gokhanaliccii.hurriyetmobile.db.AppDatabase;
import gokhanaliccii.hurriyetmobile.db.facade.DatabaseFacade;
import gokhanaliccii.hurriyetmobile.di.factory.FactoryProvider;
import gokhanaliccii.hurriyetmobile.di.repository.RepositoryProvider;

/**
 * Created by gokhan on 08/10/17.
 */

public class App extends Application {

    private AppDatabase database;

    private static FactoryProvider factoryProvider;


    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        database = DatabaseFacade.newInstance(this).database();

        factoryProvider = new FactoryProvider(new RepositoryProvider(database));
    }

    public static FactoryProvider factoryProvider() {
        return factoryProvider;
    }


}
