package selgo.com.quickspeak;

import android.app.Activity;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import selgo.com.quickspeak.data.WordContract.WordEntry;
import selgo.com.quickspeak.data.WordDbHelper;

public class WordListContainer extends Activity {

    private String[] titles = EnglishLevel.getWordsCategories();

    private static String[] arrayDefault = {""};
    private ArrayAdapter<String> adapterDefault;
    private ListView listView;
    private SQLiteDatabase db;
    private Cursor cursor;
    private WordDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        int position = getIntent().getExtras().getInt("position");
        getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));

        switch (position) {
            case 0:
                getActionBar().setTitle(titles[0]);

                try {
                    mDbHelper = new WordDbHelper(this);
                    db = mDbHelper.getReadableDatabase();

                    cursor = db.query(WordEntry.TABLE_NAME,
                            new String[]{WordEntry._ID, WordEntry.COLUMN_ENGLISH_WORD, WordEntry.COLUMN_TRANSLATED_WORD},
                            WordEntry.COLUMN_LEVEL + "=?",
                            new String[] {"Level 1"},
                            null, null, null);

                    WordCursorAdapter wordCursorAdapter = new WordCursorAdapter(this, cursor);

                    listView = (ListView) findViewById(R.id.word_items_list);
                    listView.setAdapter(wordCursorAdapter);
                } catch (SQLException e) {
                    Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
                    toast.show();
                }

                break;
            case 1:
                getActionBar().setTitle(titles[1]);

                try {
                    mDbHelper = new WordDbHelper(this);
                    db = mDbHelper.getReadableDatabase();

                    cursor = db.query(WordEntry.TABLE_NAME,
                            new String[]{WordEntry._ID, WordEntry.COLUMN_ENGLISH_WORD, WordEntry.COLUMN_TRANSLATED_WORD},
                            WordEntry.COLUMN_LEVEL + "=?",
                            new String[] {"Level 2"},
                            null, null, null);

                    WordCursorAdapter wordCursorAdapter = new WordCursorAdapter(this, cursor);

                    listView = (ListView) findViewById(R.id.word_items_list);
                    listView.setAdapter(wordCursorAdapter);
                } catch (SQLException e) {
                    Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
                    toast.show();
                }

                break;
            default:
                getActionBar().setTitle(R.string.app_name);

                adapterDefault = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayDefault);
                listView = (ListView) findViewById(R.id.word_items_list);
                listView.setAdapter(adapterDefault);
                break;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
    }
}
