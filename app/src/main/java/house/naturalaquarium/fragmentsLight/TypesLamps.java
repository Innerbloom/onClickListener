package house.naturalaquarium.fragmentsLight;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;
public class TypesLamps extends Fragment {

    private static final int LAYOUT = R.layout.types_lamps4;
    private View view;

    public static  TypesLamps getInstance(){

        Bundle args = new Bundle();
        TypesLamps typesLamps = new TypesLamps();
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
