package gokhanaliccii.hurriyetmobile.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gokhan on 30/09/17.
 */

public class Writer {

    @SerializedName("Id")
    private String id;

    @SerializedName("Fullname")
    private String writerName;

    public String getId() {
        return id;
    }

    public String getWriterName() {
        return writerName;
    }
}