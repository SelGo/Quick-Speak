package selgo.com.quickspeak;


public class EnglishWord {
    private String englishWord;
    private String translatedWord;
    private int audioId;

    public EnglishWord(String englishWord, String translatedWord, int audioId) {
        this.englishWord = englishWord;
        this.translatedWord = translatedWord;
        this.audioId = audioId;
    }

    public EnglishWord(String englishWord, int audioId) {
        this.englishWord = englishWord;
        this.audioId = audioId;
    }

    public EnglishWord(String englishWord, String translatedWord) {
        this.englishWord = englishWord;
        this.translatedWord = translatedWord;
    }

    public static final EnglishWord[] theEnglishAlphabet = {
            new EnglishWord("A", "a", R.raw.a),
            new EnglishWord("B", "b", R.raw.b),
            new EnglishWord("C", "c", R.raw.c),
            new EnglishWord("D", "d", R.raw.d),
            new EnglishWord("E", "e", R.raw.e),
            new EnglishWord("F", "f", R.raw.f),
            new EnglishWord("G", "g", R.raw.g),
            new EnglishWord("H", "h", R.raw.h),
            new EnglishWord("I", "i", R.raw.i),
            new EnglishWord("J", "j", R.raw.j),
            new EnglishWord("K", "k", R.raw.k),
            new EnglishWord("L", "l", R.raw.l),
            new EnglishWord("M", "m", R.raw.m),
            new EnglishWord("N", "n", R.raw.n),
            new EnglishWord("O", "o", R.raw.o),
            new EnglishWord("P", "p", R.raw.p),
            new EnglishWord("Q", "q", R.raw.q),
            new EnglishWord("R", "r", R.raw.r),
            new EnglishWord("S", "s", R.raw.s),
            new EnglishWord("T", "t", R.raw.t),
            new EnglishWord("U", "u", R.raw.u),
            new EnglishWord("V", "v", R.raw.v),
            new EnglishWord("W", "w", R.raw.w),
            new EnglishWord("X", "x", R.raw.x),
            new EnglishWord("Y", "y", R.raw.y),
            new EnglishWord("Z", "z", R.raw.z)
    };

