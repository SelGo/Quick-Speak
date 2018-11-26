package selgo.com.quickspeak;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class TopLevelActivity extends AppCompatActivity {

    private static String[] levels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        LevelPagerAdapter levelPagerAdapter = new LevelPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(levelPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private class LevelPagerAdapter extends FragmentPagerAdapter {

        public LevelPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new WordFragment();
                case 1:
                    return new WordFragment();
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            levels = getResources().getStringArray(R.array.english_word_levels);

            switch (position) {
                case 0:
                    return levels[0];
                case 1:
                    return levels[1];
                default:
                    return null;
            }
        }
    }

}
