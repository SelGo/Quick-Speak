package selgo.com.quickspeak;

public class EnglishWord {
    private String englishWord;
    private String translatedWord;

    public EnglishWord(String englishWord, String translatedWord) {
        this.englishWord = englishWord;
        this.translatedWord = translatedWord;
    }
    public String getEnglishWord() {
        return englishWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public String toString() {
        return this.englishWord;
    }

}
