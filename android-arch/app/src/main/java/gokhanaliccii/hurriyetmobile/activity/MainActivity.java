package gokhanaliccii.hurriyetmobile.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import gokhanaliccii.hurriyetmobile.R;
import gokhanaliccii.hurriyetmobile.view.writer.WriterFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction().add(WriterFragment.newInstance(),WriterFragment.TAG).commit();


    }
}
