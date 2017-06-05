package selgo.com.quickspeak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WordListContainer extends AppCompatActivity {

    public static final String WORD_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EnglishWordsFragment englishWordsFragment =
                (EnglishWordsFragment) getFragmentManager().findFragmentById(R.id.english_list_frag);
        int wordId = (int) getIntent().getExtras().get(WORD_ID);
        englishWordsFragment.setWordId(wordId);

    }
}
