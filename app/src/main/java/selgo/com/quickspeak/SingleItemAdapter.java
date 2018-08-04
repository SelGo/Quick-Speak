package selgo.com.quickspeak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SingleItemAdapter extends ArrayAdapter<String> {

    public SingleItemAdapter (Context context, String[] labels) {
        super(context, 0, labels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.single_list_item, parent, false);
        }

        String language = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.label_text);
        textView.setText(language);

        return listItemView;
    }
}
