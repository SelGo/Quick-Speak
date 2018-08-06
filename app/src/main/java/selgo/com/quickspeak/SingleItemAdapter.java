package selgo.com.quickspeak;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
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

        Drawable d;
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.category_list);

        switch(position) {
            case 0:
            case 2:
            case 4:
            case 6:
                d = parent.getContext().getResources().getDrawable(R.color.colorEnglish);
                linearLayout.setBackground(d);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
                d = parent.getContext().getResources().getDrawable(R.color.colorRed);
                linearLayout.setBackground(d);
                break;
            default:
                d = parent.getContext().getResources().getDrawable(R.color.colorDefault);
                linearLayout.setBackground(d);
                break;

        }

        return listItemView;
    }
}
