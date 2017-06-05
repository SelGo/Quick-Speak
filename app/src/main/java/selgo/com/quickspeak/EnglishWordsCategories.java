package selgo.com.quickspeak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnglishWordsCategories extends AppCompatActivity {

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent englishWordsIntent = new Intent(EnglishWordsCategories.this, WordListContainer.class);
            englishWordsIntent.putExtra(WordListContainer.WORD_ID, (int) id);
            startActivity(englishWordsIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_words_categories);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] wordsCategories;
        wordsCategories = getResources().getStringArray(R.array.english_words_categories);

        ListView categories = (ListView) findViewById(R.id.english_category_list);
        categories.setOnItemClickListener(itemClickListener);
        ArrayAdapter<String> categoriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wordsCategories);
        categories.setAdapter(categoriesAdapter);


    }
}
