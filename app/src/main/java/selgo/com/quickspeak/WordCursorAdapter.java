package selgo.com.quickspeak;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class WordCursorAdapter extends CursorAdapter {

    public WordCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
            TextView word = (TextView) view.findViewById(R.id.language_word);
            TextView translatedWord = (TextView) view.findViewById(R.id.translated_word);

            String wordText = cursor.getString(1);
            String translatedWordText = cursor.getString(2);

            word.setText(wordText);
            translatedWord.setText(translatedWordText);
    }
}
