package selgo.com.quickspeak;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import selgo.com.quickspeak.data.WordContract;
import selgo.com.quickspeak.data.WordContract.WordEntry;
import selgo.com.quickspeak.data.WordDbHelper;

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
                displayDatabaseInfo();
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
                displayDatabaseInfo();
                getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorRed)));
                getActionBar().setTitle(titles[1]);

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

    /**
     *  Temporary method to test if quick_speak.db database is created properly and it's ready for using.
     */
    private void displayDatabaseInfo() {
        WordDbHelper mDbHelper = new WordDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        Cursor cursor = db.query(WordEntry.TABLE_NAME,
                new String[]{WordEntry.COLUMN_ENGLISH_WORD, WordEntry.COLUMN_TRANSLATED_WORD},
                WordEntry.COLUMN_LEVEL + "=?",
                new String[] {"Level 1"},
                null, null, null);

        /*Cursor cursor = db.rawQuery("SELECT * FROM " + WordEntry.TABLE_NAME, null);*/


        try {
            TextView dbTestText = (TextView) findViewById(R.id.db_test_text);
            dbTestText.setText(cursor.getCount() + "");
            /*if(cursor.moveToFirst()) {
                dbTestText.setText(cursor.getString(0));
            }*/
        } finally {
            cursor.close();
            db.close();
        }
    }
}
