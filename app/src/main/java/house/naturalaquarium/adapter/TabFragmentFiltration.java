package house.naturalaquarium.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import house.naturalaquarium.fragmentsCO2.CO2;
import house.naturalaquarium.fragmentsCO2.UDO;
import house.naturalaquarium.fragmentsFiltration.Aeration;
import house.naturalaquarium.fragmentsFiltration.Filtration;

public class TabFragmentFiltration extends FragmentStatePagerAdapter {

    private String [] tabs;

    public TabFragmentFiltration(FragmentManager fm) {
        super(fm);

        //Создаем Табы !!! с названиями Таб1 итд...
        tabs = new String[]{

                "Фильтрация",
                "Аэрация"
        };
    }

    //Получение позиции Табов что б передать их в свитч
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return Filtration.getInstance();
            case 1:
                return Aeration.getInstance();
        }

        return null;
    }

    //табс в ширину !!
    @Override
    public int getCount() {
        return tabs.length;
    }
}
