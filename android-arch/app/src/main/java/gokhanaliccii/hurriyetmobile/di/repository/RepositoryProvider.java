package gokhanaliccii.hurriyetmobile.di.repository;

import gokhanaliccii.hurriyetmobile.db.AppDatabase;
import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.di.Provider;
import gokhanaliccii.hurriyetmobile.persistence.core.Repository;
import gokhanaliccii.hurriyetmobile.persistence.writer.WriterLocalRepository;

/**
 * Created by gokhan on 16/10/17.
 */

public class RepositoryProvider implements Provider {

    private AppDatabase database;

    private WriterLocalRepository writerRepository;

    public RepositoryProvider(AppDatabase database) {
        this.database = database;
    }

    @Override
    public Repository<WriterEntity> writerRepository() {
        if (writerRepository == null) {
            writerRepository = new WriterLocalRepository(database.writerDao());
        }

        return writerRepository;
    }
}
