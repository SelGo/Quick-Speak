package selgo.com.quickspeak.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import selgo.com.quickspeak.R;
import selgo.com.quickspeak.data.WordContract.WordEntry;

public class WordDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "quick_speak.db";
    private static final int DATABASE_VERSION = 1;

    public WordDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENGLISH_TABLE = "CREATE TABLE " + WordEntry.TABLE_NAME + "("
                + WordEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WordEntry.COLUMN_LEVEL + " TEXT NOT NULL, "
                + WordEntry.COLUMN_ENGLISH_WORD + " TEXT, "
                + WordEntry.COLUMN_TRANSLATED_WORD + " TEXT, "
                + WordEntry.COLUMN_WORD_SOUND_ID + " TEXT);";

        db.execSQL(SQL_CREATE_ENGLISH_TABLE);

        /* Level 1 Words */
        insertWord(db, "Level 1", "A a", "Το 1ο γράμμα του αγγλικού αλφαβήτου", R.raw.a);
        insertWord(db, "Level 1", "B b", "Το 2ο γράμμα του αγγλικού αλφαβήτου", R.raw.b);
        insertWord(db, "Level 1", "C c", "Το 3ο γράμμα του αγγλικού αλφαβήτου", R.raw.c);
        insertWord(db, "Level 1", "D d", "Το 4ο γράμμα του αγγλικού αλφαβήτου", R.raw.d);
        insertWord(db, "Level 1", "E e", "Το 5ο γράμμα του αγγλικού αλφαβήτου", R.raw.e);
        insertWord(db, "Level 1", "F f", "Το 6ο γράμμα του αγγλικού αλφαβήτου", R.raw.f);
        insertWord(db, "Level 1", "G g", "Το 7ο γράμμα του αγγλικού αλφαβήτου", R.raw.g);
        insertWord(db, "Level 1", "H h", "Το 8ο γράμμα του αγγλικού αλφαβήτου", R.raw.h);
        insertWord(db, "Level 1", "I i", "Το 9ο γράμμα του αγγλικού αλφαβήτου", R.raw.i);
        insertWord(db, "Level 1", "J j", "Το 10ο γράμμα του αγγλικού αλφαβήτου", R.raw.j);
        insertWord(db, "Level 1", "K k", "Το 11ο γράμμα του αγγλικού αλφαβήτου", R.raw.k);
        insertWord(db, "Level 1", "L l", "Το 12ο γράμμα του αγγλικού αλφαβήτου", R.raw.l);
        insertWord(db, "Level 1", "M m", "Το 13ο γράμμα του αγγλικού αλφαβήτου", R.raw.m);
        insertWord(db, "Level 1", "N n", "Το 14ο γράμμα του αγγλικού αλφαβήτου", R.raw.n);
        insertWord(db, "Level 1", "O o", "Το 15ο γράμμα του αγγλικού αλφαβήτου", R.raw.o);
        insertWord(db, "Level 1", "P p", "Το 16ο γράμμα του αγγλικού αλφαβήτου", R.raw.p);
        insertWord(db, "Level 1", "Q q", "Το 17ο γράμμα του αγγλικού αλφαβήτου", R.raw.q);
        insertWord(db, "Level 1", "R r", "Το 18ο γράμμα του αγγλικού αλφαβήτου", R.raw.r);
        insertWord(db, "Level 1", "S s", "Το 19ο γράμμα του αγγλικού αλφαβήτου", R.raw.s);
        insertWord(db, "Level 1", "T t", "Το 20ο γράμμα του αγγλικού αλφαβήτου", R.raw.t);
        insertWord(db, "Level 1", "U u", "Το 21ο γράμμα του αγγλικού αλφαβήτου", R.raw.u);
        insertWord(db, "Level 1", "V v", "Το 22ο γράμμα του αγγλικού αλφαβήτου", R.raw.v);
        insertWord(db, "Level 1", "W w", "Το 23ο γράμμα του αγγλικού αλφαβήτου", R.raw.w);
        insertWord(db, "Level 1", "X x", "Το 24ο γράμμα του αγγλικού αλφαβήτου", R.raw.x);
        insertWord(db, "Level 1", "Y y", "Το 25ο γράμμα του αγγλικού αλφαβήτου", R.raw.y);
        insertWord(db, "Level 1", "Z z", "Το 26ο γράμμα του αγγλικού αλφαβήτου", R.raw.z);

        /* Level 2 Words */
        insertWord(db, "Level 2","0 zero", "μηδέν", R.raw.zero);
        insertWord(db, "Level 2","1 one", "ένα", R.raw.one);
        insertWord(db, "Level 2","2 two", "δύο", R.raw.two);
        insertWord(db, "Level 2","3 three", "τρία", R.raw.three);
        insertWord(db, "Level 2","4 four", "τέσσερα", R.raw.four);
        insertWord(db, "Level 2","5 five", "πέντε", R.raw.five);
        insertWord(db, "Level 2","6 six", "έξι", R.raw.six);
        insertWord(db, "Level 2","7 seven", "επτά", R.raw.seven);
        insertWord(db, "Level 2","8 eight", "οκτώ", R.raw.eight);
        insertWord(db, "Level 2","9 nine", "εννέα", R.raw.nine);
        insertWord(db, "Level 2","10 ten", "δέκα", R.raw.ten);
        insertWord(db, "Level 2","11 eleven", "έντεκα", R.raw.eleven);
        insertWord(db, "Level 2","12 twelve", "δώδεκα", R.raw.twelve);
        insertWord(db, "Level 2","13 thirteen", "δέκα-τρια", R.raw.thirteen);
        insertWord(db, "Level 2","14 fourteen", "δεκα-τέσσερα", R.raw.fourteen);
        insertWord(db, "Level 2","15 fifteen", "δεκα-πέντε", R.raw.fifteen);
        insertWord(db, "Level 2","16 sixteen", "δεκα-έξι", R.raw.sixteen);
        insertWord(db, "Level 2","17 seventeen", "δεκα-έπτα", R.raw.seventeen);
        insertWord(db, "Level 2","18 eighteen", "δεκα-οκτω", R.raw.eighteen);
        insertWord(db, "Level 2","19 nineteen", "δεκα-εννέα", R.raw.nineteen);
        insertWord(db, "Level 2","20 twenty", "είκοσι", R.raw.twenty);
        insertWord(db, "Level 2","21 twenty-one", "είκοσι-ένα", R.raw.twenty_one);
        insertWord(db, "Level 2","22 twenty-two", "είκοσι-δύο", R.raw.twenty_two);
        insertWord(db, "Level 2","23 twenty-three", "είκοσι-τρία", R.raw.twenty_three);
        insertWord(db, "Level 2","24 twenty-four", "είκοσι-τέσσερα", R.raw.twenty_four);
        insertWord(db, "Level 2","25 twenty-five", "είκοσι-πεντε", R.raw.twenty_five);
        insertWord(db, "Level 2","26 twenty-six", "είκοσι-έξι", R.raw.twenty_six);
        insertWord(db, "Level 2","27 twenty-seven", "είκοσι-επτά", R.raw.twenty_seven);
        insertWord(db, "Level 2","28 twenty-eight", "είκοσι-οκτώ", R.raw.twenty_eight);
        insertWord(db, "Level 2","29 twenty-nine", "είκοσι-εννέα", R.raw.twenty_nine);
        insertWord(db, "Level 2","30 thirty", "τριάντα", R.raw.thirty);
        insertWord(db, "Level 2","31 thirty-one", "τριάντα-ένα", R.raw.thirty_one);
        insertWord(db, "Level 2","32 thirty-two", "τριάντα-δύο", R.raw.thirty_two);
        insertWord(db, "Level 2","33 thirty-three", "τριάντα-τρία", R.raw.thirty_three);
        insertWord(db, "Level 2","34 thirty-four", "τριάντα-τέσσερα", R.raw.thirty_four);
        insertWord(db, "Level 2","35 thirty-five", "τριαντα-πέντε", R.raw.thirty_five);
        insertWord(db, "Level 2","36 thirty-six", "τριάντα-έξι", R.raw.thirty_six);
        insertWord(db, "Level 2","37 thirty-seven", "τριάντα-επτά", R.raw.thirty_seven);
        insertWord(db, "Level 2","38 thirty-eight", "τριάντα-οκτώ", R.raw.thirty_eight);
        insertWord(db, "Level 2","39 thirty-nine", "τριάντα-εννέα", R.raw.thirty_nine);
        insertWord(db, "Level 2","40 forty", "σαράντα", R.raw.forty);
        insertWord(db, "Level 2","41 forty-one", "σαραντα-ένα", R.raw.forty_one);
        insertWord(db, "Level 2","42 forty-two", "σαράντα-δύο", R.raw.forty_two);
        insertWord(db, "Level 2","43 forty-three", "σαράντα-τρία", R.raw.forty_three);
        insertWord(db, "Level 2","44 forty-four", "σαράντα-τέσσερα", R.raw.forty_four);
        insertWord(db, "Level 2","45 forty-five", "σαράντα-πέντε", R.raw.forty_five);
        insertWord(db, "Level 2","46 forty-six", "σαράντα-έξι", R.raw.forty_six);
        insertWord(db, "Level 2","47 forty-seven", "σαράντα-επτά", R.raw.forty_seven);
        insertWord(db, "Level 2","48 forty-eight", "σαράντα-οκτώ", R.raw.forty_eight);
        insertWord(db, "Level 2","49 forty-nine", "σαράντα-εννεά", R.raw.forty_nine);
        insertWord(db, "Level 2","50 fifty", "πενήντα", R.raw.fifty);
        insertWord(db, "Level 2","51 fifty-one", "πενήντα-ένα", R.raw.fifty_one);
        insertWord(db, "Level 2","52 fifty-two", "πενήντα-δύο", R.raw.fifty_two);
        insertWord(db, "Level 2","53 fifty-three", "πενήντα-τρία", R.raw.fifty_three);
        insertWord(db, "Level 2", "54 fifty-four", "πενήντα-τέσσερα", R.raw.fifty_four);
        insertWord(db, "Level 2", "55 fifty-five", "πενήντα-πέντε", R.raw.fifty_five);
        insertWord(db, "Level 2", "56 fifty-six", "πενήντα-έξι", R.raw.fifty_six);
        insertWord(db, "Level 2", "57 fifty-seven", "πενήντα-επτά", R.raw.fifty_seven);
        insertWord(db, "Level 2", "58 fifty-eight", "πενήντα-οκτώ", R.raw.fifty_eight);
        insertWord(db, "Level 2", "59 fifty-nine", "πενήντα-εννέα", R.raw.fifty_nine);
        insertWord(db, "Level 2", "60 sixty", "εξήντα", R.raw.sixty);
        insertWord(db, "Level 2", "61 sixty-one", "εξήντα-ένα", R.raw.sixty_one);
        insertWord(db, "Level 2", "62 sixty-two", "εξήντα-δύο", R.raw.sixty_two);
        insertWord(db, "Level 2", "63 sixty-three", "εξηντα-τρία", R.raw.sixty_three);
        insertWord(db, "Level 2", "64 sixty-four", "εξήντα-τέσσερα", R.raw.sixty_four);
        insertWord(db, "Level 2", "65 sixty-five", "εξήντα-πέντε", R.raw.sixty_five);
        insertWord(db, "Level 2", "66 sixty-six", "εξήντα-έξι", R.raw.sixty_six);
        insertWord(db, "Level 2", "67 sixty-seven", "εξήντα-επτά", R.raw.sixty_seven);
        insertWord(db, "Level 2", "68 sixty-eight", "εξήντα-οκτώ", R.raw.sixty_eight);
        insertWord(db, "Level 2", "69 sixty-nine", "εξήντα-εννεά", R.raw.sixty_nine);
        insertWord(db, "Level 2", "70 seventy", "εβδομήντα", R.raw.seventy);
        insertWord(db, "Level 2", "71 seventy-one", "εβδομήντα-ένα", R.raw.seventy_one);
        insertWord(db, "Level 2", "72 seventy-two", "εβδομήντα-δύο", R.raw.seventy_two);
        insertWord(db, "Level 2", "73 seventy-three", "εβδομήντα-τρία", R.raw.seventy_three);
        insertWord(db, "Level 2", "74 seventy-four", "εβδομήντα-τέσσερα", R.raw.seventy_four);
        insertWord(db, "Level 2", "75 seventy-five", "εβδομήντα-πέντε", R.raw.seventy_five);
        insertWord(db, "Level 2", "76 seventy-six", "εβδομήντα-έξι", R.raw.seventy_six);
        insertWord(db, "Level 2", "77 seventy-seven", "εβδομήντα-επτά", R.raw.seventy_seven);
        insertWord(db, "Level 2", "78 seventy-eight", "εβδομήντα-οκτώ", R.raw.seventy_eight);
        insertWord(db, "Level 2", "79 seventy-nine", "εβδομήντα-εννέα", R.raw.seventy_nine);
        insertWord(db, "Level 2", "80 eighty", "ογδόντα", R.raw.eighty);
        insertWord(db, "Level 2", "81 eighty-one", "ογδόντα-ένα", R.raw.eighty_one);
        insertWord(db, "Level 2", "82 eighty-two", "ογδόντα-δύο", R.raw.eighty_two);
        insertWord(db, "Level 2", "83 eighty-three", "ογδόντα-τρία", R.raw.eighty_three);
        insertWord(db, "Level 2", "84 eighty-four", "ογδοντά-τέσσερα", R.raw.eighty_four);
        insertWord(db, "Level 2", "85 eighty-five", "ογδόντα-πέντε", R.raw.eighty_five);
        insertWord(db, "Level 2", "86 eighty-six", "ογδόντα-έξι", R.raw.eighty_six);
        insertWord(db, "Level 2", "87 eighty-seven", "ογδόντα-έπτα", R.raw.eighty_seven);
        insertWord(db, "Level 2", "88 eighty-eight", "ογδόντα-οκτώ", R.raw.eighty_eight);
        insertWord(db, "Level 2", "89 eighty-nine", "ογδόντα-εννέα", R.raw.eighty_nine);
        insertWord(db, "Level 2", "90 ninety", "ενενήντα", R.raw.ninety);
        insertWord(db, "Level 2", "91 ninety-one", "ενενήντα-ένα", R.raw.ninety_one);
        insertWord(db, "Level 2", "92 ninety-two", "ενενήντα-δύο", R.raw.ninety_two);
        insertWord(db, "Level 2", "93 ninety-three", "ενενήντα-τρία", R.raw.ninety_three);
        insertWord(db, "Level 2", "94 ninety-four", "ενενήντα-τέσσερα", R.raw.ninety_four);
        insertWord(db, "Level 2", "95 ninety-five", "ενενήντα-πέντε", R.raw.ninety_five);
        insertWord(db, "Level 2", "96 ninety-six", "ενενήντα-έξι", R.raw.ninety_six);
        insertWord(db, "Level 2", "97 ninety-seven", "ενενήντα-έπτα", R.raw.ninety_seven);
        insertWord(db, "Level 2", "98 ninety-eight", "ενενήντα-όκτω", R.raw.ninety_eight);
        insertWord(db, "Level 2", "99 ninety-nine", "ενενήντα-εννέα", R.raw.ninety_nine);
        insertWord(db, "Level 2","100 one hundred", "εκατό", R.raw.one_hundred);
        insertWord(db, "Level 2","1000 one thousand", "χίλια", R.raw.one_thousand);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private static void insertWord(SQLiteDatabase db, String level, String englishWord, String translatedWord) {

        ContentValues wordValues = new ContentValues();

        wordValues.put(WordEntry.COLUMN_LEVEL, level);
        wordValues.put(WordEntry.COLUMN_ENGLISH_WORD, englishWord);
        wordValues.put(WordEntry.COLUMN_TRANSLATED_WORD, translatedWord);

        db.insert(WordEntry.TABLE_NAME, null, wordValues);
    }

    private static void insertWord(SQLiteDatabase db, String level, String englishWord, String translatedWord, int soundId) {

        ContentValues wordValues = new ContentValues();

        wordValues.put(WordEntry.COLUMN_LEVEL, level);
        wordValues.put(WordEntry.COLUMN_ENGLISH_WORD, englishWord);
        wordValues.put(WordEntry.COLUMN_TRANSLATED_WORD, translatedWord);
        wordValues.put(WordEntry.COLUMN_WORD_SOUND_ID, soundId);

        db.insert(WordEntry.TABLE_NAME, null, wordValues);
    }
}
