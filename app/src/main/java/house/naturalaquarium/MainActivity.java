package house.naturalaquarium;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import house.naturalaquarium.adapter.TabFragmentAdapterPlants;
import house.naturalaquarium.adapter.TabFragmentCO2;
import house.naturalaquarium.adapter.TabFragmentFiltration;
import house.naturalaquarium.adapter.TabFragmentFish;
import house.naturalaquarium.adapter.TabFragmentWater;
import house.naturalaquarium.adapter.TabFragmentsLight;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;

    private Drawer.Result drawerMenu;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.myTheme2);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initTabs();


        // Инициализируем Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            setTitle("Directory of aquarist");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        initializeNavigationDrawer(toolbar);

    }

    private void initTabs() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        // Инициализируем TabLayout

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        TabFragmentFish adapter = new TabFragmentFish(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public void onBackPressed() {
        if (drawerMenu != null && drawerMenu.isDrawerOpen()) {
            drawerMenu.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }

    //Инициализация Дравера
    private void initializeNavigationDrawer(Toolbar toolbar) {
        drawerMenu = new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                //Добавление Итемов в шторку
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withName(R.id.aqua_fish)
                                .withIdentifier(1)
                                .withIcon(getResources().getDrawable(R.drawable.fish)),
                        new PrimaryDrawerItem()
                                .withName(R.id.aqua_plant)
                                .withIdentifier(2)
                                .withIcon(getResources().getDrawable(R.drawable.leaf)),
                        new PrimaryDrawerItem()
                                .withName(R.id.aqua_water)
                                .withIdentifier(3)
                                .withIcon(getResources().getDrawable(R.drawable.water)),
                        new PrimaryDrawerItem()
                                .withName(R.id.aqua_lighting)
                                .withIdentifier(4)
                                .withIcon(getResources().getDrawable(R.drawable.lightbulb)),
                        new PrimaryDrawerItem()
                                .withName(R.id.aqua_co2)
                                .withIdentifier(5)
                                .withIcon(getResources().getDrawable(R.drawable.co2)),
                        new PrimaryDrawerItem()
                                .withName(R.id.aqua_filtration)
                                .withIdentifier(6)
                                .withIcon(getResources().getDrawable(R.drawable.filter)),
                        //--------------------------------------------- Secondary
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem()
                                .withName(R.id.about)
                                .withIcon(getResources().getDrawable(R.drawable.about))
                                .withIdentifier(7),
                        new SecondaryDrawerItem()
                                .withIdentifier(8)
                                .withName(R.id.exit)
                                .withIcon(getResources().getDrawable(R.drawable.exit)))
                //Реализуем клик по айтэмам
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        switch (drawerItem.getIdentifier()) {
                            case 1:
                                TabFragmentFish adapter = new TabFragmentFish(getSupportFragmentManager());
                                viewPager.setAdapter(adapter);
                                tabLayout.setupWithViewPager(viewPager);
                                break;
                            case 2:
                                TabFragmentAdapterPlants adapterPlants = new TabFragmentAdapterPlants(getSupportFragmentManager());
                                viewPager.setAdapter(adapterPlants);
                                tabLayout.setupWithViewPager(viewPager);
                                break;
                            case 3:
                                TabFragmentWater fragmentWater = new TabFragmentWater(getSupportFragmentManager());
                                viewPager.setAdapter(fragmentWater);
                                tabLayout.setupWithViewPager(viewPager);
                                break;
                            case 4:
                                TabFragmentsLight fragmentsLight = new TabFragmentsLight(getSupportFragmentManager());
                                viewPager.setAdapter(fragmentsLight);
                                tabLayout.setupWithViewPager(viewPager);
                                break;
                            case 5:
                                TabFragmentCO2 fragmentCO2 = new TabFragmentCO2(getSupportFragmentManager());
                                viewPager.setAdapter(fragmentCO2);
                                tabLayout.setupWithViewPager(viewPager);
                                break;
                            case 6:
                                TabFragmentFiltration fragmentFiltration = new TabFragmentFiltration(getSupportFragmentManager());
                                viewPager.setAdapter(fragmentFiltration);
                                tabLayout.setupWithViewPager(viewPager);
                                break;
                            //Мини окошко "Об авторе с закрытием ОК"
                            case 7:
                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AppCompatAlertDialogStyle);
                                builder
                                        //.setTitle("Об авторе")
                                        .setView(R.layout.alert_dialog)
                                        //.setMessage("\n Автор:  Артем Мишуровский" + "\n\n Email: \n artm.mishurovskiy@gmail.com")
                                        .setCancelable(false)
                                        .setNegativeButton("Ок", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                dialogInterface.cancel();
                                            }
                                        });
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                break;
                            //Выход из программы
                            case 8:
                                finish();
                                break;
                        }
                    }
                })
                .build();
    }
}
