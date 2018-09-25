package selgo.com.quickspeak;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WordListContainer extends Activity {

    private String[] titles = EnglishLevel.getWordsCategories();
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
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorEnglish)));
                getActionBar().setTitle(titles[0]);

                words.add(new EnglishWord("A", "a"));
                words.add(new EnglishWord("B", "b"));
                words.add(new EnglishWord("C", "c"));
                words.add(new EnglishWord("D", "d"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            case 1:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorRed)));
                getActionBar().setTitle(titles[1]);

                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            case 2:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorEnglish)));
                getActionBar().setTitle(titles[2]);

                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            case 3:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorRed)));
                getActionBar().setTitle(titles[3]);

                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            case 4:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorEnglish)));
                getActionBar().setTitle(titles[4]);

                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            case 5:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorRed)));
                getActionBar().setTitle(titles[5]);

                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));
                words.add(new EnglishWord("English Word", "Translated Word"));

                wordAdapter = new WordAdapter(this, words);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(wordAdapter);
                break;
            default:
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorDefault)));
                getActionBar().setTitle(R.string.app_name);

                adapterDefault = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayDefault);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(adapterDefault);
                break;
        }
    }
}
