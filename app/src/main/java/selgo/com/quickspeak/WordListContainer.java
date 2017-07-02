package selgo.com.quickspeak;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WordListContainer extends AppCompatActivity {

    private String[] titles = EnglishCategory.getWordsCategories();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EnglishWordFragment englishWordFragment =
                (EnglishWordFragment) getFragmentManager().findFragmentById(R.id.english_list_frag);
        int wordId = (int) getIntent().getExtras().get("id");

        switch (wordId) {
            case 0:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.theAlphabetBackgroundColor)));
                getSupportActionBar().setTitle(titles[0]);
                break;
            case 1:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.numbersBackgroundColor)));
                getSupportActionBar().setTitle(titles[1]);
                break;
            case 2:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.basics2BackgroundColor)));
                getSupportActionBar().setTitle(titles[2]);
                break;
            case 3:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.phrasesBackgroundColor)));
                getSupportActionBar().setTitle(titles[3]);
                break;
            case 4:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.foodBackgroundColor)));
                getSupportActionBar().setTitle(titles[4]);
                break;
            case 5:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pluralsBackgroundColor)));
                getSupportActionBar().setTitle(titles[5]);
                break;
            case 6:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.animalsBackgroundColor)));
                getSupportActionBar().setTitle(titles[6]);
                break;
            default:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.numbersBackgroundColor)));
                getSupportActionBar().setTitle(R.string.app_name);
                break;
        }

        englishWordFragment.setWordId(wordId);

    }
}
