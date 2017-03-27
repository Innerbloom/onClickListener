package house.naturalaquarium.fragmentsFiltration;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;


public class Aeration extends Fragment {

    private static final int LAYOUT = R.layout.aereation_6;

    private View view;

    public static Aeration getInstance() {
        Bundle args = new Bundle();
        Aeration aquaFish = new Aeration();
        aquaFish.setArguments(args);

        return aquaFish;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}
