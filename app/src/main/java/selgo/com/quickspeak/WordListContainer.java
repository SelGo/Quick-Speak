package selgo.com.quickspeak;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class WordListContainer extends Activity {

    private String[] titles = EnglishCategory.getWordsCategories();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);

        EnglishWordFragment englishWordFragment =
                (EnglishWordFragment) getFragmentManager().findFragmentById(R.id.english_list_frag);
        int wordId = (int) getIntent().getExtras().get("id");

        switch (wordId) {
            case 0:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.theAlphabetBackgroundColor)));
                getActionBar().setTitle(titles[0]);
                break;
            case 1:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.numbersBackgroundColor)));
                getActionBar().setTitle(titles[1]);
                break;
            case 2:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.fruitsAndVegetablesBackgroundColor)));
                getActionBar().setTitle(titles[2]);
                break;
            case 3:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.greetingsAndIntroductionsBackgroundColor)));
                getActionBar().setTitle(titles[3]);
                break;
            case 4:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.basicWordsBackgroundColor)));
                getActionBar().setTitle(titles[4]);
                break;
            case 5:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorsBackgroundColor)));
                getActionBar().setTitle(titles[5]);
                break;
            default:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.theAlphabetBackgroundColor)));
                getActionBar().setTitle(R.string.app_name);
                break;
        }
        englishWordFragment.setWordId(wordId);
    }
}
