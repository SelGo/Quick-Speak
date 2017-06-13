package selgo.com.quickspeak;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<EnglishWord>{

    public WordAdapter(Context context, ArrayList<EnglishWord> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View englishWordListView = convertView;

        if(englishWordListView == null) {
            englishWordListView = LayoutInflater.from(getContext()).inflate(R.layout.english_word_list_item, parent, false);
        }

        EnglishWord englishWord = getItem(position);

        TextView englishWordText = (TextView) englishWordListView.findViewById(R.id.english_word);
        englishWordText.setText(englishWord.getEnglishWord());

        TextView translatedWordText = (TextView) englishWordListView.findViewById(R.id.translated_word);
        translatedWordText.setText(englishWord.getTranslatedWord());

        return englishWordListView;
    }
}
