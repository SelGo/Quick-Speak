package selgo.com.quickspeak;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class EnglishWordFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        int position = getActivity().getIntent().getExtras().getInt("position");
        ArrayAdapter<EnglishWord> adapter;
        ArrayAdapter<String> adapterDefault;

        switch(position) {
            case 0:
                adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, EnglishWord.theAlphabet);
                setListAdapter(adapter);
                break;
            default:
                adapterDefault = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, EnglishWord.arrayDefault);
                setListAdapter(adapterDefault);
                break;
        }

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
