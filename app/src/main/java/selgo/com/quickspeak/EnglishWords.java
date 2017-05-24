package selgo.com.quickspeak;

public class EnglishWords {
    private String word;

    public static final EnglishWords[] theAlphabet = {
            new EnglishWords("A a"),
            new EnglishWords("B b"),
            new EnglishWords("C c"),
            new EnglishWords("D d"),
            new EnglishWords("E e"),
            new EnglishWords("F f"),
            new EnglishWords("G g"),
            new EnglishWords("H h"),
            new EnglishWords("I i"),
            new EnglishWords("J j"),
            new EnglishWords("K k"),
            new EnglishWords("L l"),
            new EnglishWords("M m"),
            new EnglishWords("N n"),
            new EnglishWords("O o"),
            new EnglishWords("P p"),
            new EnglishWords("Q q"),
            new EnglishWords("R r"),
            new EnglishWords("S s"),
            new EnglishWords("T t"),
            new EnglishWords("U u"),
            new EnglishWords("V v"),
            new EnglishWords("W w"),
            new EnglishWords("X x"),
            new EnglishWords("Y y"),
            new EnglishWords("Z z")
    };

    public static final EnglishWords[] basicLevelOne = {
            new EnglishWords("man"),
            new EnglishWords("woman"),
            new EnglishWords("I"),
            new EnglishWords("am"),
            new EnglishWords("boy"),
            new EnglishWords("girl"),
            new EnglishWords("a")
    };

    public static final EnglishWords[] basicLevelTwo = {
            new EnglishWords("he"),
            new EnglishWords("she"),
            new EnglishWords("is"),
            new EnglishWords("an"),
            new EnglishWords("apple"),
            new EnglishWords("and"),
            new EnglishWords("eat")
    };

    public static final EnglishWords[] basicLevelThree = {
            new EnglishWords("eats"),
            new EnglishWords("the"),
            new EnglishWords("bread"),
            new EnglishWords("drink"),
            new EnglishWords("water"),
            new EnglishWords("drinks")
    };

    public static final EnglishWords[] basicLevelFour = {
            new EnglishWords("boys"),
            new EnglishWords("girls"),
            new EnglishWords("we"),
            new EnglishWords("read"),
            new EnglishWords("newspaper"),
            new EnglishWords("men"),
            new EnglishWords("women")
    };

    public static final EnglishWords[] basicLevelFive = {
            new EnglishWords("you"),
            new EnglishWords("are"),
            new EnglishWords("milk"),
            new EnglishWords("sandwich"),
            new EnglishWords("rice"),
            new EnglishWords("they"),
            new EnglishWords("child")
    };

    public static final EnglishWords[] basicLevelSix = {
            new EnglishWords("reads"),
            new EnglishWords("book"),
            new EnglishWords("menu"),
            new EnglishWords("it"),
            new EnglishWords("children"),
            new EnglishWords("have"),
            new EnglishWords("has")
    };

    public EnglishWords(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String toString() {
        return this.word;
    }

}
