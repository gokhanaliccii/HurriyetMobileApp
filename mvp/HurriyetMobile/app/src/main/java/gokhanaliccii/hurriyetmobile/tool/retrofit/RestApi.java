package gokhanaliccii.hurriyetmobile.tool.retrofit;

import android.support.compat.BuildConfig;

import java.util.concurrent.TimeUnit;

import gokhanaliccii.hurriyetmobile.tool.interceptor.HurriyetApiKeyInterceptor;
import gokhanaliccii.hurriyetmobile.tool.retrofit.api.HurriyetApi;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gokhan on 30/09/17.
 */

public class RestApi {

    private String BASE_URL = "api.hurriyet.com.tr/";

    private static RestApi instance;

    private HurriyetApi hurriyetApi;

    private RestApi(){
        init();
    }

    public static  RestApi getInstance(){
        if(instance == null){
            instance = new RestApi();
        }

        return instance;
    }

    private void init() {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(new HurriyetApiKeyInterceptor());

        //app runs on debug mode
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            httpClientBuilder.addInterceptor(loggingInterceptor);
        }

        OkHttpClient httpClient = httpClientBuilder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        hurriyetApi = retrofit.create(HurriyetApi.class);
    }

    public HurriyetApi api() {
        return hurriyetApi;
    }
}
