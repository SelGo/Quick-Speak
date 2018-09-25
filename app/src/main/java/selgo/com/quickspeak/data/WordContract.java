package selgo.com.quickspeak.data;

import android.provider.BaseColumns;

public class WordContract {

    private WordContract() {};

    public static final class WordEntry implements BaseColumns {

        public final static String TABLE_NAME = "english";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_LEVEL = "level";
        public final static String COLUMN_ENGLISH_WORD = "english_word";
        public final static String COLUMN_TRANSLATED_WORD = "translated_word";

    }
}
