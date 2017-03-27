package house.naturalaquarium.fragmentsCO2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;


public class CO2 extends Fragment {

    private static final int LAYOUT = R.layout.co2_5;

    private View view;

    public static CO2 getInstance() {
        Bundle args = new Bundle();
        CO2 aquaFish = new CO2();
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
