package house.naturalaquarium.fragmentsLight;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class SntensityIllumination extends Fragment {

    private static final int LAYOUT = R.layout.sntensity_illumination4;
    private View view;

    public static SntensityIllumination getInstance(){

        Bundle args = new Bundle();
        SntensityIllumination typesLamps = new SntensityIllumination();
        typesLamps.setArguments(args);

        return typesLamps;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
