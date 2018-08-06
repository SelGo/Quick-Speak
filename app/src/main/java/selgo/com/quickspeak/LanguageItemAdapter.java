package selgo.com.quickspeak;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LanguageItemAdapter extends ArrayAdapter<String> {

    public LanguageItemAdapter (Context context, String[] labels) {
        super(context, 0, labels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.language_list_item, parent, false);
        }

        String language = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.language_item);
        textView.setText(language);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.languages_list_layout);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.language_icon);
        Drawable d;

        switch (position){
            case 0:
                d = parent.getContext().getResources().getDrawable(R.color.colorEnglish);
                linearLayout.setBackground(d);
                imageView.setImageResource(R.mipmap.english_flag);
                break;
            default:
                d = parent.getContext().getResources().getDrawable(R.color.colorMaterialGray);
                linearLayout.setBackground(d);
                imageView.setImageResource(R.mipmap.ic_launcher_round);
                break;
        }

        return listItemView;
    }

}
