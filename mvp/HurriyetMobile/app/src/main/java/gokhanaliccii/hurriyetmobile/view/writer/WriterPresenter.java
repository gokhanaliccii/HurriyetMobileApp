package gokhanaliccii.hurriyetmobile.view.writer;

import gokhanaliccii.hurriyetmobile.model.Writer;
import gokhanaliccii.hurriyetmobile.tool.retrofit.RestApi;
import gokhanaliccii.hurriyetmobile.tool.retrofit.api.HurriyetApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by gokhan on 30/09/17.
 */

public class WriterPresenter implements WriterContact.Presenter {

    private WriterContact.View view;

    public WriterPresenter(WriterContact.View view) {
        this.view = view;
    }

    @Override
    public void getWriters() {
        view.showProgress();

        HurriyetApi api = RestApi.getInstance().api();

        api.getWriters().enqueue(new Callback<Writer[]>() {
            @Override
            public void onResponse(Call<Writer[]> call, Response<Writer[]> response) {
                view.hideProgress();
                view.showWriters(response.body());
            }

            @Override
            public void onFailure(Call<Writer[]> call, Throwable t) {
                view.hideProgress();
            }
        });
    }


}
