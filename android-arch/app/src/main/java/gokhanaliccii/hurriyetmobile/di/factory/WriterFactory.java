package gokhanaliccii.hurriyetmobile.di.factory;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.persistence.core.Repository;
import gokhanaliccii.hurriyetmobile.view.writer.WriterViewModel;

/**
 * Created by gokhan on 16/10/17.
 */
public class WriterFactory implements ViewModelProvider.Factory{

    private Repository<WriterEntity> writerRepository;

    public WriterFactory(Repository<WriterEntity> writerRepository) {
        this.writerRepository = writerRepository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new WriterViewModel(writerRepository);
    }
}