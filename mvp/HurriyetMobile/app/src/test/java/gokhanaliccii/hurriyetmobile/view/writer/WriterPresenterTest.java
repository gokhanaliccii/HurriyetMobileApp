package gokhanaliccii.hurriyetmobile.view.writer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Created by gokhan on 03/10/17.
 */

@RunWith(JUnit4.class)
public class WriterPresenterTest {

    @Mock
    WriterContact.View mView;

    @InjectMocks
    WriterPresenter writerPresenter;

    @Before
    public void setup(){

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldShowProgressWhenWriterListLoading() {

        writerPresenter.getWriters();

        Mockito.verify(mView).showProgress();
    }


}