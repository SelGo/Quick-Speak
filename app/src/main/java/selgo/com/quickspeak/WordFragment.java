package selgo.com.quickspeak;


import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import selgo.com.quickspeak.data.WordContract;
import selgo.com.quickspeak.data.WordDbHelper;


public class WordFragment extends Fragment {

    private static String[] arrayDefault = {""};
    private ArrayAdapter<String> adapterDefault;
    private ListView listView;
    private SQLiteDatabase db;
    private Cursor cursor;
    private WordDbHelper mDbHelper;
    private RecyclerView recyclerView;

    public WordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_word, container, false);
        return recyclerView;
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        int tabPosition = getArguments().getInt("tabPosition");
        if(view != null) {
            switch ( tabPosition ) {
                case 0:
                    wordsRetrieveQuery(view, "Level 1");
                    break;
                case 1:
                    wordsRetrieveQuery(view, "Level 2");
                    break;
                default:
                    wordsRetrieveQuery(view, "Level 1");
                    break;
            }
        }
    }

    public void wordsRetrieveQuery(View view, String conditionValue) {
        try {
            mDbHelper = new WordDbHelper(view.getContext());
            db = mDbHelper.getReadableDatabase();

            cursor = db.query(WordContract.WordEntry.TABLE_NAME,
                    new String[]{WordContract.WordEntry._ID, WordContract.WordEntry.COLUMN_ENGLISH_WORD, WordContract.WordEntry.COLUMN_TRANSLATED_WORD},
                    WordContract.WordEntry.COLUMN_LEVEL + "=?",
                    new String[] {conditionValue},
                    null, null, null);

           /* WordCursorAdapter wordCursorAdapter = new WordCursorAdapter(view.getContext(), cursor);

            listView = (ListView) view.findViewById(R.id.word_items_list);
            listView.setAdapter(wordCursorAdapter);*/

            WordAdapter wordAdapter = new WordAdapter(view.getContext(), cursor);
            recyclerView.setAdapter(wordAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(linearLayoutManager);
        } catch (SQLException e) {
            Toast toast = Toast.makeText(view.getContext(), "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public static WordFragment newInstance(int tabPosition) {
        WordFragment wordFragment = new WordFragment();

        Bundle arguments = new Bundle();
        arguments.putInt("tabPosition", tabPosition);
        wordFragment.setArguments(arguments);

        return wordFragment;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
    }
}
