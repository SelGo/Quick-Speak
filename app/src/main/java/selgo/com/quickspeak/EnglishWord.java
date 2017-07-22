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
            new EnglishWord("60 sixty", "εξήντα", R.raw.sixty),
            new EnglishWord("61 sixty-one", "εξήντα-ένα", R.raw.sixty_one),
            new EnglishWord("62 sixty-two", "εξήντα-δύο", R.raw.sixty_two),
            new EnglishWord("63 sixty-three", "εξηντα-τρία", R.raw.sixty_three),
            new EnglishWord("64 sixty-four", "εξήντα-τέσσερα", R.raw.sixty_four),
            new EnglishWord("65 sixty-five", "εξήντα-πέντε", R.raw.sixty_five),
            new EnglishWord("66 sixty-six", "εξήντα-έξι", R.raw.sixty_six),
            new EnglishWord("67 sixty-seven", "εξήντα-επτά", R.raw.sixty_seven),
            new EnglishWord("68 sixty-eight", "εξήντα-οκτώ", R.raw.sixty_eight),
            new EnglishWord("69 sixty-nine", "εξήντα-εννεά", R.raw.sixty_nine),
            new EnglishWord("70 seventy", "εβδομήντα", R.raw.seventy),
            new EnglishWord("71 seventy-one", "εβδομήντα-ένα", R.raw.seventy_one),
            new EnglishWord("72 seventy-two", "εβδομήντα-δύο", R.raw.seventy_two),
            new EnglishWord("73 seventy-three", "εβδομήντα-τρία", R.raw.seventy_three),
            new EnglishWord("74 seventy-four", "εβδομήντα-τέσσερα", R.raw.seventy_four),
            new EnglishWord("75 seventy-five", "εβδομήντα-πέντε", R.raw.seventy_five),
            new EnglishWord("76 seventy-six", "εβδομήντα-έξι", R.raw.seventy_six),
            new EnglishWord("77 seventy-seven", "εβδομήντα-επτά", R.raw.seventy_seven),
            new EnglishWord("78 seventy-eight", "εβδομήντα-οκτώ", R.raw.seventy_eight),
            new EnglishWord("79 seventy-nine", "εβδομήντα-εννέα", R.raw.seventy_nine),
            new EnglishWord("80 eighty", "ογδόντα", R.raw.eighty),
            new EnglishWord("81 eighty-one", "ογδόντα-ένα", R.raw.eighty_one),
            new EnglishWord("82 eighty-two", "ογδόντα-δύο", R.raw.eighty_two),
            new EnglishWord("83 eighty-three", "ογδόντα-τρία", R.raw.eighty_three),
            new EnglishWord("84 eighty-four", "ογδοντά-τέσσερα", R.raw.eighty_four),
            new EnglishWord("85 eighty-five", "ογδόντα-πέντε", R.raw.eighty_five),
            new EnglishWord("86 eighty-six", "ογδόντα-έξι", R.raw.eighty_six),
            new EnglishWord("87 eighty-seven", "ογδόντα-έπτα", R.raw.eighty_seven),
            new EnglishWord("88 eighty-eight", "ογδόντα-οκτώ", R.raw.eighty_eight),
            new EnglishWord("89 eighty-nine", "ογδόντα-εννέα", R.raw.eighty_nine),
            new EnglishWord("90 ninety", "ενενήντα", R.raw.ninety),
            new EnglishWord("91 ninety-one", "ενενήντα-ένα", R.raw.ninety_one),
            new EnglishWord("92 ninety-two", "ενενήντα-δύο", R.raw.ninety_two),
            new EnglishWord("93 ninety-three", "ενενήντα-τρία", R.raw.ninety_three),
            new EnglishWord("94 ninety-four", "ενενήντα-τέσσερα", R.raw.ninety_four),
            new EnglishWord("95 ninety-five", "ενενήντα-πέντε", R.raw.ninety_five),
            new EnglishWord("96 ninety-six", "ενενήντα-έξι", R.raw.ninety_six),
            new EnglishWord("97 ninety-seven", "ενενήντα-έπτα", R.raw.ninety_seven),
            new EnglishWord("98 ninety-eight", "ενενήντα-όκτω", R.raw.ninety_eight),
            new EnglishWord("99 ninety-nine", "ενενήντα-εννέα", R.raw.ninety_nine),
            new EnglishWord("100 one hundred", "εκατό", R.raw.one_hundred)
    };

    public static final EnglishWord[] fruitsAndVegetables = {
            new EnglishWord("orange", "πορτοκάλι", R.raw.orange),
            new EnglishWord("mandarin", "μανταρίνι", R.raw.mandarin),
            new EnglishWord("grapefruit", "φράπα", R.raw.grapefruit),
            new EnglishWord("lemon", "λεμόνι", R.raw.lemon),
            new EnglishWord("lime", "λάιμ", R.raw.lime),
            new EnglishWord("kiwi", "ακτινίδιο", R.raw.kiwi),
            new EnglishWord("pineapple", "ανανάς", R.raw.pineapple),
            new EnglishWord("pomegranate", "ρόδι", R.raw.pomegranate),
            new EnglishWord("avocado", "αβοκάντο", R.raw.avocado),
            new EnglishWord("coconut", "καρύδα", R.raw.coconut),
            new EnglishWord("melon", "πεπόνι", R.raw.melon),
            new EnglishWord("banana", "μπανανα", R.raw.banana),
            new EnglishWord("pear", "αχλάδι", R.raw.pear),
            new EnglishWord("peach", "ροδάκινο", R.raw.peach),
            new EnglishWord("plum", "δαμάσκινο", R.raw.plum),
            new EnglishWord("quince", "κυδώνι", R.raw.quince),
            new EnglishWord("apricot", "ροδάκινο", R.raw.apricot),
            new EnglishWord("watermelon", "καρπούζι", R.raw.watermelon),
            new EnglishWord("cherry", "κεράσι", R.raw.cherry),
            new EnglishWord("blueberry", "μυρτιλός", R.raw.blueberry),
            new EnglishWord("apple", "μήλο", R.raw.apple),
            new EnglishWord("strawberry", "φράουλα", R.raw.strawberry),
            new EnglishWord("grape", "σταφύλι", R.raw.grape),
            new EnglishWord("fig", "σύκο", R.raw.fig),
            new EnglishWord("papaya", "παπάγια", R.raw.papaya),
            new EnglishWord("raspberry", "βατόμουρο", R.raw.raspberry),
            new EnglishWord("mango", "μάνγκο", R.raw.mango),
            new EnglishWord("bean", "φασόλι", R.raw.bean),
            new EnglishWord("cabbage", "λάχανο", R.raw.cabbage),
            new EnglishWord("carrot", "καρότο", R.raw.carrot),
            new EnglishWord("pumpkin", "κολοκύθα", R.raw.pumpkin),
            new EnglishWord("lettuce", "μαρούλι", R.raw.lettuce),
            new EnglishWord("corn", "καλαμπόκι", R.raw.corn),
            new EnglishWord("garlic", "σκόρδο", R.raw.garlic),
            new EnglishWord("onion", "κρεμμύδι", R.raw.onion),
            new EnglishWord("peas", "αρακάς", R.raw.peas),
            new EnglishWord("potato", "πατάτα", R.raw.potato),
            new EnglishWord("tomato", "ντομάτα", R.raw.tomato),
            new EnglishWord("pepper", "πιπεριά", R.raw.pepper),
            new EnglishWord("spinach", "σπανάκι", R.raw.spinach),
            new EnglishWord("broccoli", "μπρόκολο", R.raw.broccoli),
            new EnglishWord("mushroom", "μανιτάρι", R.raw.mushroom),
            new EnglishWord("cauliflower", "κουνουπίδι", R.raw.cauliflower)
    };

    public static final EnglishWord[] greetingsAndIntroductions = {
            new EnglishWord("hello / hi", "γειά", R.raw.hello_hi),
            new EnglishWord("goodbye / bye", "αντίο", R.raw.goodbye_bye),
            new EnglishWord("good morning", "καλημέρα", R.raw.good_morning),
            new EnglishWord("good evening", "καλησπέρα", R.raw.good_evening),
            new EnglishWord("good night", "καληνύχτα", R.raw.good_night),
            new EnglishWord("thank you", "ευχαριστώ", R.raw.thank_you),
            new EnglishWord("how are you?", "πώς εισαι; / τι κανείς;", R.raw.how_are_you),
            new EnglishWord("fine", "καλά", R.raw.fine),
            new EnglishWord("yes", "ναι", R.raw.yes),
            new EnglishWord("no", "όχι", R.raw.no),
            new EnglishWord("How's it going?", "Πώς πάει?", R.raw.hows_it_going),
            new EnglishWord("Merry Christmas", "Καλά Χριστούγεννα", R.raw.merry_christmas),
            new EnglishWord("Happy Easter", "Καλό Πάσχα", R.raw.happy_easter),
            new EnglishWord("Happy New Year", "Καλή Χρονιά", R.raw.happy_new_year),
            new EnglishWord("get well soon", "Περαστικά", R.raw.get_well_soon),
            new EnglishWord("good luck", "Καλή τύχη", R.raw.good_luck),
            new EnglishWord("congratulations", "Συγχαρητήρια", R.raw.congratulations),
            new EnglishWord("pleased to meet you", "Χάρηκα για τη γνωριμία", R.raw.pleased_to_meet_you),
            new EnglishWord("meet", "γνωρίζω / συναντώ", R.raw.meet),
            new EnglishWord("introduce (someone) to (somebody)", "συστήνω (κάποιον/α) σε (έναν/μία)", R.raw.pleased_to_meet_you),
            new EnglishWord("know", "ξέρω / γνωρίζω", R.raw.know)
    };

    public static final EnglishWord[] basicWords = {
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
            new EnglishWord("can", "μπορώ / μπορείς / μπορεί", R.raw.can),
            new EnglishWord("will", "θα", R.raw.will)
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
