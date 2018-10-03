package selgo.com.quickspeak.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import selgo.com.quickspeak.data.WordContract.WordEntry;

public class WordDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "quick_speak.db";
    private static final int DATABASE_VERSION = 1;

    public WordDbHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENGLISH_TABLE = "CREATE TABLE " + WordEntry.TABLE_NAME + "("
                + WordEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WordEntry.COLUMN_LEVEL + " TEXT NOT NULL, "
                + WordEntry.COLUMN_ENGLISH_WORD + " TEXT, "
                + WordEntry.COLUMN_TRANSLATED_WORD + " TEXT);";

        db.execSQL(SQL_CREATE_ENGLISH_TABLE);

        /* Level 1 Words */
        insertWord(db, "Level 1", "A", "a");
        insertWord(db, "Level 1", "B", "b");
        insertWord(db, "Level 1", "C", "c");
        insertWord(db, "Level 1", "D", "d");
        insertWord(db, "Level 1", "E", "e");
        insertWord(db, "Level 1", "F", "f");
        insertWord(db, "Level 1", "G", "g");
        insertWord(db, "Level 1", "H", "h");
        insertWord(db, "Level 1", "I", "i");
        insertWord(db, "Level 1", "J", "j");
        insertWord(db, "Level 1", "K", "k");
        insertWord(db, "Level 1", "L", "l");
        insertWord(db, "Level 1", "M", "m");
        insertWord(db, "Level 1", "N", "n");
        insertWord(db, "Level 1", "O", "o");
        insertWord(db, "Level 1", "P", "p");
        insertWord(db, "Level 1", "Q", "q");
        insertWord(db, "Level 1", "R", "r");
        insertWord(db, "Level 1", "S", "s");
        insertWord(db, "Level 1", "T", "t");
        insertWord(db, "Level 1", "U", "u");
        insertWord(db, "Level 1", "V", "v");
        insertWord(db, "Level 1", "W", "w");
        insertWord(db, "Level 1", "X", "x");
        insertWord(db, "Level 1", "Y", "y");
        insertWord(db, "Level 1", "Z", "z");

        /* Level 2 Words */
        insertWord(db, "Level 2", "apple", "μήλο");
        insertWord(db, "Level 2", "boy", "αγόρι");
        insertWord(db, "Level 2", "bus", "λεωφορείο");
        insertWord(db, "Level 2", "baby", "μωρό");
        insertWord(db, "Level 2", "cat", "γάτα");
        insertWord(db, "Level 2", "cake", "κέικ");
        insertWord(db, "Level 2", "car", "αυτοκίνητο");
        insertWord(db, "Level 2", "dog", "σκύλος");
        insertWord(db, "Level 2", "doll", "κούκλα");
        insertWord(db, "Level 2", "egg", "αυγό");
        insertWord(db, "Level 2", "elephant", "ελέφαντας");
        insertWord(db, "Level 2", "fish", "ψάρι");
        insertWord(db, "Level 2", "girl", "κορίτσι");
        insertWord(db, "Level 2", "giraffe", "καμηλοπάρδαλη");
        insertWord(db, "Level 2", "hat", "καπέλο");
        insertWord(db, "Level 2", "horse", "άλογο");
        insertWord(db, "Level 2", "igloo", "ιγκλού");
        insertWord(db, "Level 2", "ink", "μελάνι");
        insertWord(db, "Level 2", "jar", "βάζο");
        insertWord(db, "Level 2", "jam", "μαρμελάδα");
        insertWord(db, "Level 2", "jacket", "ζακέτα / μπουφάν");
        insertWord(db, "Level 2", "kite", "χαρταετός");
        insertWord(db, "Level 2", "kangaroo", "καγκουρό");
        insertWord(db, "Level 2", "lemon", "λεμόνι");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private static void insertWord (SQLiteDatabase db, String level, String englishWord, String translatedWord) {

        ContentValues wordValues = new ContentValues();

        wordValues.put(WordEntry.COLUMN_LEVEL, level);
        wordValues.put(WordEntry.COLUMN_ENGLISH_WORD, englishWord);
        wordValues.put(WordEntry.COLUMN_TRANSLATED_WORD, translatedWord);

        db.insert(WordEntry.TABLE_NAME, null, wordValues);
    }
}
