package selgo.com.quickspeak;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class EnglishWordsFragment extends ListFragment {

    private long wordId;
    private ArrayList<String> wordValues = new ArrayList<String>();
    private ArrayList<EnglishWord> words;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (this.getWordId() == 0) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.theAlphabet));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),
                    android.R.layout.simple_list_item_1,
                    wordValues);

            setListAdapter(adapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 1) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics1));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),
                    android.R.layout.simple_list_item_1,
                    wordValues);

            setListAdapter(adapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 2) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics2));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),
                    android.R.layout.simple_list_item_1,
                    wordValues);

            setListAdapter(adapter);
            wordValues = null;
            words = null;
        }
    }

    public long getWordId() {
        return wordId;
    }

    public void setWordId(long wordId) {
        this.wordId = wordId;
    }
}
