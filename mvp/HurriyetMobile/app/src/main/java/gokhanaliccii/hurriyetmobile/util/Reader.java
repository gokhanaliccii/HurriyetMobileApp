package gokhanaliccii.hurriyetmobile.util;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by gokhan on 23/10/17.
 */

public class Reader {

    public static String read(Context context, String fileName) throws IOException {
        InputStream inputStream = context.getResources().getAssets().open(fileName);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte line[] = new byte[1024];
        int byteReads;
        while ((byteReads = inputStream.read(line)) != -1) {
            outputStream.write(line, 0, byteReads);
        }

        String output = outputStream.toString();
        outputStream.close();
        inputStream.close();

        return output;
    }
}
