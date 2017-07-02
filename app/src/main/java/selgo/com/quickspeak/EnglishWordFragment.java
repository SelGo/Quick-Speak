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

            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.theEnglishAlphabet));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.theAlphabetBackgroundColor);

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

        if (this.getWordId() == 1) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.numbers));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.numbersBackgroundColor);
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

        if (this.getWordId() == 2) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.basics2));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.basics2BackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);
        }

        if (this.getWordId() == 3) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.phrases));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.phrasesBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);
        }

        if (this.getWordId() == 4) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.food));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.foodBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);
        }

        if (this.getWordId() == 5) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.plurals));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.pluralsBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);
        }

        if (this.getWordId() == 6) {
            words = new ArrayList<EnglishWord>(Arrays.asList(EnglishWord.animals));

            WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.animalsBackgroundColor);
            GridView gridView = (GridView) view.findViewById(R.id.english_word_grid);
            gridView.setAdapter(wordAdapter);
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
}
