package selgo.com.quickspeak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<EnglishWord> {

    public WordAdapter(Context context, ArrayList<EnglishWord> englishWords) {
        super(context, 0, englishWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        EnglishWord currentEnglishWord = getItem(position);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.word_translations_list);

        TextView englishWord = (TextView) listItemView.findViewById(R.id.language_word);
        englishWord.setText(currentEnglishWord.getEnglishWord());

        TextView translatedWord = (TextView) listItemView.findViewById(R.id.translated_word);
        translatedWord.setText(currentEnglishWord.getTranslatedWord());

        return listItemView;
    }
}
