package gokhanaliccii.hurriyetmobile.view.writer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import gokhanaliccii.hurriyetmobile.R;
import gokhanaliccii.hurriyetmobile.model.Writer;

/**
 * Created by gokhan on 30/09/17.
 */

public class WriterFragment extends Fragment implements WriterContact.View {

    private WriterPresenter presenter; //presenter diye bir objemiz var bunda işte yapılacak işleri buna soyleuyoruz


    private Button getWriterButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //oncreate de presenter objemizi verdik içine this dememizin sebebi presen içicerisine WriterContact.View
        //sınıfından obje beklmesi
        presenter = new WriterPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_writer ,container ,false);
        getWriterButton = (Button)view.findViewById(R.id.button_get_writers);

        getWriterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //butona tıklayınca getwriter cagırıyor
                presenter.getWriters(); //askım suan soyle
            }
        });

        return view;
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showWriters(Writer[] writers) {
        //yazar listesi buraya dusecek

    }
}
