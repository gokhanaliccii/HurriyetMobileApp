package gokhanaliccii.hurriyetmobile.di.provider;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import gokhanaliccii.hurriyetmobile.view.writer.WriterViewModel;

/**
 * Created by gokhan on 16/10/17.
 */
class RepositoryProvider implements ViewModelProvider.Factory{

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new WriterViewModel();
    }
}