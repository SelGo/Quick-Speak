package selgo.com.quickspeak;


public class EnglishWord {
    private String englishWord;
    private String translatedWord;
    private int audioId;

    public EnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public EnglishWord(String englishWord, String translatedWord) {
        this.englishWord = englishWord;
        this.translatedWord = translatedWord;
    }

    public EnglishWord(String englishWord, String translatedWord, int audioId) {
        this.englishWord = englishWord;
        this.translatedWord = translatedWord;
        this.audioId = audioId;
    }

    public EnglishWord(String englishWord, int audioId) {
        this.englishWord = englishWord;
        this.audioId = audioId;
    }

    public static final EnglishWord[] theEnglishAlphabet = {
            new EnglishWord("A a", R.raw.a),
            new EnglishWord("B b", R.raw.b),
            new EnglishWord("C c", R.raw.c),
            new EnglishWord("D d", R.raw.d),
            new EnglishWord("E e", R.raw.e),
            new EnglishWord("F f", R.raw.f),
            new EnglishWord("G g", R.raw.g),
            new EnglishWord("H h", R.raw.h),
            new EnglishWord("I i", R.raw.i),
            new EnglishWord("J j", R.raw.j),
            new EnglishWord("K k", R.raw.k),
            new EnglishWord("L l", R.raw.l),
            new EnglishWord("M m", R.raw.m),
            new EnglishWord("N n", R.raw.n),
            new EnglishWord("O o", R.raw.o),
            new EnglishWord("P p", R.raw.p),
            new EnglishWord("Q q", R.raw.q),
            new EnglishWord("R r", R.raw.r),
            new EnglishWord("S s", R.raw.s),
            new EnglishWord("T t", R.raw.t),
            new EnglishWord("U u", R.raw.u),
            new EnglishWord("V v", R.raw.v),
            new EnglishWord("W w", R.raw.w),
            new EnglishWord("X x", R.raw.x),
            new EnglishWord("Y y", R.raw.y),
            new EnglishWord("Z z", R.raw.z)
    };

    public static final EnglishWord[] numbers = {
            new EnglishWord("0 zero", "μηδέν", R.raw.zero),
            new EnglishWord("1 one", "ένα", R.raw.one),
            new EnglishWord("2 two", "δύο", R.raw.two),
            new EnglishWord("3 three", "τρία", R.raw.three),
            new EnglishWord("4 four", "τέσσερα", R.raw.four),
            new EnglishWord("5 five", "πέντε", R.raw.five),
            new EnglishWord("6 six", "έξι", R.raw.six),
            new EnglishWord("7 seven", "εφτά", R.raw.seven),
            new EnglishWord("8 eight", "οχτώ", R.raw.eight),
            new EnglishWord("9 nine", "εννέα", R.raw.nine),
            new EnglishWord("10 ten", "δέκα", R.raw.ten)
    };

    public static final EnglishWord[] lesson1 = {
            new EnglishWord("I am / I'm", "εγώ είμαι", R.raw.i_am_im),
            new EnglishWord("you are / you're", "εσύ είσαι", R.raw.you_are_youre),
            new EnglishWord("he is / he's", "αυτός είναι", R.raw.he_is_hes),
            new EnglishWord("she is / she's", "αυτή είναι", R.raw.she_is_shes),
            new EnglishWord("it is / it's", "αυτό είναι", R.raw.it_is_its),
            new EnglishWord("are not / aren't", "δεν είναι (πλυθυντικός)", R.raw.are_not_arent),
            new EnglishWord("is not / isn't", "δεν είναι (ενικός)", R.raw.is_not_isnt),
            new EnglishWord("who", "ποιος/α", R.raw.who),
            new EnglishWord("what", "τι", R.raw.what),
            new EnglishWord("what is / what's", "τι είναι", R.raw.what_is_whats),
            new EnglishWord("who is / who's", "ποιός/α είναι", R.raw.who_is_whos),
            new EnglishWord("a / an", "ένας / μία / ένα", R.raw.a_an),
    };

    public static final EnglishWord[] lesson2 = {
            new EnglishWord("hello / hi", "γειά", R.raw.hello_hi),
            new EnglishWord("goodbye / bye", "αντίο", R.raw.goodbye_bye),
            new EnglishWord("good morning", "καλημέρα", R.raw.good_morning),
            new EnglishWord("good evening", "καλησπέρα", R.raw.good_evening),
            new EnglishWord("good night", "καληνύχτα", R.raw.good_night),
            new EnglishWord("thank you", "ευχαριστώ", R.raw.thank_you),
            new EnglishWord("how are you?", "πώς εισαι; / τι κανείς;", R.raw.how_are_you),
            new EnglishWord("fine", "καλά", R.raw.fine),
            new EnglishWord("yes", "ναι", R.raw.yes),
            new EnglishWord("no", "όχι", R.raw.no)
    };

