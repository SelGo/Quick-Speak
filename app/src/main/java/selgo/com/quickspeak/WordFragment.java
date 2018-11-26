package selgo.com.quickspeak;


import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import selgo.com.quickspeak.data.WordContract;
import selgo.com.quickspeak.data.WordDbHelper;


public class WordFragment extends Fragment {

    private long wordId;
    private int tabPosition;
    private static String[] arrayDefault = {""};
    private ArrayAdapter<String> adapterDefault;
    private ListView listView;
    private SQLiteDatabase db;
    private Cursor cursor;
    private WordDbHelper mDbHelper;

    public WordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 /*       if(savedInstanceState != null) {
            wordId = savedInstanceState.getLong("wordId");
            wordId = 1;
        }*/
        return inflater.inflate(R.layout.fragment_word, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();

        if(view != null) {
            switch ( (int) wordId) {
                case 0:
                    wordsRetrieveQuery(view, "Level 1");
                    break;
                case 1:
                    wordsRetrieveQuery(view, "Level 2");
                    break;
                default:
                    adapterDefault = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, arrayDefault);
                    listView = (ListView) view.findViewById(R.id.word_items_list);
                    listView.setAdapter(adapterDefault);
                    break;
            }

        }
    }

/*
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("wordId", wordId);
    }
*/

    public void wordsRetrieveQuery(View view, String conditionValue) {
        try {
            mDbHelper = new WordDbHelper(view.getContext());
            db = mDbHelper.getReadableDatabase();

            cursor = db.query(WordContract.WordEntry.TABLE_NAME,
                    new String[]{WordContract.WordEntry._ID, WordContract.WordEntry.COLUMN_ENGLISH_WORD, WordContract.WordEntry.COLUMN_TRANSLATED_WORD},
                    WordContract.WordEntry.COLUMN_LEVEL + "=?",
                    new String[] {conditionValue},
                    null, null, null);

            WordCursorAdapter wordCursorAdapter = new WordCursorAdapter(view.getContext(), cursor);

            listView = (ListView) view.findViewById(R.id.word_items_list);
            listView.setAdapter(wordCursorAdapter);
        } catch (SQLException e) {
            Toast toast = Toast.makeText(view.getContext(), "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
    }
}
