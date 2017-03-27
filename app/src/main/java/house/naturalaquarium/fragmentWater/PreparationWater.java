package house.naturalaquarium.fragmentWater;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class PreparationWater extends Fragment{

    private static final int LAYOUT = R.layout.preparation_water3;
    private View view;

    public static PreparationWater getInstance(){
        Bundle args = new Bundle();
        PreparationWater preparationWater = new PreparationWater();
        preparationWater.setArguments(args);

        return preparationWater;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
