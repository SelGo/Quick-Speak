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
            default:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lessonOneBackgroundColor)));
                getSupportActionBar().setTitle(R.string.app_name);
                break;
        }

        englishWordFragment.setWordId(wordId);

    }
}
