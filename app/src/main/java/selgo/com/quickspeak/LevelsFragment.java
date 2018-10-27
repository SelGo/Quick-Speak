package selgo.com.quickspeak;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.ListView;

public class LevelsFragment extends ListFragment {

    private static String[] wordsCategories;

    static interface LevelsListener {
        void itemClicked(long id);
    }

    private LevelsListener listener;

    public LevelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        wordsCategories = getResources().getStringArray(R.array.english_word_levels);
        SingleItemAdapter singleItemAdapter = new SingleItemAdapter(inflater.getContext(), wordsCategories);
        setListAdapter(singleItemAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (LevelsListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }

    public static String[] getWordsCategories() {
        return wordsCategories;
    }
}
