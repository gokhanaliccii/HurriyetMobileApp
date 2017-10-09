package gokhanaliccii.hurriyetmobile.persistence.core;

import java.util.List;

/**
 * Created by gokhan on 09/10/17.
 */

public interface Repository<Model> {

    void save(Model model);

    Model read(Criteria criteria);

    List<Model> readAll();

    void delete(Criteria criteria);

}
