package house.naturalaquarium.fragmentsCO2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;


public class UDO extends Fragment {

    private static final int LAYOUT = R.layout.udo5;

    private View view;

    public static UDO getInstance() {
        Bundle args = new Bundle();
        UDO aquaFish = new UDO();
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
