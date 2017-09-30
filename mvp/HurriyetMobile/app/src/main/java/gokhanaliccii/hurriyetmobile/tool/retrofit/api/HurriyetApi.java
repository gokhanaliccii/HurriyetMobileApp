package gokhanaliccii.hurriyetmobile.tool.retrofit.api;

import gokhanaliccii.hurriyetmobile.model.Writer;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gokhan on 30/09/17.
 */

public interface HurriyetApi {

    @GET("v1/writers")
    Call<Writer[]> getWriters();
}
