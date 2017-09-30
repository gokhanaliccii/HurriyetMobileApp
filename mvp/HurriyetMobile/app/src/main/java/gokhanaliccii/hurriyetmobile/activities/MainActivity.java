package gokhanaliccii.hurriyetmobile.activities;

import android.os.Bundle;

import gokhanaliccii.hurriyetmobile.R;
import gokhanaliccii.hurriyetmobile.view.writer.WriterFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WriterFragment writerFragment = new WriterFragment();

        getSupportFragmentManager()
                .beginTransaction().add(R.id.content_view, writerFragment).commit();

    }
}
