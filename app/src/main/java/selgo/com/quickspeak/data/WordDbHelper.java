package selgo.com.quickspeak.data;

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
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
