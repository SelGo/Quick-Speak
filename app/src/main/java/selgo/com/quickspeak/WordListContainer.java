package selgo.com.quickspeak;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class WordListContainer extends Activity {

    public static final String EXTRA_WORD_ID = "id";
    private String[] titles = LevelsFragment.getWordsCategories();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));

        WordFragment wordFragment = (WordFragment) getFragmentManager().findFragmentById(R.id.word_fragment);
        int wordId = (int) getIntent().getExtras().get(EXTRA_WORD_ID);
        wordFragment.setWordId(wordId);

        switch (wordId){
            case 0:
                getActionBar().setTitle(titles[0]);
                break;
            case 1:
                getActionBar().setTitle(titles[1]);
                break;
            default:
                getActionBar().setTitle(R.string.app_name);
                break;
        }
    }
}
