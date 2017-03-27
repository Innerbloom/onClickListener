package house.naturalaquarium.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import house.naturalaquarium.fragmentWater.AquariumWater;
import house.naturalaquarium.fragmentWater.OsmosisWater;
import house.naturalaquarium.fragmentWater.PreparationWater;
import house.naturalaquarium.fragmentsCO2.CO2;
import house.naturalaquarium.fragmentsCO2.UDO;

public class TabFragmentCO2 extends FragmentStatePagerAdapter {

    private String [] tabs;

    public TabFragmentCO2(FragmentManager fm) {
        super(fm);

        //Создаем Табы !!! с названиями Таб1 итд...
        tabs = new String[]{

                "Система подачи СО2",
                "Аквариумные удобрения"
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
                return CO2.getInstance();
            case 1:
                return UDO.getInstance();
        }

        return null;
    }

    //табс в ширину !!
    @Override
    public int getCount() {
        return tabs.length;
    }
}
