package gokhanaliccii.hurriyetmobile.di;

import gokhanaliccii.hurriyetmobile.db.entity.WriterEntity;
import gokhanaliccii.hurriyetmobile.persistence.core.Repository;

/**
 * Created by gokhan on 16/10/17.
 */

public interface Provider {

    Repository<WriterEntity> writerRepository();
}
