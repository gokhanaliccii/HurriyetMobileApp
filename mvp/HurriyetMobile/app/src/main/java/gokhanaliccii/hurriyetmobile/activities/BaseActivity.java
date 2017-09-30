package gokhanaliccii.hurriyetmobile.activities;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import gokhanaliccii.hurriyetmobile.util.StringUtil;

/**
 * Created by gokhan on 30/09/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void showToast(String message) {
        if (!StringUtil.isEmpty(message)) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }

}
