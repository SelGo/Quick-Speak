package selgo.com.quickspeak;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WordListContainer extends Activity {

    private String[] titles = EnglishCategory.getWordsCategories();
    private ArrayList<EnglishWord> words = new ArrayList<>();
    private static String[] arrayDefault = {""};
    private ArrayAdapter<String> adapterDefault;
    private WordAdapter wordAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        int position = getIntent().getExtras().getInt("position");

        switch (position) {
            case 0:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
                getActionBar().setTitle(titles[0]);

                words.add(new EnglishWord("A", "a"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            case 1:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
                getActionBar().setTitle(titles[1]);
                break;
            case 2:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
                getActionBar().setTitle(titles[2]);
                break;
            case 3:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
                getActionBar().setTitle(titles[3]);
                break;
            case 4:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
                getActionBar().setTitle(titles[4]);
                break;
            case 5:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
                getActionBar().setTitle(titles[5]);
                break;
            default:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
                getActionBar().setTitle(R.string.app_name);

                adapterDefault = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayDefault);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(adapterDefault);
                break;
        }
    }
}
