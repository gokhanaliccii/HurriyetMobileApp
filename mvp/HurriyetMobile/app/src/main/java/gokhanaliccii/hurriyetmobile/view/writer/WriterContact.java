package gokhanaliccii.hurriyetmobile.view.writer;

import gokhanaliccii.hurriyetmobile.model.Writer;
import gokhanaliccii.hurriyetmobile.util.mvp.BasePresenter;
import gokhanaliccii.hurriyetmobile.util.mvp.BaseView;

/**
 * Created by gokhan on 30/09/17.
 */

public interface WriterContact {

    interface View extends BaseView{

        void showProgress();

        void hideProgress();

        void showWriters(Writer [] writers);

    }

    interface Presenter extends BasePresenter{

        void getWriters();
    }


}
