package selgo.com.quickspeak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
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

    private class LevelPagerAdapter extends FragmentStatePagerAdapter {

        public LevelPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return WordFragment.newInstance(position);
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
                case 2:
                    return levels[2];
                case 3:
                    return levels[3];
                default:
                    return "SampleTitle";
            }
        }
    }

}
