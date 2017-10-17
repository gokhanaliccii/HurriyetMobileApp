package gokhanaliccii.hurriyetmobile.view.writer;

import android.arch.lifecycle.ViewModel;

import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.persistence.core.Repository;

/**
 * Created by gokhan on 16/10/17.
 */

public class WriterViewModel extends ViewModel {

    private Repository<WriterEntity> writerRepository;

    public WriterViewModel(Repository<WriterEntity> writerRepository) {
        this.writerRepository = writerRepository;
    }







}