    public static final EnglishWord[] numbers = {
            new EnglishWord("0 zero", "μηδέν", R.raw.zero),
            new EnglishWord("1 one", "ένα", R.raw.one),
            new EnglishWord("2 two", "δύο", R.raw.two),
            new EnglishWord("3 three", "τρία", R.raw.three),
            new EnglishWord("4 four", "τέσσερα", R.raw.four),
            new EnglishWord("5 five", "πέντε", R.raw.five),
            new EnglishWord("6 six", "έξι", R.raw.six),
            new EnglishWord("7 seven", "επτά", R.raw.seven),
            new EnglishWord("8 eight", "οκτώ", R.raw.eight),
            new EnglishWord("9 nine", "εννέα", R.raw.nine),
            new EnglishWord("10 ten", "δέκα", R.raw.ten),
            new EnglishWord("11 eleven", "έντεκα", R.raw.eleven),
            new EnglishWord("12 twelve", "δώδεκα", R.raw.twelve),
            new EnglishWord("13 thirteen", "δέκα-τρια", R.raw.thirteen),
            new EnglishWord("14 fourteen", "δεκα-τέσσερα", R.raw.fourteen),
            new EnglishWord("15 fifteen", "δεκα-πέντε", R.raw.fifteen),
            new EnglishWord("16 sixteen", "δεκα-έξι", R.raw.sixteen),
            new EnglishWord("17 seventeen", "δεκα-έπτα", R.raw.seventeen),
            new EnglishWord("18 eighteen", "δεκα-οκτω", R.raw.eighteen),
            new EnglishWord("19 nineteen", "δεκα-εννέα", R.raw.nineteen),
            new EnglishWord("20 twenty", "είκοσι", R.raw.twenty),
            new EnglishWord("21 twenty-one", "είκοσι-ένα", R.raw.twenty_one),
            new EnglishWord("22 twenty-two", "είκοσι-δύο", R.raw.twenty_two),
            new EnglishWord("23 twenty-three", "είκοσι-τρία", R.raw.twenty_three),
            new EnglishWord("24 twenty-four", "είκοσι-τέσσερα", R.raw.twenty_four),
            new EnglishWord("25 twenty-five", "είκοσι-πεντε", R.raw.twenty_five),
            new EnglishWord("26 twenty-six", "είκοσι-έξι", R.raw.twenty_six),
            new EnglishWord("27 twenty-seven", "είκοσι-επτά", R.raw.twenty_seven),
            new EnglishWord("28 twenty-eight", "είκοσι-οκτώ", R.raw.twenty_eight),
            new EnglishWord("29 twenty-nine", "είκοσι-εννέα", R.raw.twenty_nine),
            new EnglishWord("30 thirty", "τριάντα", R.raw.thirty),
            new EnglishWord("31 thirty-one", "τριάντα-ένα", R.raw.thirty_one),
            new EnglishWord("32 thirty-two", "τριάντα-δύο", R.raw.thirty_two),
            new EnglishWord("33 thirty-three", "τριάντα-τρία", R.raw.thirty_three),
            new EnglishWord("34 thirty-four", "τριάντα-τέσσερα", R.raw.thirty_four),
            new EnglishWord("35 thirty-five", "τριαντα-πέντε", R.raw.thirty_five),
            new EnglishWord("36 thirty-six", "τριάντα-έξι", R.raw.thirty_six),
            new EnglishWord("37 thirty-seven", "τριάντα-επτά", R.raw.thirty_seven),
            new EnglishWord("38 thirty-eight", "τριάντα-οκτώ", R.raw.thirty_eight),
            new EnglishWord("39 thirty-nine", "τριάντα-εννέα", R.raw.thirty_nine),
            new EnglishWord("40 forty", "σαράντα", R.raw.forty),
            new EnglishWord("41 forty-one", "σαραντα-ένα", R.raw.forty_one),
            new EnglishWord("42 forty-two", "σαράντα-δύο", R.raw.forty_two),
            new EnglishWord("43 forty-three", "σαράντα-τρία", R.raw.forty_three),
            new EnglishWord("44 forty-four", "σαράντα-τέσσερα", R.raw.forty_four),
            new EnglishWord("45 forty-five", "σαράντα-πέντε", R.raw.forty_five),
            new EnglishWord("46 forty-six", "σαράντα-έξι", R.raw.forty_six),
            new EnglishWord("47 forty-seven", "σαράντα-επτά", R.raw.forty_seven),
            new EnglishWord("48 forty-eight", "σαράντα-οκτώ", R.raw.forty_eight),
            new EnglishWord("49 forty-nine", "σαράντα-εννεά", R.raw.forty_nine),
            new EnglishWord("50 fifty", "πενήντα", R.raw.fifty),
            new EnglishWord("51 fifty-one", "πενήντα-ένα", R.raw.fifty_one),
            new EnglishWord("52 fifty-two", "πενήντα-δύο", R.raw.fifty_two),
            new EnglishWord("53 fifty-three", "πενήντα-τρία", R.raw.fifty_three),
            new EnglishWord("54 fifty-four", "πενήντα-τέσσερα", R.raw.fifty_four),
            new EnglishWord("55 fifty-five", "πενήντα-πέντε", R.raw.fifty_five),
            new EnglishWord("56 fifty-six", "πενήντα-έξι", R.raw.fifty_six),
            new EnglishWord("57 fifty-seven", "πενήντα-επτά", R.raw.fifty_seven),
            new EnglishWord("58 fifty-eight", "πενήντα-οκτώ", R.raw.fifty_eight),
            new EnglishWord("59 fifty-nine", "πενήντα-εννέα", R.raw.fifty_nine),
            new EnglishWord("60 sixty", "εξήντα", R.raw.sixty)
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
