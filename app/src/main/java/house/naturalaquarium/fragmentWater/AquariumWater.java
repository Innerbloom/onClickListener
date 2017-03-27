package house.naturalaquarium.fragmentWater;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class AquariumWater extends Fragment{

    private static final int LAYOUT = R.layout.water3;
    private View view;

    public static AquariumWater getInstance(){

        Bundle args = new Bundle();
        AquariumWater aquariumWater = new AquariumWater();
        aquariumWater.setArguments(args);

        return aquariumWater;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container,false);
        return view;
    }
}
