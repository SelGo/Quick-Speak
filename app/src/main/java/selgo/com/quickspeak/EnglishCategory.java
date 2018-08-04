package selgo.com.quickspeak;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
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
            englishWordsIntent.putExtra("position", position);
            startActivity(englishWordsIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_word_categories);

        getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));

        wordsCategories = getResources().getStringArray(R.array.english_word_categories);
        ListView categories = (ListView) findViewById(R.id.english_category_list);
        categories.setOnItemClickListener(itemClickListener);
        SingleItemAdapter singleItemAdapter = new SingleItemAdapter(this, wordsCategories);
        categories.setAdapter(singleItemAdapter);

    }

    public static String[] getWordsCategories() {
        return wordsCategories;
    }
}
