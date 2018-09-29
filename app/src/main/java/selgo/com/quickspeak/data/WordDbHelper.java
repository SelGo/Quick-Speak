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


        insertWord(db, "Level 1", "A", "a");
        insertWord(db, "Level 1", "B", "b");
        insertWord(db, "Level 1", "C", "c");
        insertWord(db, "Level 1", "D", "d");
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