    public static final EnglishWord[] food = {
            new EnglishWord("the coffee", "ο καφές"),
            new EnglishWord("the milk", "το γάλα"),
            new EnglishWord("the cream", "η κρέμα"),
            new EnglishWord("the chocolate", "η σοκολάτα"),
            new EnglishWord("the cookie", "το μπισκότο"),
            new EnglishWord("the cup", "το φλιτζάνι"),
            new EnglishWord("the ice cream", "το παγωτό"),
            new EnglishWord("the food", "το φαγητό"),
            new EnglishWord("the fruit", "το φρούτο"),
            new EnglishWord("the banana", "η μπανάνα"),
            new EnglishWord("the candy", "η καραμέλα"),
            new EnglishWord("the carrot", "το καρότο"),
            new EnglishWord("the dish", "το πιάτο"),
            new EnglishWord("the bean", "το φασόλι"),
            new EnglishWord("the beef", "το βοδινό"),
            new EnglishWord("the beer", "η μπύρα"),
            new EnglishWord("the bottle", "το μπουκάλι"),
            new EnglishWord("the bowl", "το μπώλ"),
            new EnglishWord("the breakfast", "το πρωινό"),
            new EnglishWord("the butter", "το βούτυρο"),
            new EnglishWord("the cake", "το κέικ"),
            new EnglishWord("the cheese", "το τυρί"),
            new EnglishWord("the chicken", "το κοτόπουλο"),
            new EnglishWord("the cook", "ο μάγειρας"),
            new EnglishWord("the dinner", "το δείπνο"),
            new EnglishWord("the drink", "το ποτό"),
            new EnglishWord("the egg", "το αυγό"),
            new EnglishWord("the fish", "το ψάρι"),
            new EnglishWord("the fork", "το πιρούνι"),
            new EnglishWord("fried", "τηγανιτό"),
            new EnglishWord("the garlic", "το σκόρδο"),
            new EnglishWord("the glass", "το ποτήρι"),
            new EnglishWord("the grapes", "το σταφύλι"),
            new EnglishWord("we eat", "(εμείς) τρώμε"),
            new EnglishWord("you eat", "(εσείς) τρώτε"),
            new EnglishWord("they eat", "(αυτοί) τρώνε"),
            new EnglishWord("it boils", "(αυτό) βράζει"),
            new EnglishWord("I cook", "(εγώ) μαγειρεύω"),
            new EnglishWord("he cooks", "(αυτός) μαγειρεύει"),
            new EnglishWord("I cut", "(εγώ) κόβω"),
            new EnglishWord("he cuts", "(αυτός) κόβει")
    };

    public static final EnglishWord[] plurals = {
            new EnglishWord("the books", "τα βιβλία"),
            new EnglishWord("the animals", "τα ζώα"),
            new EnglishWord("the newspapers", "οι εφημερίδες"),
            new EnglishWord("the horses", "τα άλογα"),
            new EnglishWord("the fishes", "τα ψάρια"),
            new EnglishWord("the dishes", "τα πιάτα"),
            new EnglishWord("the cats", "οι γατες"),
            new EnglishWord("the birds", "τα πουλιά"),
            new EnglishWord("the bottles", "τα μπουκάλια"),
            new EnglishWord("the glasses", "τα ποτήρια"),
            new EnglishWord("the cooks", "οι μάγειρες"),
            new EnglishWord("the insects", "τα έντομα"),
            new EnglishWord("the apples", "τα μήλα"),
            new EnglishWord("the cakes", "τα κέικ"),
            new EnglishWord("the butterflies", "οι πεταλούδες"),
            new EnglishWord("the cows", "οι αγελάδες"),
            new EnglishWord("the bananas", "οι μπανάνες"),
            new EnglishWord("the chickens", "τα κοτόπουλα"),
            new EnglishWord("the cookies", "τα μπισκότα"),
            new EnglishWord("the elephants", "οι ελέφαντες"),
            new EnglishWord("the candies", "οι καραμέλες"),
            new EnglishWord("the forks", "τα πιρούνια"),
            new EnglishWord("the dogs", "οι σκύλοι / τα σκυλιά"),
            new EnglishWord("the sandwiches", "τα σαντουίτς"),
            new EnglishWord("to", "στα")
    };

    public static final EnglishWord[] animals = {
            new EnglishWord("the animal", "το ζώο"),
            new EnglishWord("the cat", "η γάτα"),
            new EnglishWord("the dog", "το σκυλί"),
            new EnglishWord("the bird", "το πουλί"),
            new EnglishWord("the horse", "το άλογο"),
            new EnglishWord("the ape", "ο πίθηκος"),
            new EnglishWord("the mouse", "το ποντίκι"),
            new EnglishWord("the lion", "το λιοντάρι"),
            new EnglishWord("the ant", "το μυρμηγκί"),
            new EnglishWord("the bear", "η αρκούδα"),
            new EnglishWord("the bee", "η μέλισσα"),
            new EnglishWord("the butterfly", "η πεταλούδα"),
            new EnglishWord("the cow", "η αγελάδα"),
            new EnglishWord("the dolphin", "το δελφίνι"),
            new EnglishWord("the duck", "η πάπια"),
            new EnglishWord("the elephant", "ο ελέφαντας"),
            new EnglishWord("the fly", "η μύγα"),
            new EnglishWord("the insect", "το έντομο"),
            new EnglishWord("the shark", "ο καρχαρίας"),
            new EnglishWord("the snake", "το φίδι"),
            new EnglishWord("the spider", "η αράχνη"),
            new EnglishWord("the tiger", "η τίγρης"),
            new EnglishWord("the turtle", "η χελώνα"),
            new EnglishWord("the whale", "η φάλαινα"),
            new EnglishWord("the wolf", "ο λύκος"),
            new EnglishWord("the zoo", "ο ζωολογικός κήπος"),
            new EnglishWord("the bull", "το ταύρος"),
            new EnglishWord("the penguin", "ο πιγκουίνος")
    };

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public int getAudioId() {
        return audioId;
    }
}
