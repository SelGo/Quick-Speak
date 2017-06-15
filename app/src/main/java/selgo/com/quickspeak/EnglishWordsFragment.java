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

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.theAlphabetBackgroundColor);

            setListAdapter(wordAdapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 1) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics1));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }


            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.basics1BackgroundColor);

            setListAdapter(wordAdapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 2) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics2));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.basics2BackgroundColor);

            setListAdapter(wordAdapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 3) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.phrases));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.phrasesBackgroundColor);

            setListAdapter(wordAdapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 4) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.food));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.foodBackgroundColor);

            setListAdapter(wordAdapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 5) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.plurals));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.pluralsBackgroundColor);

            setListAdapter(wordAdapter);
            wordValues = null;
            words = null;
        }

        if (this.getWordId() == 6) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.animals));

            for (int i = 0; i < words.size(); i++) {
                wordValues.add(words.get(i).getEnglishWord());
            }

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.animalsBackgroundColor);

            setListAdapter(wordAdapter);
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
