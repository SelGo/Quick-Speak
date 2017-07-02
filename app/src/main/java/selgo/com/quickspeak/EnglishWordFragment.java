package selgo.com.quickspeak;

import android.app.Fragment;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


import java.util.ArrayList;
import java.util.Arrays;

public class EnglishWordFragment extends Fragment {

    private long wordId;
    private ArrayList<EnglishWord> words;
    private AudioManager audioManager;
    private MediaPlayer mediaPlayer;

    private void releasePlayer() {
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releasePlayer();
        }
    };

    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT
                    || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releasePlayer();
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.english_word_fragment_layout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);
        View view = getView();

        if (this.getWordId() == 0) {
            layoutSetup(view, EnglishWord.theEnglishAlphabet, R.color.theAlphabetBackgroundColor);
        }

        if (this.getWordId() == 1) {
            layoutSetup(view, EnglishWord.numbers, R.color.numbersBackgroundColor);
        }

        if (this.getWordId() == 2) {
            layoutSetup(view, EnglishWord.basics2, R.color.basics2BackgroundColor);
        }

        if (this.getWordId() == 3) {
            layoutSetup(view, EnglishWord.phrases, R.color.phrasesBackgroundColor);
        }

        if (this.getWordId() == 4) {
            layoutSetup(view, EnglishWord.food, R.color.foodBackgroundColor);
        }

        if (this.getWordId() == 5) {
            layoutSetup(view, EnglishWord.plurals, R.color.pluralsBackgroundColor);
        }

        if (this.getWordId() == 6) {
            layoutSetup(view, EnglishWord.animals, R.color.animalsBackgroundColor);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        releasePlayer();
    }

    public long getWordId() {
        return wordId;
    }

    public void setWordId(long wordId) {
        this.wordId = wordId;
    }

    public void layoutSetup(View view, final EnglishWord[] array, int colorId){

        words = new ArrayList<EnglishWord>(Arrays.asList(array));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, colorId);

        GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
        gridView.setAdapter(wordAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releasePlayer();
                EnglishWord englishWord = words.get(position);
                int audioResult = audioManager.requestAudioFocus(onAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if(audioResult == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer = MediaPlayer.create(getActivity(), englishWord.getAudioId());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(completionListener);
                }
            }
        });
    }
}
