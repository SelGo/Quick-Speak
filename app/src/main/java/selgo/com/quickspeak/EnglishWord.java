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

    public static final EnglishWord[] basics2 = {
            new EnglishWord("we", "Εμείς"),
            new EnglishWord("they", "Αυτοί"),
            new EnglishWord("the women", "οι γυναίκες"),
            new EnglishWord("the men", "οι άντρες"),
            new EnglishWord("we are", "(εμείς) είμαστε"),
            new EnglishWord("the boys", "τα αγόρια"),
            new EnglishWord("the girls", "τα κορίτσια"),
            new EnglishWord("you", "Εσείς"),
            new EnglishWord("you are", "(Εσείς) είσαστε"),
            new EnglishWord("we drink", "(Εμείς) πίνουμε"),
            new EnglishWord("you drink", "(Εσείς) πίνετε"),
            new EnglishWord("they drink", "(Αυτοί) πίνουν"),
            new EnglishWord("I read", "(Εγώ) διαβάζω"),
            new EnglishWord("you read", "(Εσύ) διαβάζεις"),
            new EnglishWord("he reads", "(Αυτός) διαβάζει"),
            new EnglishWord("the book", "το βιβλιο"),
            new EnglishWord("we read", "(εμείς) διαβάζουμε"),
            new EnglishWord("you read", "(εσείς) διαβάζετε"),
            new EnglishWord("they read", "(αυτοί) διαβάζουν"),
            new EnglishWord("the newspaper", "Η εφημερίδα"),
            new EnglishWord("I write", "(εγώ) γράφω"),
            new EnglishWord("you write", "(εσύ) γράφεις"),
            new EnglishWord("he writes", "(αυτός) γράφει"),
            new EnglishWord("we write", "(εμείς) γράφουμε"),
            new EnglishWord("you write", "(εσείς) γράφετε"),
            new EnglishWord("they write", "(αυτοί) γράφουν"),
            new EnglishWord("I have", "(εγώ) έχω"),
            new EnglishWord("he has", "(αυτός) έχει"),
            new EnglishWord("at", "στο (για μέρη)"),
            new EnglishWord("in", "μέσα στο"),
    };

    public static final EnglishWord[] phrases = {
            new EnglishWord("hello", "γειά"),
            new EnglishWord("goodbye", "αντίο"),
            new EnglishWord("yes", "ναί"),
            new EnglishWord("no", "όχι"),
            new EnglishWord("not", "δεν"),
            new EnglishWord("good morning", "καλημέρα"),
            new EnglishWord("good evening", "καληνύχτα"),
            new EnglishWord("thank you", "ευχαριστώ"),
            new EnglishWord("you are welcome", "παρακαλώ"),
            new EnglishWord("please", "παρακαλώ (ζήτηση)"),
            new EnglishWord("sorry", "συγνώμη")
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




}
