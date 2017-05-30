package selgo.com.quickspeak;


public class EnglishWord {
    private String englishWord;
    private String translatedWord;

    public EnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public EnglishWord(String englishWord, String translatedWord) {
        this.englishWord = englishWord;
        this.translatedWord = translatedWord;
    }

    public static final EnglishWord[] theAlphabet = {
            new EnglishWord("A a"),
            new EnglishWord("B b"),
            new EnglishWord("C c"),
            new EnglishWord("D d"),
            new EnglishWord("E e"),
            new EnglishWord("F f"),
            new EnglishWord("G g"),
            new EnglishWord("H h"),
            new EnglishWord("I i"),
            new EnglishWord("J j"),
            new EnglishWord("K k"),
            new EnglishWord("L l"),
            new EnglishWord("M m"),
            new EnglishWord("N n"),
            new EnglishWord("O o"),
            new EnglishWord("P p"),
            new EnglishWord("Q q"),
            new EnglishWord("R r"),
            new EnglishWord("S s"),
            new EnglishWord("T t"),
            new EnglishWord("U u"),
            new EnglishWord("V v"),
            new EnglishWord("W w"),
            new EnglishWord("X x"),
            new EnglishWord("Y y"),
            new EnglishWord("Z z")
    };

    public static final EnglishWord[] basics1 = {
            new EnglishWord("I", "Εγώ"),
            new EnglishWord("the boy", "το αγόρι"),
            new EnglishWord("the girl", "το κορίτσι"),
            new EnglishWord("the man", "ο άντρας"),
            new EnglishWord("the woman", "η γυναίκα"),
            new EnglishWord("I am", "(εγώ) είμαι"),
            new EnglishWord("the apple", "το μήλο"),
            new EnglishWord("he eats", "(αυτός) τρώει"),
            new EnglishWord("he", "αυτός"),
            new EnglishWord("she", "αυτή"),
            new EnglishWord("he is", "(αυτός) είναι"),
            new EnglishWord("you", "εσύ"),
            new EnglishWord("the", "το"),
            new EnglishWord("I drink", "(εγώ) πίνω"),
            new EnglishWord("you drink", "(εσύ) πίνεις"),
            new EnglishWord("he drinks", "(αυτός) πίνει"),
            new EnglishWord("I eat", "(εγω) τρώω"),
            new EnglishWord("you eat", "(εσύ) τρώς"),
            new EnglishWord("the water", "το νερό"),
            new EnglishWord("the sugar", "η ζάχαρη"),
            new EnglishWord("the bread", "το ψωμί")
    };

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }




}
