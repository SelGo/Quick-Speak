package selgo.com.quickspeak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnglishWordsCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_words_categories);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] wordsCategories;
        wordsCategories = getResources().getStringArray(R.array.english_words_categories);

        ListView categories = (ListView) findViewById(R.id.english_category_list);
        ArrayAdapter<String> categoriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wordsCategories);
        categories.setAdapter(categoriesAdapter);
    }
}
