package gokhanaliccii.hurriyetmobile.tool.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by gokhan on 30/09/17.
 */

public class HurriyetApiKeyInterceptor implements Interceptor {

    public static final String API_KEY= "6aeea1f62710443fa39bc3b6865221ff";
    public static final String HEADER_API_KEY= "Apikey";


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Request newRequest = request.newBuilder().addHeader(HEADER_API_KEY, API_KEY).build();

        return chain.proceed(newRequest);
    }
}
