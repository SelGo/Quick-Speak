package selgo.com.quickspeak;

import android.content.Context;

import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<EnglishWord>{

    private int colorResourceId;

    public WordAdapter(Context context, ArrayList<EnglishWord> words) {
        super(context, 0, words);
    }

    public WordAdapter(Context context, ArrayList<EnglishWord> words, int colorResourceId) {
        super(context, 0, words);
        this.colorResourceId = colorResourceId;
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

        View textContainer = englishWordListView.findViewById(R.id.word_container);
        int color = ContextCompat.getColor(getContext(), this.colorResourceId);
        textContainer.setBackgroundColor(color);

        return englishWordListView;
    }
}
