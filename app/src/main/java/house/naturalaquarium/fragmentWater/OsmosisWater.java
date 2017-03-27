package house.naturalaquarium.fragmentWater;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.system.Os;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class OsmosisWater extends Fragment {

    private static final int LAYOUT = R.layout.osmosis_water3;
    private View view;

    public static OsmosisWater getInstance(){
        Bundle args = new Bundle();
        OsmosisWater osmosisWater = new OsmosisWater();
        osmosisWater.setArguments(args);

        return osmosisWater;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
