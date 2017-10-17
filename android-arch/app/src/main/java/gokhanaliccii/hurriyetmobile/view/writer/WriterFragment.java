package gokhanaliccii.hurriyetmobile.view.writer;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.List;

import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.di.factory.WriterFactory;
import io.reactivex.functions.Consumer;

import static gokhanaliccii.hurriyetmobile.App.factoryProvider;

/**
 * Created by gokhan on 16/10/17.
 */

public class WriterFragment extends LifecycleFragment {

    public static final String TAG = "WriterFragment";

    private WriterViewModel writerViewModel;

    public static WriterFragment newInstance() {
        WriterFragment fragment = new WriterFragment();
        fragment.setArguments(new Bundle());
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WriterFactory writerFactory = factoryProvider().writerFactory();
        writerViewModel = ViewModelProviders.of(this, writerFactory)
                .get(WriterViewModel.class);

        writerViewModel.getWriters().subscribe(new Consumer<List<WriterEntity>>() {
            @Override
            public void accept(List<WriterEntity> writerEntities) throws Exception {

            }
        });

    }
}
