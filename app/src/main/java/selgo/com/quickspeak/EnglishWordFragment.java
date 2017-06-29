package selgo.com.quickspeak;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


import java.util.ArrayList;
import java.util.Arrays;

public class EnglishWordFragment extends Fragment {

    private long wordId;
    private ArrayList<EnglishWord> words;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.english_word_fragment_layout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (this.getWordId() == 0) {

            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.theEnglishAlphabet));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.theAlphabetBackgroundColor);

            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);
            words = null;
        }

        if (this.getWordId() == 1) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics1));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.basics1BackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);

            words = null;
        }

        if (this.getWordId() == 2) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics2));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.basics2BackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);

            words = null;
        }

        if (this.getWordId() == 3) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.phrases));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.phrasesBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);

            words = null;
        }

        if (this.getWordId() == 4) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.food));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.foodBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);

            words = null;
        }

        if (this.getWordId() == 5) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.plurals));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.pluralsBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);

            words = null;
        }

        if (this.getWordId() == 6) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.animals));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.animalsBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);

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
