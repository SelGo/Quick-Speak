package selgo.com.quickspeak;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class EnglishLevel extends Activity implements LevelsFragment.LevelsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_word_levels);

        getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);

        if (fragmentContainer != null) {
            WordFragment wordFragment = new WordFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            wordFragment.setWordId(id);
            fragmentTransaction.replace(R.id.fragment_container, wordFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        } else {
            Intent intent = new Intent(this, WordListContainer.class);
            intent.putExtra(WordListContainer.EXTRA_WORD_ID, (int) id);
            startActivity(intent);
        }
    }
}
