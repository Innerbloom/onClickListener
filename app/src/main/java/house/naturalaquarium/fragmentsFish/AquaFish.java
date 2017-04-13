package house.naturalaquarium.fragmentsFish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import house.naturalaquarium.FishName;
import house.naturalaquarium.R;
import house.naturalaquarium.RVAdapter;


public class AquaFish extends Fragment {

    private static final int LAYOUT = R.layout.aqua_fish1;

    private View view;
    private List<FishName> fishNames;
    private RecyclerView rv;

    public static AquaFish getInstance() {
        Bundle args = new Bundle();
        AquaFish aquaFish = new AquaFish();
        aquaFish.setArguments(args);
        return aquaFish;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        //Создание списка
        rv = (RecyclerView) view.findViewById(R.id.rv);

        //set LayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);

        //Инициализация даты и адаптера
        initializeData();
        initializeAdapter();

        return view;
    }

    private void initializeData() {
        fishNames = new ArrayList<>();
        fishNames.add(new FishName("Апистограмма Рамирези", "Mikrogeophagus ramirezi", R.drawable.f000_1));
        fishNames.add(new FishName("Боливийская бабочка", "Mikrogeophagus altispinosus", R.drawable.f000_2));
        fishNames.add(new FishName("Апистограмма агассица", "Apistogramma agassizii", R.drawable.f000_3));
        fishNames.add(new FishName("Апистограмма какаду", "Apistogramma cacatuoides", R.drawable.f000_4));
    }

    private void initializeAdapter() {
        RVAdapter adapter = new RVAdapter(fishNames);
        rv.setAdapter(adapter);
    }
}