package house.naturalaquarium.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;

import house.naturalaquarium.fragmentsLight.SntensityIllumination;
import house.naturalaquarium.fragmentsLight.TimeAquariumLighting;
import house.naturalaquarium.fragmentsLight.TypesLamps;


public class TabFragmentsLight extends FragmentStatePagerAdapter {

    //Create massive
    private String[] tabs;

    public TabFragmentsLight (FragmentManager fm) {
        super(fm);

        //Create tabs
        tabs = new String[]{
                "Типы ламп",
                "Интенсивность освещения",
                "Время освещения аквариума"
        };
    }

    //Получение позиции Табов что б передать их в свитч
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    //Переключение между фрагменами с помощью позиции 0,1,2
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return TypesLamps.getInstance();
            case 1:
                return SntensityIllumination.getInstance();
            case 2:
                return TimeAquariumLighting.getInstance();
        }

        return null;
    }

    //табс в ширину !!
    @Override
    public int getCount() {
        return tabs.length;
    }
}
