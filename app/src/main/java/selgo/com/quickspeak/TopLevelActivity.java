package selgo.com.quickspeak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends Activity {
    private static String[] languages;

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:
                    Intent englishWordsIntent = new Intent(TopLevelActivity.this, EnglishLevel.class);
                    englishWordsIntent.putExtra("position", position);
                    startActivity(englishWordsIntent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        languages = getResources().getStringArray(R.array.languages);

        ListView languagesList = (ListView) findViewById(R.id.languages_list);
        languagesList.setOnItemClickListener(itemClickListener);
        LanguageItemAdapter languageItemAdapter = new LanguageItemAdapter(this, languages);
        languagesList.setAdapter(languageItemAdapter);
    }
}
