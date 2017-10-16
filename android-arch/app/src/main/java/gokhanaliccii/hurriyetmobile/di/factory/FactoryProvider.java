package gokhanaliccii.hurriyetmobile.di.factory;

import gokhanaliccii.hurriyetmobile.di.Provider;

/**
 * Created by gokhan on 17/10/17.
 */

public class FactoryProvider {

    private Provider provider;

    public FactoryProvider(Provider provider) {
        this.provider = provider;
    }

    public WriterFactory writerFactory(){
        return new WriterFactory(provider.writerRepository());
    }

}
