package house.naturalaquarium.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import house.naturalaquarium.fragmentWater.AquariumWater;
import house.naturalaquarium.fragmentWater.OsmosisWater;
import house.naturalaquarium.fragmentWater.PreparationWater;

public class TabFragmentWater extends FragmentStatePagerAdapter {

    private String [] tabs;

    public TabFragmentWater(FragmentManager fm) {
        super(fm);

        //Создаем Табы !!! с названиями Таб1 итд...
        tabs = new String[]{
                "Все об воде и ее свойства",
                "Подготовка, подмена",
                "Осмоc, стерелизация"
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
                return AquariumWater.getInstance();
            case 1:
                return PreparationWater.getInstance();
            case 2:
                return OsmosisWater.getInstance();
        }

        return null;
    }

    //табс в ширину !!
    @Override
    public int getCount() {
        return tabs.length;
    }
}
