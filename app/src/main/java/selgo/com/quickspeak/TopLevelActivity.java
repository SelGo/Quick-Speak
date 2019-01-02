package selgo.com.quickspeak;


import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;


public class TopLevelActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private CharSequence itemTitle = "Level 1";
    private WordFragment wordFragment;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(itemTitle);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open_drawer, R.string.nav_close_drawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.level_1);

        Bundle arguments = new Bundle();
        arguments.putCharSequence("itemTitle", itemTitle);

        wordFragment = new WordFragment();
        wordFragment.setArguments(arguments);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frag_container, wordFragment);
        fragmentTransaction.commit();


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        itemTitle = item.getTitle();

        /*Toast toast = Toast.makeText(this, itemTitle, Toast.LENGTH_SHORT);
        toast.show();*/

        getSupportActionBar().setTitle(itemTitle);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        item.setChecked(true);
        drawerLayout.closeDrawers();

        Bundle arguments = new Bundle();
        arguments.putCharSequence("itemTitle", itemTitle);

        wordFragment = new WordFragment();
        wordFragment.setArguments(arguments);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frag_container, wordFragment);
        fragmentTransaction.commit();

        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}
