package selgo.com.quickspeak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnglishCategory extends Activity {

    private static String[] wordsCategories;

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent englishWordsIntent = new Intent(EnglishCategory.this, WordListContainer.class);
            englishWordsIntent.putExtra("id", (int) id);
            startActivity(englishWordsIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_word_categories);

        wordsCategories = getResources().getStringArray(R.array.english_word_categories);

        ListView categories = (ListView) findViewById(R.id.english_category_list);
        categories.setOnItemClickListener(itemClickListener);
        ArrayAdapter<String> categoriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wordsCategories);
        categories.setAdapter(categoriesAdapter);
    }

    public static String[] getWordsCategories() {
        return wordsCategories;
    }
}
