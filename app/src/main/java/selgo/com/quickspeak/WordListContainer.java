package selgo.com.quickspeak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WordListContainer extends AppCompatActivity {

    private String[] titles = EnglishWordsCategories.getWordsCategories();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        EnglishWordsFragment englishWordsFragment =
                (EnglishWordsFragment) getFragmentManager().findFragmentById(R.id.english_list_frag);
        int wordId = (int) getIntent().getExtras().get("id");

        switch (wordId) {
            case 0:
                getSupportActionBar().setTitle(titles[0]);
                break;
            case 1:
                getSupportActionBar().setTitle(titles[1]);
                break;
            case 2:
                getSupportActionBar().setTitle(titles[2]);
                break;
            case 3:
                getSupportActionBar().setTitle(titles[3]);
                break;
            case 4:
                getSupportActionBar().setTitle(titles[4]);
                break;
            case 5:
                getSupportActionBar().setTitle(titles[5]);
                break;
            case 6:
                getSupportActionBar().setTitle(titles[6]);
                break;
            default:
                getSupportActionBar().setTitle(R.string.app_name);
                break;
        }

        englishWordsFragment.setWordId(wordId);

    }
}
