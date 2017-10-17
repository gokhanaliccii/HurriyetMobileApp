package gokhanaliccii.hurriyetmobile.view.writer;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import gokhanaliccii.hurriyetmobile.di.factory.WriterFactory;

import static gokhanaliccii.hurriyetmobile.App.factoryProvider;

/**
 * Created by gokhan on 16/10/17.
 */

public class WriterFragment extends LifecycleFragment {

    private WriterViewModel writerViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WriterFactory writerFactory = factoryProvider().writerFactory();
        writerViewModel = ViewModelProviders.of(this, writerFactory)
                .get(WriterViewModel.class);


    }
}
