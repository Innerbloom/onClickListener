package house.naturalaquarium.fragmentsLight;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class TimeAquariumLighting extends Fragment {

    private static final int LAYOUT = R.layout.time_aquarium_lighting4;
    private View view;

    public static TimeAquariumLighting getInstance(){

        Bundle args = new Bundle();
        TimeAquariumLighting typesLamps = new TimeAquariumLighting();
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
