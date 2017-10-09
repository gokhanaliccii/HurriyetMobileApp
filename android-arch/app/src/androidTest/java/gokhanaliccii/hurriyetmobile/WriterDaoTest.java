package gokhanaliccii.hurriyetmobile;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import gokhanaliccii.hurriyetmobile.db.AppDatabase;
import gokhanaliccii.hurriyetmobile.db.dao.WriterDao;
import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;

/**
 * Created by gokhan on 09/10/17.
 */

@RunWith(JUnit4.class)
public class WriterDaoTest {

    private WriterDao writerDao;


    @Before
    public void setUp() {
        Context context = InstrumentationRegistry.getContext();
        AppDatabase testDB = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();

        writerDao = testDB.writerDao();
    }

    @Test
    public void shouldInsertSingleWriterCorrectly() {
        final WriterEntity writer = new WriterEntity("gokhan", "alıcı");
        writerDao.insertWriter(writer);

        List<WriterEntity> writers = writerDao.getWriters();

        Assert.assertThat(writers.size(), IsEqual.equalTo(1));
    }

    @Test
    public void shouldListWritersAfterInsertionCorrectly() {
        final WriterEntity writerEntity = new WriterEntity("gokhan", "alıcı");
        writerDao.insertWriter(writerEntity);
        writerDao.insertWriter(writerEntity);

        List<WriterEntity> writerEntities = writerDao.getWriters();
        Assert.assertThat(writerEntities.size(), IsEqual.equalTo(2));
    }

    @Test
    public void shouldDeleteWriterCorrectly(){
        final WriterEntity writerEntity = new WriterEntity("gokhan", "alıcı");
        writerDao.insertWriter(writerEntity);

        writerDao.remove(writerEntity);

        List<WriterEntity> writers = writerDao.getWriters();
        Assert.assertThat(writers.size(), IsEqual.equalTo(0));
    }

}
