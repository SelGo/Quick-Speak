package selgo.com.quickspeak;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordCursorAdapter extends CursorAdapter {

    private ImageButton imageButton;
    private int tabPosition;
    private MediaPlayer mediaPlayer;

    public WordCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, final Cursor cursor) {

        TextView word = (TextView) view.findViewById(R.id.language_word);
        TextView translatedWord = (TextView) view.findViewById(R.id.translated_word);
        imageButton = (ImageButton) view.findViewById(R.id.image_button);

        final String wordText = cursor.getString(1);
        String translatedWordText = cursor.getString(2);
        final int soundId = cursor.getInt(3);



        word.setText(wordText);
        translatedWord.setText(translatedWordText);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (tabPosition) {
                    case 0:
                    case 1:
                    default:
                        mediaPlayer = MediaPlayer.create(view.getContext(), soundId);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        break;
                }
            }
        };

        imageButton.setOnClickListener(onClickListener);
    }

/*    @Override
    public long_ getItemId(int position) {

        final int x = position;



        return super.getItemId(position);
    }*/

    public void setTabPosition(int tabPosition) {
        this.tabPosition = tabPosition;
    }
}
