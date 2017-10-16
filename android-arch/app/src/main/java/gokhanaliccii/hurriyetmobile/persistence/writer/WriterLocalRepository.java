package gokhanaliccii.hurriyetmobile.persistence.writer;

import java.util.List;

import gokhanaliccii.hurriyetmobile.db.dao.WriterDao;
import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.persistence.core.Criteria;
import gokhanaliccii.hurriyetmobile.persistence.core.Repository;

/**
 * Created by gokhan on 09/10/17.
 */

public class WriterLocalRepository implements Repository<WriterEntity> {

    private WriterDao writerDao;

    public WriterLocalRepository(WriterDao writerDao) {
        this.writerDao = writerDao;
    }

    @Override
    public void save(WriterEntity writerEntity) {
        writerDao.insertWriter(writerEntity);
    }

    @Override
    public WriterEntity read(Criteria criteria) {
        return writerDao.getWriters(criteria.getQuery());
    }

    @Override
    public List<WriterEntity> readAll() {
        return writerDao.getWriters();
    }

    @Override
    public void delete(Criteria criteria) {

    }
}