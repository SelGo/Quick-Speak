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
        insertWord(db, "Level 1", "A a", "Το 1ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "B b", "Το 2ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "C c", "Το 3ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "D d", "Το 4ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "E e", "Το 5ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "F f", "Το 6ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "G g", "Το 7ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "H h", "Το 8ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "I i", "Το 9ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "J j", "Το 10ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "K k", "Το 11ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "L l", "Το 12ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "M m", "Το 13ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "N n", "Το 14ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "O o", "Το 15ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "P p", "Το 16ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "Q q", "Το 17ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "R r", "Το 18ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "S s", "Το 19ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "T t", "Το 20ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "U u", "Το 21ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "V v", "Το 22ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "W w", "Το 23ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "X x", "Το 24ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "Y y", "Το 25ο γράμμα του αγγλικού αλφαβήτου");
        insertWord(db, "Level 1", "Z z", "Το 26ο γράμμα του αγγλικού αλφαβήτου");

        /* Level 2 Words */
        insertWord(db, "Level 2", "hello / hi", "γειά σου");
        insertWord(db, "Level 2", "Let's go!", "Ας πάμε!");
        insertWord(db, "Level 2", "please", "παρακαλώ (όταν ζητάω κάτι)");
        insertWord(db, "Level 2", "good morning", "καλημέρα");
        insertWord(db, "Level 2", "good night", "καληνύχτα");
        insertWord(db, "Level 2", "yes", "ναι");
        insertWord(db, "Level 2", "no", "όχι");
        insertWord(db, "Level 2", "Cheers!", "Στην υγειά μας!");
        insertWord(db, "Level 2", "Thank you! / Thanks!", "Σε ευχαριστώ / Ευχαριστώ");
        insertWord(db, "Level 2", "You're welcome!", "Παρακαλώ (όταν προσφέρω κάτι)");
        insertWord(db, "Level 2", "I'm sorry", "Συγνώμη");
        insertWord(db, "Level 2", "See you later.", "Τα λέμε μετά.");
        insertWord(db, "Level 2", "goodbye", "αντίο");
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
