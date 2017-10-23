package gokhanaliccii.hurriyetmobile.util;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by gokhan on 23/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class ReaderTest {

    @Test
    public void shouldReadTestTxtCorrectly() throws Exception {
        final String expectedWord = "sample";
        final String textPath = "test.txt";

        Context targetContext = InstrumentationRegistry.getTargetContext();
        String outputText = Reader.read(targetContext, textPath);

        assertThat(expectedWord, equalTo(outputText));
    }

}