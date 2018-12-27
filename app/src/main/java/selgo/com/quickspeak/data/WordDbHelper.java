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
        insertWord(db, "Level 2", "Hi", "Γειά σου", R.raw.hi);
        insertWord(db, "Level 2", "Let's go", "Πάμε", R.raw.let_s_go);
        insertWord(db, "Level 2", "please", "παρακαλώ", R.raw.please);
        insertWord(db, "Level 2", "good morning", "καλημέρα", R.raw.good_morning);
        insertWord(db, "Level 2", "good night", "καληνύχτα", R.raw.good_night);
        insertWord(db, "Level 2", "yes", "ναι", R.raw.yes);
        insertWord(db, "Level 2", "no", "όχι", R.raw.no);
        insertWord(db, "Level 2", "cheers", "Στην υγειά μας!", R.raw.cheers);
        insertWord(db, "Level 2", "thank you", "ευχαριστώ", R.raw.thank_you);
        insertWord(db, "Level 2", "you are welcome", "παρακαλώ (όταν προσφέρω κάτι)", R.raw.you_re_welcome);
        insertWord(db, "Level 2", "I'm sorry", "Συγνώμη / Λυπάμαι", R.raw.i_m_sorry);
        insertWord(db, "Level 2", "see you later", "τα λέμε μετά", R.raw.see_you_later);
        insertWord(db, "Level 2", "goodbye", "αντίο", R.raw.goodbye);

        /* Level 3 Words */
        insertWord(db, "Level 3", "how", "πώς", R.raw.how);
        insertWord(db, "Level 3", "how are you?", "Πώς είσαι / Τι κάνεις", R.raw.how_are_you);
        insertWord(db, "Level 3", "very", "πολύ", R.raw.very);
        insertWord(db, "Level 3", "very well", "πολύ καλά", R.raw.very_well);
        insertWord(db, "Level 3", "I'm very well", "Είμαι πολύ καλά", R.raw.i_m_very_well);
        insertWord(db, "Level 3", "Ι", "εγώ", R.raw.i);
        insertWord(db, "Level 3", "you", "εσύ / εσείς", R.raw.you);
        insertWord(db, "Level 3", "one", "ένας / μία / ένα", R.raw.one);
        insertWord(db, "Level 3", "call", "καλώ", R.raw.call);
        insertWord(db, "Level 3", "you are called", "καλείσαι / λέγεσαι", R.raw.you_re_called);
        insertWord(db, "Level 3", "what's your name", "ποιό είναι το όνομά σου; / πώς σε λένε;", R.raw.what_s_your_name);
        insertWord(db, "Level 3", "my name is ...", "Το όνομά μου είναι ... / Λέγομαι ...", R.raw.my_name_is);
        insertWord(db, "Level 3", "the genius", "ο ιδιοφυής", R.raw.the_genius);
        insertWord(db, "Level 3", "you're a genius", "Είσαι μια ιδιοφϋια!", R.raw.you_re_a_genius);

        /* Level 4 Words */
        insertWord(db, "Level 4", "I am", "εγώ είμαι", R.raw.i_am);
        insertWord(db, "Level 4", "I'm", "εγώ είμαι (συντομογραφία)", R.raw.i_m);
        insertWord(db, "Level 4", "you are", "εσύ / εσείς είσαι / είστε", R.raw.you_are);
        insertWord(db, "Level 4", "you're", "εσύ / εσείς είσαι / είστε (συντομογραφία)", R.raw.you_re);
        insertWord(db, "Level 4", "happy", "χαρούμενος/η", R.raw.happy);
        insertWord(db, "Level 4", "sad", "λυπημένος/η", R.raw.sad);
        insertWord(db, "Level 4", "angry", "θυμωμένος", R.raw.angry);
        insertWord(db, "Level 4", "to be wrong", "να έχει κάποιος άδικο", R.raw.to_be_wrong);
        insertWord(db, "Level 4", "the reason", "ο λόγος", R.raw.the_reason);
        insertWord(db, "Level 4", "tired", "κουρασμένος/η", R.raw.tired);
        insertWord(db, "Level 4", "sick", "άρρωστος/η", R.raw.sick);
        insertWord(db, "Level 4", "I have", "έχω", R.raw.i_have);
        insertWord(db, "Level 4", "you have", "έχεις", R.raw.you_have);
        insertWord(db, "Level 4", "the hunger", "η πείνα", R.raw.hunger);
        insertWord(db, "Level 4", "the thirst", "η δίψα", R.raw.thirst);
        insertWord(db, "Level 4", "are you hungry?", "πεινάς;", R.raw.are_you_hungry);
        insertWord(db, "Level 4", "am i wrong?", "έχω άδικο;", R.raw.am_i_wrong);
        insertWord(db, "Level 4", "you're right", "έχεις δίκιο", R.raw.you_re_right);

        /* Level 5 Words */
        insertWord(db, "Level 5", "the apple", "το μήλο", R.raw.the_apple);
        insertWord(db, "Level 5", "the banana", "η μπανάνα", R.raw.the_banana);
        insertWord(db, "Level 5", "the beef", "το βοδινό", R.raw.the_beef);
        insertWord(db, "Level 5", "the beer", "η μπύρα", R.raw.the_beer);
        insertWord(db, "Level 5", "the bread", "το ψωμί", R.raw.the_bread);
        insertWord(db, "Level 5", "the butter", "το βούτυρο", R.raw.the_butter);
        insertWord(db, "Level 5", "the cheese", "το τυρί", R.raw.the_cheese);
        insertWord(db, "Level 5", "the chicken", "το κοτόπουλο", R.raw.the_chicken);
        insertWord(db, "Level 5", "the coffee", "ο καφές", R.raw.the_coffee);
        insertWord(db, "Level 5", "the egg", "το αυγό", R.raw.the_egg);
        insertWord(db, "Level 5", "the fish", "το ψάρι", R.raw.the_fish);
        insertWord(db, "Level 5", "the food", "το φαγητό", R.raw.the_food);
        insertWord(db, "Level 5", "the fruit", "το φρούτο", R.raw.the_fruit);
        insertWord(db, "Level 5", "the juice", "ο χυμός", R.raw.the_juice);
        insertWord(db, "Level 5", "the lemon", "το λεμόνι", R.raw.the_lemon);
        insertWord(db, "Level 5", "the meat", "το κρέας", R.raw.the_meat);
        insertWord(db, "Level 5", "the milk", "το γάλα", R.raw.the_milk);
        insertWord(db, "Level 5", "the orange", "το πορτοκάλι", R.raw.the_orange);
        insertWord(db, "Level 5", "the pasta", "τα μακαρόνια", R.raw.the_pasta);
        insertWord(db, "Level 5", "the pork", "το χοιρινό", R.raw.the_pork);
        insertWord(db, "Level 5", "the potato", "η πατάτα", R.raw.the_potato);
        insertWord(db, "Level 5", "the rice", "το ρύζι", R.raw.the_rice);
        insertWord(db, "Level 5", "the salad", "η σαλάτα", R.raw.the_salad);
        insertWord(db, "Level 5", "the sauce", "η σάλτσα", R.raw.the_sauce);
        insertWord(db, "Level 5", "the soup", "η σούπα", R.raw.the_soup);
        insertWord(db, "Level 5", "the tea", "το τσάι", R.raw.the_tea);
        insertWord(db, "Level 5", "the vegetables", "τα λαχανικά", R.raw.the_vegetables);
        insertWord(db, "Level 5", "the water", "το νερό", R.raw.the_water);
        insertWord(db, "Level 5", "the wine", "το κρασί", R.raw.the_wine);

        /* Level 6 Words */
        insertWord(db, "Level 6", "and", "και", R.raw.and);
        insertWord(db, "Level 6", "awesome", "φοβερός/η", R.raw.awesome);
        insertWord(db, "Level 6", "delicious", "νόστιμος/η", R.raw.delicious);
        insertWord(db, "Level 6", "disgusting", "αηδιαστικός/η", R.raw.disgusting);
        insertWord(db, "Level 6", "he is", "αυτός είναι", R.raw.he_is);
        insertWord(db, "Level 6", "he's", "αυτός έιναι (συντομογραφία)", R.raw.he_s);
        insertWord(db, "Level 6", "I don't like", "Δε μου αρέσει", R.raw.i_don_t_like);
        insertWord(db, "Level 6", "I like", "Μου αρέσει", R.raw.i_like);
        insertWord(db, "Level 6", "it is", "αυτό είναι", R.raw.it_is);
        insertWord(db, "Level 6", "it's", "αυτό είναι (συντομογραφία)", R.raw.it_s);
        insertWord(db, "Level 6", "not", "δεν", R.raw.not);
        insertWord(db, "Level 6", "she is", "αυτή είναι", R.raw.she_is);
        insertWord(db, "Level 6", "she's", "αυτή είναι (συντομογραφία)", R.raw.she_s);
        insertWord(db, "Level 6", "they are", "αυτοί / αυτές / αυτά είναι", R.raw.they_are);
        insertWord(db, "Level 6", "they're", "αυτοί / αυτές / αυτά είναι (συντομογραφία)", R.raw.they_re);
        insertWord(db, "Level 6", "we are", "εμείς είμαστε", R.raw.we_are);
        insertWord(db, "Level 6", "we're", "εμείς είμαστε (συντομογραφία)", R.raw.we_re);

        /* Level 7 Words */
        insertWord(db, "Level 7", "where", "που", R.raw.where);
        insertWord(db, "Level 7", "Where are you from?", "Απο που είσαι;", R.raw.where_are_you_from);
        insertWord(db, "Level 7", "from", "από", R.raw.from);
        insertWord(db, "Level 7", "I'm from ...", "Είμαι από ...", R.raw.i_m_from);
        insertWord(db, "Level 7", "Africa", "Αφρική", R.raw.africa);
        insertWord(db, "Level 7", "African", "Αφρικανός", R.raw.african);
        insertWord(db, "Level 7", "Albania", "Αλβανία", R.raw.albania);
        insertWord(db, "Level 7", "Albanian", "Αλβανός", R.raw.albanian);
        insertWord(db, "Level 7", "America", "Αμερική", R.raw.america);
        insertWord(db, "Level 7", "American", "Αμερικάνος", R.raw.american);
        insertWord(db, "Level 7", "Asia", "Ασία", R.raw.asia);
        insertWord(db, "Level 7", "Asian", "Ασιάτης", R.raw.asian);
        insertWord(db, "Level 7", "Australia", "Αυστραλία", R.raw.australia);
        insertWord(db, "Level 7", "Australian", "Αυστραλός", R.raw.australian);
        insertWord(db, "Level 7", "Austria", "Αυστρία", R.raw.austria);
        insertWord(db, "Level 7", "Austrian", "Αυστριακός", R.raw.austrian);
        insertWord(db, "Level 7", "Belarus", "Λευκορωσία", R.raw.belarus);
        insertWord(db, "Level 7", "Belarusian", "Λευκορώσος", R.raw.belarusian);
        insertWord(db, "Level 7", "Belgium", "Βέλγιο", R.raw.belgium);
        insertWord(db, "Level 7", "Belgian", "Βέλγος", R.raw.belgian);
        insertWord(db, "Level 7", "Bosnia", "Βοσνία", R.raw.bosnia);
        insertWord(db, "Level 7", "Bosnian", "Βόσνιος", R.raw.bosnian);
        insertWord(db, "Level 7", "Brazil", "Βραζιλία", R.raw.brazil);
        insertWord(db, "Level 7", "Brazilian", "Βραζιλιάνος", R.raw.brazilian);
        insertWord(db, "Level 7", "Britain", "Βρετανία", R.raw.britain);
        insertWord(db, "Level 7", "British", "Βρετανός", R.raw.british);
        insertWord(db, "Level 7", "Bulgaria", "Βουλγαρία", R.raw.bulgaria);
        insertWord(db, "Level 7", "Bulgarian", "Βούλγαρος", R.raw.bulgarian);
        insertWord(db, "Level 7", "China", "Κίνα", R.raw.china);
        insertWord(db, "Level 7", "Chinese", "Κινέζος", R.raw.china);
        insertWord(db, "Level 7", "Croatia", "Κροατία", R.raw.croatia);
        insertWord(db, "Level 7", "Croatian", "Κροάτης", R.raw.croatian);
        insertWord(db, "Level 7", "Cyprus", "Κύπρος", R.raw.cyprus);
        insertWord(db, "Level 7", "Cypriot", "Κύπριος", R.raw.cypriot);
        insertWord(db, "Level 7", "Czech Republic", "Τσέχικη Δημοκρατία (Τσεχία)", R.raw.czech_republic);
        insertWord(db, "Level 7", "Czech", "Τσέχος", R.raw.czech);
        insertWord(db, "Level 7", "Denmark", "Δανία", R.raw.denmark);
        insertWord(db, "Level 7", "Danish", "Δανός", R.raw.danish);
        insertWord(db, "Level 7", "England", "Αγγλία", R.raw.england);
        insertWord(db, "Level 7", "English", "Άγγλος (Αγγλικά)", R.raw.english);
        insertWord(db, "Level 7", "Estonia", "Εσθονία", R.raw.estonia);
        insertWord(db, "Level 7", "Estonian", "Εσθονός", R.raw.estonian);
        insertWord(db, "Level 7", "Europe", "Ευρώπη", R.raw.europe);
        insertWord(db, "Level 7", "European", "Ευρωπαίος", R.raw.european);
        insertWord(db, "Level 7", "Finland", "Φινλανδία", R.raw.finland);
        insertWord(db, "Level 7", "Finnish", "Φινλανδός", R.raw.finnish);
        insertWord(db, "Level 7", "France", "Γαλλία", R.raw.france);
        insertWord(db, "Level 7", "French", "Γάλλος", R.raw.french);
        insertWord(db, "Level 7", "Georgia", "Γεωργία", R.raw.georgia);
        insertWord(db, "Level 7", "Georgian", "Γεωργός", R.raw.georgian);
        insertWord(db, "Level 7", "Germany", "Γερμανία", R.raw.germany);
        insertWord(db, "Level 7", "German", "Γερμανός", R.raw.germany);
        insertWord(db, "Level 7", "Greece", "Ελλάδα", R.raw.greece);
        insertWord(db, "Level 7", "Greek", "Έλληνας", R.raw.greek);
        insertWord(db, "Level 7", "Hungary", "Ουγγαρία", R.raw.hungary);
        insertWord(db, "Level 7", "Hungarian", "Ουγγαρός", R.raw.hungarian);
        insertWord(db, "Level 7", "India", "Ινδία", R.raw.india);
        insertWord(db, "Level 7", "Indian", "Ινδός", R.raw.indian);
        insertWord(db, "Level 7", "Ireland", "Ιρλανδία", R.raw.ireland);
        insertWord(db, "Level 7", "Irish", "Ιρλανδός", R.raw.irish);
        insertWord(db, "Level 7", "Italy", "Ιταλία", R.raw.italy);
        insertWord(db, "Level 7", "Italian", "Ιταλός", R.raw.italian);
        insertWord(db, "Level 7", "Japan", "Ιαπωνία", R.raw.japan);
        insertWord(db, "Level 7", "Japanese", "Ιάπωνας", R.raw.japanese);
        insertWord(db, "Level 7", "Latvia", "Λετονία", R.raw.latvia);
        insertWord(db, "Level 7", "Latvian", "Λετονός", R.raw.latvian);
        insertWord(db, "Level 7", "Lithuania", "Λιθουανία", R.raw.lithuania);
        insertWord(db, "Level 7", "Lithuanian", "Λιθουανός", R.raw.lithuanian);
        insertWord(db, "Level 7", "Malta", "Μάλτα", R.raw.malta);
        insertWord(db, "Level 7", "Maltese", "Μαλτέζος", R.raw.maltese);
        insertWord(db, "Level 7", "Mexico", "Μεξικό", R.raw.mexico);
        insertWord(db, "Level 7", "Mexican", "Μεξικάνος", R.raw.mexican);
        insertWord(db, "Level 7", "Moldova", "Μολδαβία", R.raw.moldova);
        insertWord(db, "Level 7", "Moldovan", "Μολδαβός", R.raw.moldovan);
        insertWord(db, "Level 7", "Netherlands", "Ολλανδία", R.raw.netherlands);
        insertWord(db, "Level 7", "Dutch", "Ολλανδός", R.raw.dutch);
        insertWord(db, "Level 7", "Norway", "Νορβηγία", R.raw.norway);
        insertWord(db, "Level 7", "Norwegian", "Νορβηγός", R.raw.norwegian);
        insertWord(db, "Level 7", "Poland", "Πολωνία", R.raw.poland);
        insertWord(db, "Level 7", "Polish", "Πολωνός", R.raw.polish);
        insertWord(db, "Level 7", "Portugal", "Πορτογαλία", R.raw.portugal);
        insertWord(db, "Level 7", "Portuguese", "Πορτογάλος", R.raw.portuguese);
        insertWord(db, "Level 7", "Romania", "Ρουμανία", R.raw.romania);
        insertWord(db, "Level 7", "Romanian", "Ρουμάνος", R.raw.romanian);
        insertWord(db, "Level 7", "Russia", "Ρωσία", R.raw.russia);
        insertWord(db, "Level 7", "Russian", "Ρώσος", R.raw.russian);
        insertWord(db, "Level 7", "Serbia", "Σερβία", R.raw.serbia);
        insertWord(db, "Level 7", "Serbian", "Σέρβος", R.raw.serbian);
        insertWord(db, "Level 7", "Slovakia", "Σλοβακία", R.raw.slovakia);
        insertWord(db, "Level 7", "Slovakian", "Σλοβάκος", R.raw.slovakian);
        insertWord(db, "Level 7", "Spain", "Ισπανία", R.raw.spain);
        insertWord(db, "Level 7", "Spanish", "Ισπανός", R.raw.spanish);
        insertWord(db, "Level 7", "Sweden", "Σουηδία", R.raw.sweden);
        insertWord(db, "Level 7", "Swedish", "Σουηδός", R.raw.swedish);
        insertWord(db, "Level 7", "Switzerland", "Ελβετία", R.raw.switzerland);
        insertWord(db, "Level 7", "Swiss", "Ελβετός", R.raw.swiss);
        insertWord(db, "Level 7", "Turkey", "Τουρκία", R.raw.turkey);
        insertWord(db, "Level 7", "Turkish", "Τούρκος", R.raw.turkish);
        insertWord(db, "Level 7", "Ukraine", "Ουκρανία", R.raw.ukraine);
        insertWord(db, "Level 7", "Ukrainian", "Ουκρανός", R.raw.ukrainian);

        /* Level 8 Words */
        insertWord(db, "Level 8", "What's your telephone number?", "Ποιός είναι ο αριθμός τηλεφώνου σου;", R.raw.what_s_your_telephone_number);
        insertWord(db, "Level 8", "My telephone number is ...", "Ο αριθμός τηλεφώνου μου είναι ...", R.raw.my_telephone_number_is);
        insertWord(db, "Level 8", "the telephone", "το τηλέφωνο", R.raw.the_telephone);
        insertWord(db, "Level 8", "the number", "ο αριθμός", R.raw.the_number);
        insertWord(db, "Level 8", "the telephone number", "ο αριθμός τηλεφώνου", R.raw.the_telephone_number);
        insertWord(db, "Level 8","0 zero", "μηδέν", R.raw.zero);
        insertWord(db, "Level 8","1 one", "ένα", R.raw.one);
        insertWord(db, "Level 8","2 two", "δύο", R.raw.two);
        insertWord(db, "Level 8","3 three", "τρία", R.raw.three);
        insertWord(db, "Level 8","4 four", "τέσσερα", R.raw.four);
        insertWord(db, "Level 8","5 five", "πέντε", R.raw.five);
        insertWord(db, "Level 8","6 six", "έξι", R.raw.six);
        insertWord(db, "Level 8","7 seven", "επτά", R.raw.seven);
        insertWord(db, "Level 8","8 eight", "οκτώ", R.raw.eight);
        insertWord(db, "Level 8","9 nine", "εννέα", R.raw.nine);
        insertWord(db, "Level 8","10 ten", "δέκα", R.raw.ten);
        insertWord(db, "Level 8","11 eleven", "έντεκα", R.raw.eleven);
        insertWord(db, "Level 8","12 twelve", "δώδεκα", R.raw.twelve);
        insertWord(db, "Level 8","13 thirteen", "δέκα-τρια", R.raw.thirteen);
        insertWord(db, "Level 8","14 fourteen", "δεκα-τέσσερα", R.raw.fourteen);
        insertWord(db, "Level 8","15 fifteen", "δεκα-πέντε", R.raw.fifteen);
        insertWord(db, "Level 8","16 sixteen", "δεκα-έξι", R.raw.sixteen);
        insertWord(db, "Level 8","17 seventeen", "δεκα-έπτα", R.raw.seventeen);
        insertWord(db, "Level 8","18 eighteen", "δεκα-οκτω", R.raw.eighteen);
        insertWord(db, "Level 8","19 nineteen", "δεκα-εννέα", R.raw.nineteen);
        insertWord(db, "Level 8","20 twenty", "είκοσι", R.raw.twenty);
        insertWord(db, "Level 8","21 twenty-one", "είκοσι-ένα", R.raw.twenty_one);
        insertWord(db, "Level 8","22 twenty-two", "είκοσι-δύο", R.raw.twenty_two);
        insertWord(db, "Level 8","23 twenty-three", "είκοσι-τρία", R.raw.twenty_three);
        insertWord(db, "Level 8","24 twenty-four", "είκοσι-τέσσερα", R.raw.twenty_four);
        insertWord(db, "Level 8","25 twenty-five", "είκοσι-πεντε", R.raw.twenty_five);
        insertWord(db, "Level 8","26 twenty-six", "είκοσι-έξι", R.raw.twenty_six);
        insertWord(db, "Level 8","27 twenty-seven", "είκοσι-επτά", R.raw.twenty_seven);
        insertWord(db, "Level 8","28 twenty-eight", "είκοσι-οκτώ", R.raw.twenty_eight);
        insertWord(db, "Level 8","29 twenty-nine", "είκοσι-εννέα", R.raw.twenty_nine);
        insertWord(db, "Level 8","30 thirty", "τριάντα", R.raw.thirty);
        insertWord(db, "Level 8","31 thirty-one", "τριάντα-ένα", R.raw.thirty_one);
        insertWord(db, "Level 8","32 thirty-two", "τριάντα-δύο", R.raw.thirty_two);
        insertWord(db, "Level 8","33 thirty-three", "τριάντα-τρία", R.raw.thirty_three);
        insertWord(db, "Level 8","34 thirty-four", "τριάντα-τέσσερα", R.raw.thirty_four);
        insertWord(db, "Level 8","35 thirty-five", "τριαντα-πέντε", R.raw.thirty_five);
        insertWord(db, "Level 8","36 thirty-six", "τριάντα-έξι", R.raw.thirty_six);
        insertWord(db, "Level 8","37 thirty-seven", "τριάντα-επτά", R.raw.thirty_seven);
        insertWord(db, "Level 8","38 thirty-eight", "τριάντα-οκτώ", R.raw.thirty_eight);
        insertWord(db, "Level 8","39 thirty-nine", "τριάντα-εννέα", R.raw.thirty_nine);
        insertWord(db, "Level 8","40 forty", "σαράντα", R.raw.forty);
        insertWord(db, "Level 8","41 forty-one", "σαραντα-ένα", R.raw.forty_one);
        insertWord(db, "Level 8","42 forty-two", "σαράντα-δύο", R.raw.forty_two);
        insertWord(db, "Level 8","43 forty-three", "σαράντα-τρία", R.raw.forty_three);
        insertWord(db, "Level 8","44 forty-four", "σαράντα-τέσσερα", R.raw.forty_four);
        insertWord(db, "Level 8","45 forty-five", "σαράντα-πέντε", R.raw.forty_five);
        insertWord(db, "Level 8","46 forty-six", "σαράντα-έξι", R.raw.forty_six);
        insertWord(db, "Level 8","47 forty-seven", "σαράντα-επτά", R.raw.forty_seven);
        insertWord(db, "Level 8","48 forty-eight", "σαράντα-οκτώ", R.raw.forty_eight);
        insertWord(db, "Level 8","49 forty-nine", "σαράντα-εννεά", R.raw.forty_nine);
        insertWord(db, "Level 8","50 fifty", "πενήντα", R.raw.fifty);
        insertWord(db, "Level 8","51 fifty-one", "πενήντα-ένα", R.raw.fifty_one);
        insertWord(db, "Level 8","52 fifty-two", "πενήντα-δύο", R.raw.fifty_two);
        insertWord(db, "Level 8","53 fifty-three", "πενήντα-τρία", R.raw.fifty_three);
        insertWord(db, "Level 8", "54 fifty-four", "πενήντα-τέσσερα", R.raw.fifty_four);
        insertWord(db, "Level 8", "55 fifty-five", "πενήντα-πέντε", R.raw.fifty_five);
        insertWord(db, "Level 8", "56 fifty-six", "πενήντα-έξι", R.raw.fifty_six);
        insertWord(db, "Level 8", "57 fifty-seven", "πενήντα-επτά", R.raw.fifty_seven);
        insertWord(db, "Level 8", "58 fifty-eight", "πενήντα-οκτώ", R.raw.fifty_eight);
        insertWord(db, "Level 8", "59 fifty-nine", "πενήντα-εννέα", R.raw.fifty_nine);
        insertWord(db, "Level 8", "60 sixty", "εξήντα", R.raw.sixty);
        insertWord(db, "Level 8", "61 sixty-one", "εξήντα-ένα", R.raw.sixty_one);
        insertWord(db, "Level 8", "62 sixty-two", "εξήντα-δύο", R.raw.sixty_two);
        insertWord(db, "Level 8", "63 sixty-three", "εξηντα-τρία", R.raw.sixty_three);
        insertWord(db, "Level 8", "64 sixty-four", "εξήντα-τέσσερα", R.raw.sixty_four);
        insertWord(db, "Level 8", "65 sixty-five", "εξήντα-πέντε", R.raw.sixty_five);
        insertWord(db, "Level 8", "66 sixty-six", "εξήντα-έξι", R.raw.sixty_six);
        insertWord(db, "Level 8", "67 sixty-seven", "εξήντα-επτά", R.raw.sixty_seven);
        insertWord(db, "Level 8", "68 sixty-eight", "εξήντα-οκτώ", R.raw.sixty_eight);
        insertWord(db, "Level 8", "69 sixty-nine", "εξήντα-εννεά", R.raw.sixty_nine);
        insertWord(db, "Level 8", "70 seventy", "εβδομήντα", R.raw.seventy);
        insertWord(db, "Level 8", "71 seventy-one", "εβδομήντα-ένα", R.raw.seventy_one);
        insertWord(db, "Level 8", "72 seventy-two", "εβδομήντα-δύο", R.raw.seventy_two);
        insertWord(db, "Level 8", "73 seventy-three", "εβδομήντα-τρία", R.raw.seventy_three);
        insertWord(db, "Level 8", "74 seventy-four", "εβδομήντα-τέσσερα", R.raw.seventy_four);
        insertWord(db, "Level 8", "75 seventy-five", "εβδομήντα-πέντε", R.raw.seventy_five);
        insertWord(db, "Level 8", "76 seventy-six", "εβδομήντα-έξι", R.raw.seventy_six);
        insertWord(db, "Level 8", "77 seventy-seven", "εβδομήντα-επτά", R.raw.seventy_seven);
        insertWord(db, "Level 8", "78 seventy-eight", "εβδομήντα-οκτώ", R.raw.seventy_eight);
        insertWord(db, "Level 8", "79 seventy-nine", "εβδομήντα-εννέα", R.raw.seventy_nine);
        insertWord(db, "Level 8", "80 eighty", "ογδόντα", R.raw.eighty);
        insertWord(db, "Level 8", "81 eighty-one", "ογδόντα-ένα", R.raw.eighty_one);
        insertWord(db, "Level 8", "82 eighty-two", "ογδόντα-δύο", R.raw.eighty_two);
        insertWord(db, "Level 8", "83 eighty-three", "ογδόντα-τρία", R.raw.eighty_three);
        insertWord(db, "Level 8", "84 eighty-four", "ογδοντά-τέσσερα", R.raw.eighty_four);
        insertWord(db, "Level 8", "85 eighty-five", "ογδόντα-πέντε", R.raw.eighty_five);
        insertWord(db, "Level 8", "86 eighty-six", "ογδόντα-έξι", R.raw.eighty_six);
        insertWord(db, "Level 8", "87 eighty-seven", "ογδόντα-έπτα", R.raw.eighty_seven);
        insertWord(db, "Level 8", "88 eighty-eight", "ογδόντα-οκτώ", R.raw.eighty_eight);
        insertWord(db, "Level 8", "89 eighty-nine", "ογδόντα-εννέα", R.raw.eighty_nine);
        insertWord(db, "Level 8", "90 ninety", "ενενήντα", R.raw.ninety);
        insertWord(db, "Level 8", "91 ninety-one", "ενενήντα-ένα", R.raw.ninety_one);
        insertWord(db, "Level 8", "92 ninety-two", "ενενήντα-δύο", R.raw.ninety_two);
        insertWord(db, "Level 8", "93 ninety-three", "ενενήντα-τρία", R.raw.ninety_three);
        insertWord(db, "Level 8", "94 ninety-four", "ενενήντα-τέσσερα", R.raw.ninety_four);
        insertWord(db, "Level 8", "95 ninety-five", "ενενήντα-πέντε", R.raw.ninety_five);
        insertWord(db, "Level 8", "96 ninety-six", "ενενήντα-έξι", R.raw.ninety_six);
        insertWord(db, "Level 8", "97 ninety-seven", "ενενήντα-έπτα", R.raw.ninety_seven);
        insertWord(db, "Level 8", "98 ninety-eight", "ενενήντα-όκτω", R.raw.ninety_eight);
        insertWord(db, "Level 8", "99 ninety-nine", "ενενήντα-εννέα", R.raw.ninety_nine);
        insertWord(db, "Level 8","100 one hundred", "εκατό", R.raw.one_hundred);
        insertWord(db, "Level 8","1000 one thousand", "χίλια", R.raw.one_thousand);

        /* Level 9 Words */
        insertWord(db, "Level 9", "Are you ready to order?", "Είστε έτοιμοι να παραγγείλετε;", R.raw.are_you_ready_to_order);
        insertWord(db, "Level 9", "can", "μπορώ", R.raw.can);
        insertWord(db, "Level 9", "can we have the menu please?", "Μπορούμε να έχουμε το μενού παρακαλώ;", R.raw.can_we_have_the_menu_please);
        insertWord(db, "Level 9", "drink", "πίνω", R.raw.drink);
        insertWord(db, "Level 9", "eat", "τρώω", R.raw.eat);
        insertWord(db, "Level 9", "for", "για", R.raw.for_);
        insertWord(db, "Level 9", "I would like", "Θα ήθελα", R.raw.i_would_like);
        insertWord(db, "Level 9", "order", "παραγγέλνω", R.raw.order);
        insertWord(db, "Level 9", "ready", "έτοιμος", R.raw.ready);
        insertWord(db, "Level 9", "the table", "το τραπέζι", R.raw.the_table);
        insertWord(db, "Level 9", "take-away", "πακέτο προς αποστολή", R.raw.take_away);
        insertWord(db, "Level 9", "the bill", "ο λογαριασμός", R.raw.the_bill);
        insertWord(db, "Level 9", "the chopsticks", "τα κινέζικα ξυλάκια", R.raw.the_chopsticks);
        insertWord(db, "Level 9", "the fork", "το πιρούνι", R.raw.the_fork);
        insertWord(db, "Level 9", "the knife", "το μαχαιρί", R.raw.the_knife);
        insertWord(db, "Level 9", "the menu", "το μενού", R.raw.the_menu);
        insertWord(db, "Level 9", "the_restaurant", "το εστιατόριο", R.raw.the_restaurant);
        insertWord(db, "Level 9", "the spoon", "το κουτάλι", R.raw.the_spoon);
        insertWord(db, "Level 9", "to", "να", R.raw.to);

        /* Level 10 Words */
        insertWord(db, "Level 10", "also", "επίσης", R.raw.also);
        insertWord(db, "Level 10", "beautiful", "πανέμορφος", R.raw.beautiful);
        insertWord(db, "Level 10", "big", "μεγάλος (μέγεθος)", R.raw.big);
        insertWord(db, "Level 10", "cool", "δροσερός", R.raw.cool);
        insertWord(db, "Level 10", "cute", "χαριτωμένος", R.raw.cute);
        insertWord(db, "Level 10", "fat", "χοντρός", R.raw.fat);
        insertWord(db, "Level 10", "handsome", "όμορφος", R.raw.handsome);
        insertWord(db, "Level 10", "I don't think so", "Δεν νομίζω", R.raw.i_don_t_think_so);
        insertWord(db, "Level 10", "I think so too", "Νομίζω κι γω", R.raw.i_think_so_too);
        insertWord(db, "Level 10", "large", "μεγάλος (μέγεθος - μεγαλύτερο του big)", R.raw.large);
        insertWord(db, "Level 10", "little", "μικρός (μέγεθος)", R.raw.little);
        insertWord(db, "Level 10", "long_", "μακρύς", R.raw.long_);
        insertWord(db, "Level 10", "me_neither", "ούτε κι γω", R.raw.me_neither);
        insertWord(db, "Level 10", "me_too", "κι γω", R.raw.me_too);
        insertWord(db, "Level 10", "nice", "ωραίος", R.raw.nice);
        insertWord(db, "Level 10", "pretty", "όμορφος", R.raw.pretty);
        insertWord(db, "Level 10", "short", "κοντός", R.raw.short_);
        insertWord(db, "Level 10", "slim", "αδύνατος", R.raw.slim);
        insertWord(db, "Level 10", "small", "μικρός", R.raw.small);
        insertWord(db, "Level 10", "strong", "δυνατός", R.raw.strong);
        insertWord(db, "Level 10", "that", "εκείνο", R.raw.that);
        insertWord(db, "Level 10", "thin", "λεπτός", R.raw.thin);
        insertWord(db, "Level 10", "think", "νομίζω", R.raw.think);
        insertWord(db, "Level 10", "too", "επίσης", R.raw.too);
        insertWord(db, "Level 10", "too many", "υπερβολικά πολλά", R.raw.too_many);
        insertWord(db, "Level 10", "too much", "υπερβολικά πολύ", R.raw.too_much);
        insertWord(db, "Level 10", "ugly", "άσχημος", R.raw.ugly);
        insertWord(db, "Level 10", "weak", "αδύναμος", R.raw.weak);
        insertWord(db, "Level 10", "what", "τι", R.raw.what);
        insertWord(db, "Level 10", "which", "το οποίο", R.raw.which);
        insertWord(db, "Level 10", "who", "ο οποίος", R.raw.who);
        insertWord(db, "Level 10", "wonderful", "υπέροχος", R.raw.wonderful);

        /* Level 11 Words */
        insertWord(db, "Level 11", "any", "όποιος", R.raw.any);
        insertWord(db, "Level 11", "Do you understand?", "Καταλαβαίνεις;", R.raw.do_you_understand);
        insertWord(db, "Level 11", "good luck", "καλή τύχη", R.raw.good_luck);
        insertWord(db, "Level 11", "happy to help you", "χαίρομαι που βοηθώ", R.raw.happy_to_help_you);
        insertWord(db, "Level 11", "help", "βοήθεια / βοηθώ", R.raw.help);
        insertWord(db, "Level 11", "here", "εδώ", R.raw.here);
        insertWord(db, "Level 11", "here you go", "ορίστε", R.raw.here_you_go);
        insertWord(db, "Level 11", "how do you say ...?", "Πως λές ... ;", R.raw.how_do_you_say);
        insertWord(db, "Level 11", "know", "ξέρω / γνωρίζω", R.raw.know);
        insertWord(db, "Level 11", "meet", "συναντώ", R.raw.meet);
        insertWord(db, "Level 11", "pleasure", "ευχαρίστηση", R.raw.pleasure);
        insertWord(db, "Level 11", "Pleasure to meet you", "Χάρηκα για τη γνωριμία", R.raw.pleasure);
        insertWord(db, "Level 11", "say", "λέω", R.raw.say);
        insertWord(db, "Level 11", "some", "κάμποσο / μερικό", R.raw.some);
        insertWord(db, "Level 11", "tell", "λέω", R.raw.tell);
        insertWord(db, "Level 11", "That's great", "Αυτό είναι ωραίο", R.raw.that_s_great);
        insertWord(db, "Level 11", "the luck", "η τύχη", R.raw.the_luck);
        insertWord(db, "Level 11", "understand", "καταλαβαίνω", R.raw.understand);
        insertWord(db, "Level 11", "welcome", "καλώς ορίσατε", R.raw.welcome);

        /* Level 12 Words */
        insertWord(db, "Level 12", "all", "όλα", R.raw.all);
        insertWord(db, "Level 12", "anything", "οτιδήποτε", R.raw.anything);
        insertWord(db, "Level 12", "everyone", "όλοι", R.raw.everyone);
        insertWord(db, "Level 12", "everything", "όλα", R.raw.everything);
        insertWord(db, "Level 12", "of", "από (όχι για καταγωγές)", R.raw.of);
        insertWord(db, "Level 12", "something", "κάτι", R.raw.something);
        insertWord(db, "Level 12", "the bottle", "το μπουκάλι", R.raw.the_bottle);
        insertWord(db, "Level 12", "the cup", "το φλυτζάνι", R.raw.the_cup);
        insertWord(db, "Level 12", "the dessert", "το επιδόρπιο", R.raw.the_dessert);
        insertWord(db, "Level 12", "the dish", "το πιάτο (συνήθως όχι το αντικείμενο)", R.raw.the_dish);
        insertWord(db, "Level 12", "the glass", "το ποτήρι", R.raw.the_glass);
        insertWord(db, "Level 12", "the main course", "το κυρίως πιάτο", R.raw.the_main_course);
        insertWord(db, "Level 12", "the plate", "το πιάτο", R.raw.the_plate);
        insertWord(db, "Level 12", "the starter", "το ορεκτικό", R.raw.the_starter);
        insertWord(db, "Level 12", "Would you like ...?", "Θα θέλατε ... ;", R.raw.would_you_like);

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
