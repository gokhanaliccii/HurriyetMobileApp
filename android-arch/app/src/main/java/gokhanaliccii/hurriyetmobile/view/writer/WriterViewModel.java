package gokhanaliccii.hurriyetmobile.view.writer;

import android.arch.lifecycle.ViewModel;

import java.util.List;

import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.persistence.core.Repository;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by gokhan on 16/10/17.
 */

public class WriterViewModel extends ViewModel {

    private Repository<WriterEntity> writerRepository;

    public WriterViewModel(Repository<WriterEntity> writerRepository) {
        this.writerRepository = writerRepository;
    }

    public Observable<List<WriterEntity>> getWriters() {
        return Observable.just(writerRepository).subscribeOn(Schedulers.io())
                .map(new Function<Repository<WriterEntity>, List<WriterEntity>>() {
                    @Override
                    public List<WriterEntity> apply(Repository<WriterEntity> writerEntityRepository) throws Exception {
                        return writerEntityRepository.readAll();
                    }
                });
    }


}