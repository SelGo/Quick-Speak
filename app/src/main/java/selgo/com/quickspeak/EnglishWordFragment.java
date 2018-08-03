package selgo.com.quickspeak;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class EnglishWordFragment extends ListFragment {


    private ArrayList<EnglishWord> words = new ArrayList<>();
    private static String[] arrayDefault = {""};
    private ArrayAdapter<EnglishWord> adapter;
    private ArrayAdapter<String> adapterDefault;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int position = getActivity().getIntent().getExtras().getInt("position");

        switch(position) {
            case 0:
                words.add(new EnglishWord("A", "a"));
                adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, words);
                setListAdapter(adapter);
                break;
            default:
                adapterDefault = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, arrayDefault);
                setListAdapter(adapterDefault);
                break;
        }

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
